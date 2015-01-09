package com.example.tumb1r;

import java.util.List;

public class PhotoPost extends Post {

	private String caption;
	private List<String> photos;

	public PhotoPost(long id, String type, long timestamp, String state, String tags, String caption,
			List<String> photos) {
		super(id, type, timestamp, state, tags);
		this.caption = caption;
		this.photos = photos;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return this.shortenString(caption) + "\n" + this.getDate() + "\n(" + this.getType() + ")";
	}
	
	public String getHeader() {
		return this.shortenString(caption);
	}
}
