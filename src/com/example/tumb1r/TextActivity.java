package com.example.tumb1r;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.tumblr.api.PostsItemType;

public class TextActivity extends Activity {

	private PostsItemType post;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text);

		Intent intent = getIntent();
		if (intent != null) {
			Bundle extras = intent.getExtras();
			if (extras != null) {
				post = (PostsItemType) intent
						.getSerializableExtra(BlogListActivity.POST_OBJECT);
				
				TextView title = (TextView) findViewById(R.id.textTitle);
				TextView body = (TextView) findViewById(R.id.textBody);
				body.setMovementMethod(new ScrollingMovementMethod());
				
				title.setText(post.getTitle());
				body.setText(post.getBody());
			}
		}
	}
}
