package com.example.tumb1r;

public class ChatPost extends Post {

	private String title;
	private String body;
	
	public ChatPost(long id, String type, long timestamp, String state, String tags, String title, String body) {
		super(id, type, timestamp, state, tags);
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
		return title + "(" + this.getType() + ")";
	}
	
	public String getHeader() {
		return title;
	}
}
