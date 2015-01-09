package com.example.tumb1r;

import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tumblr.api.PostsItemType;

public class PhotoActivity extends Activity {

	private PostsItemType post;
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
				post = (PostsItemType) intent
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

				final String urlString = post.getPhotos().getPhotosItemTypeItem().get(0).getOriginalSize().getUrl();

				Thread t = new Thread() {
					public void run() {
						try {
							URL url = new URL(urlString);
							Log.i("XXX", "Photo " + post.getPhotos().getPhotosItemTypeItem().get(0).getOriginalSize().getUrl());
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

}
