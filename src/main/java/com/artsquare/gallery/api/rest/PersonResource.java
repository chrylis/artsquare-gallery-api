package com.artsquare.gallery.api.rest;

import org.springframework.hateoas.ResourceSupport;

public class PersonResource extends ResourceSupport {

	private String displayName;

	/**
	 * @return the Person's name formatted for display, in plain text
	 */
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	private String bio;

	/**
	 * @return a short biographical snippet of this Person, in plain text
	 */
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	private String pictureUrl;

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
}
