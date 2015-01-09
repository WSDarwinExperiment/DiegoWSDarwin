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
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DetailFiveActivity extends ActionBarActivity {

	private static final int MAX_POSTS = 5;

	public static final String POST_OBJECT = "POST_OBJECT";

	private String blog;
	private ListView blogList;
	private List<Post> posts;
	private DetailedAdapter postsViewAdapter;
	private TumblrManager tumblrManager;
	private int curFirstPost = 0;

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
		setContentView(R.layout.activity_detail_five);

		blogList = (ListView) findViewById(R.id.blogList);
	}

	protected void onStart() {
		super.onStart();
		posts = new ArrayList<Post>();
		postsViewAdapter = new DetailedAdapter(this, posts);
		blogList.setAdapter(postsViewAdapter);

		tumblrManager = new TumblrManager();
		curFirstPost = 0;

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
				Post post = posts.get(pos);

				Intent intent = null;

				if (post.getType().equals("text")) {
					intent = new Intent(mContext, TextActivity.class);
				} else if (post.getType().equals("photo")) {
					intent = new Intent(mContext, PhotoActivity.class);
				} else if (post.getType().equals("link")) {
					Intent browse = new Intent(Intent.ACTION_VIEW, Uri
							.parse(((LinkPost) post).getUrl()));

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
		Thread thread = new SearchThread(curFirstPost, MAX_POSTS);
		thread.start();
	}

	public void next(View view) {
		curFirstPost += MAX_POSTS;

		posts.clear();
		Thread thread = new SearchThread(curFirstPost, MAX_POSTS);
		thread.start();
	}

	public void prev(View view) {
		curFirstPost -= MAX_POSTS;

		if (curFirstPost < 0) {
			curFirstPost = 0;
		}

		posts.clear();
		Thread thread = new SearchThread(curFirstPost, MAX_POSTS);
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
			intent = new Intent(this, BlogListActivity.class);
			intent.putExtra(MainActivity.BLOG_NAME, blog);
			startActivity(intent);

			return true;
		case R.id.action_detail5:
			// Do nothing, we are here
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	class SearchThread extends Thread {
		int offset;
		int limit;

		public SearchThread(int offset, int limit) {
			this.offset = offset;
			this.limit = limit;
		}

		@Override
		public void run() {
			posts.clear();
			posts.addAll(tumblrManager.getPosts(blog, offset, limit));
			runOnUiThread(doUpdateGUIList);
		}
	}
}
