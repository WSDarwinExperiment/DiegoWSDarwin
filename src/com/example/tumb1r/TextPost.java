package com.example.tumb1r;

public class TextPost extends Post {

	private String title;
	private String body;
	
	public TextPost(long id, String type, long timestamp, String title, String body) {
		super(id, type, timestamp);
		this.title = title;
		this.body = body;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return title + "\n" + this.getDate() + "\n(" + this.getType() + ")";
	}
}
