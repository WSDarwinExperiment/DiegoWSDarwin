package com.example.tumb1r;

public class AudioPost extends Post {

	private String caption;
	
	public AudioPost(long id, String type, long timestamp, String state, String tags, String caption) {
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
		return caption;
	}
}
