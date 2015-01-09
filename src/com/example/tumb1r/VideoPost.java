package com.example.tumb1r;

public class VideoPost extends Post {

	private String caption;
	
	public VideoPost(long id, String type, long timestamp, String state, String tags, String caption) {
		super(id, type, timestamp, state, tags);
		this.caption = caption;
	}
	

	public String getCaption() {
		return caption;
	}


	public void setCaption(String caption) {
		this.caption = caption;
	}


	@Override
	public String toString() {
		return caption + "(" + this.getType() + ")";
	}
	
	public String getHeader() {
		return this.shortenString(caption);
	}
}
