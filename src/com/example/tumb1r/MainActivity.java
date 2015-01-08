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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
