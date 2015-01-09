package com.example.tumb1r;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import android.text.Html;
import android.util.Log;

public class TumblrManager {

	private static final String BASE_URL = "http://api.tumblr.com/v2/blog/";

	public TumblrManager() {
	}

	public List<Post> getPosts(String blog) {
		return getPosts(blog, -1, -1);
	}

	public List<Post> getPosts(String blog, int offset, int limit) {
		List<Post> result = new ArrayList<Post>();

		String fullUrl = BASE_URL + blog + "/posts?api_key="
				+ MainActivity.API_KEY;

		if (offset > 0) {
			fullUrl += "&offset=" + offset;
		}

		if (limit > 0) {
			fullUrl += "&limit=" + limit;
		}

		HttpClient httpClient = new DefaultHttpClient();
		HttpGet request = new HttpGet(fullUrl);

		HttpResponse response;
		try {
			response = httpClient.execute(request);

			String json = getEntityContent(response);

			JSONObject jObject = new JSONObject(json);
			JSONObject meta = jObject.getJSONObject("meta");
			int status = meta.getInt("status");

			if (status == 200) {
				JSONObject postsResponse = jObject.getJSONObject("response");
				JSONArray postsArrayResponse = postsResponse
						.getJSONArray("posts");

				for (int i = 0; i < postsArrayResponse.length(); i++) {
					JSONObject post = postsArrayResponse.getJSONObject(i);

					// Pulling items from the array
					long id = post.getInt("id");
					String type = post.getString("type");
					long timestamp = post.getInt("timestamp");
					String state = post.getString("state");
					String tags = "["; 
					
					JSONArray tagsArray = post.getJSONArray("tags");
					
					for (int j = 0; j < tagsArray.length(); j++) {
						tags += tagsArray.getString(j) + ", ";
					}
					tags += "]";
					
					if ("text".equals(type)) {
						String title = post.getString("title");
						String body = Html.fromHtml(post.getString("body"))
								.toString();

						TextPost newPost = new TextPost(id, type, timestamp, state, tags,
								title, body);
						result.add(newPost);
					} else if ("photo".equals(type)) {
						List<String> photos = new ArrayList<String>();
						String caption = Html.fromHtml(
								post.getString("caption")).toString();

						JSONArray photoArray = post.getJSONArray("photos");
						for (int j = 0; j < photoArray.length(); j++) {
							JSONObject photo = photoArray.getJSONObject(j)
									.getJSONObject("original_size");
							String url = photo.getString("url");
							photos.add(url);
						}

						PhotoPost newPost = new PhotoPost(id, type, timestamp, state, tags,
								caption, photos);
						result.add(newPost);
					} else if ("quote".equals(type)) {
						String text = Html.fromHtml(post.getString("text"))
								.toString();
						String source = post.getString("source");

						QuotePost newPost = new QuotePost(id, type, timestamp, state, tags,
								text, source);
						result.add(newPost);
					} else if ("link".equals(type)) {
						String title = Html.fromHtml(post.getString("title"))
								.toString();
						String url = post.getString("url");

						LinkPost newPost = new LinkPost(id, type, timestamp, state, tags,
								title, url);
						result.add(newPost);
					} else if ("chat".equals(type)) {
						String title = Html.fromHtml(post.getString("title"))
								.toString();
						String body = post.getString("body");

						ChatPost newPost = new ChatPost(id, type, timestamp, 
								state, tags, title, body);
						result.add(newPost);
					} else if ("audio".equals(type)) {
						String caption = Html.fromHtml(
								post.getString("caption")).toString();

						AudioPost newPost = new AudioPost(id, type, timestamp,
								state, tags, caption);
						result.add(newPost);
					} else if ("video".equals(type)) {
						String caption = Html.fromHtml(
								post.getString("caption")).toString();

						VideoPost newPost = new VideoPost(id, type, timestamp,
								state, tags, caption);
						result.add(newPost);
					} else if ("answer".equals(type)) {
						String askingName = post.getString("asking_name");
						String askingUrl = post.getString("asking_url");
						String question = Html.fromHtml(
								post.getString("question")).toString();
						String answer = post.getString("answer");

						AnswerPost newPost = new AnswerPost(id, type,
								timestamp, state, tags, askingName, askingUrl,
								question, answer);
						result.add(newPost);
					} else {

						Post newPost = new Post(id, type, timestamp, state, tags);
						result.add(newPost);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public String getEntityContent(HttpResponse response) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(response
				.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		return result.toString();
	}
}
