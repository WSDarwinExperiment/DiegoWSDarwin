package com.example.tumb1r;

import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PhotoActivity extends Activity {

	private PhotoPost post;
	Bitmap bmp;
	ImageView imageView;

	// Thread to update adapter after an operation
	private Runnable doUpdateGUI = new Runnable() {
		public void run() {
			imageView.setImageBitmap(bmp);
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photo);

		Intent intent = getIntent();
		if (intent != null) {
			Bundle extras = intent.getExtras();
			if (extras != null) {
				post = (PhotoPost) intent
						.getSerializableExtra(BlogListActivity.POST_OBJECT);

				TextView title = (TextView) findViewById(R.id.textTitle);
				title.setText(post.getCaption());

				// LinearLayOut Setup
				LinearLayout linearLayout = new LinearLayout(this);
				linearLayout.setOrientation(LinearLayout.VERTICAL);

				linearLayout.setLayoutParams(new LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

				// for (int i = 0; i < post.getPhotos().size(); i++) {
				imageView = new ImageView(this);
				imageView.setLayoutParams(new LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

				final String urlString = post.getPhotos().get(0);

				Thread t = new Thread() {
					public void run() {
						try {
							URL url = new URL(urlString);
							Log.i("XXX", post.getPhotos().get(0));
							bmp = BitmapFactory.decodeStream(url
									.openConnection().getInputStream());

							runOnUiThread(doUpdateGUI);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				t.start();

				// adding view to layout
				linearLayout.addView(imageView);
				// }

				// make visible to program
				LinearLayout container = (LinearLayout) findViewById(R.id.photoContainer);
				container.addView(linearLayout);
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photo, menu);
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
