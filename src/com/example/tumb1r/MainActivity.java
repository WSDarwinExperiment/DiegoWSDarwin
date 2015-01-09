package com.example.tumb1r;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	public static String BLOG_NAME = "BLOG_NAME";
	public static String API_KEY = "PbCFl0ECmBcmnuDBBfGHQBYAylIKJRW71gQzWLn75wdru6E51k";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void showBlogList(View view) {
		TextView blogName = (TextView) findViewById(R.id.editText1);

		String blogNameString = blogName.getText().toString();

		if (blogNameString.trim().length() > 0) {
			Intent intent = new Intent(this, BlogListActivity.class);
			intent.putExtra(MainActivity.BLOG_NAME, blogNameString);
			startActivity(intent);
		} else {
			Toast.makeText(this, "Invalid blog name", Toast.LENGTH_LONG).show();
		}
	}

}
