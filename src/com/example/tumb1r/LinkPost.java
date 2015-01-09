package com.example.tumb1r;

public class LinkPost extends Post {

	private String title;
	private String url;
	
	public LinkPost(long id, String type, long timestamp, String state, String tags, String title, String url) {
		super(id, type, timestamp, state, tags);
		this.title = title;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return title + "\n" + this.getDate() + "\n(" + this.getType() + ")";
	}
	
	public String getHeader() {
		return title;
	}
}
