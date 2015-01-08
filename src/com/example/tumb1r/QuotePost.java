package com.example.tumb1r;

public class QuotePost extends Post {

	private String text;
	private String source;
	
	public QuotePost(long id, String type, long timestamp, String text, String source) {
		super(id, type, timestamp);
		this.text = text;
		this.source = source;
	}

	public String getTitle() {
		return text;
	}

	public void setTitle(String title) {
		this.text = title;
	}

	public String getUrl() {
		return source;
	}

	public void setUrl(String url) {
		this.source = url;
	}
	
	@Override
	public String toString() {
		return text + "(" + this.getType() + ")";
	}
}
