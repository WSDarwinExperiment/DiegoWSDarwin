package com.example.tumb1r;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.tumblr.api.PostsItemType;
import com.tumblr.api.PostsListType;
import com.tumblr.api.PostsResponseType;
import com.tumblr.api.WSDTumblrManager;

public class BlogListActivity extends ActionBarActivity {

	public static final String POST_OBJECT = "POST_OBJECT";
	public static final String POST_ID = "POST_ID";

	private String blog;
	private ListView blogList;
	private List<PostsItemType> posts;
	private SimpleListAdapter postsViewAdapter;

	private Context mContext = this;

	// Thread to update adapter after an operation
	private Runnable doUpdateGUIList = new Runnable() {
		public void run() {
			postsViewAdapter.notifyDataSetChanged();
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blog_list);

		blogList = (ListView) findViewById(R.id.blogList);
	}

	protected void onStart() {
		super.onStart();
		posts = new ArrayList<PostsItemType>();
		postsViewAdapter = new SimpleListAdapter(this, posts);
		blogList.setAdapter(postsViewAdapter);

		Intent intent = getIntent();
		if (intent != null) {
			Bundle extras = intent.getExtras();
			if (extras != null) {
				blog = extras.getString(MainActivity.BLOG_NAME);
			}
		}

		// Show details when click on a movie
		blogList.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int pos,
					long id) {
				PostsItemType post = posts.get(pos);

				Intent intent = null;

				if (post.getType().equals("text")) {
					intent = new Intent(mContext, TextActivity.class);
				} else if (post.getType().equals("photo")) {
					intent = new Intent(mContext, PhotoActivity.class);
				} else if (post.getType().equals("link")) {
					Intent browse = new Intent(Intent.ACTION_VIEW, Uri
							.parse(post.getUrl()));

					startActivity(browse);
				}

				if (intent != null) {
					intent.putExtra(POST_OBJECT, post);
					startActivity(intent);
				}
			}
		});
	}

	@Override
	protected void onResume() {
		super.onResume();
		// Refresh the list when visible
		posts.clear();
		Thread thread = new SearchThread();
		thread.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.blog_list, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent;

		switch (item.getItemId()) {
		case R.id.action_list:
			// Do nothing, already here
			return true;
		case R.id.action_detail5:
			intent = new Intent(this, DetailFiveActivity.class);
			intent.putExtra(MainActivity.BLOG_NAME, blog);
			startActivity(intent);

			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	class SearchThread extends Thread {

		public SearchThread() {
		}

		@Override
		public void run() {
			posts.clear();
			PostsListType response = WSDTumblrManager
					.v2()
					.blog()
					.resource2(blog)
					.posts()
					.getAsJson(null, null, null, null, null,
							PostsResponseType.class).getResponse().getPosts();

			List<PostsItemType> postsList = response.getPostsItemTypeItem();

			posts.addAll(postsList);

			runOnUiThread(doUpdateGUIList);
		}
	}
}
