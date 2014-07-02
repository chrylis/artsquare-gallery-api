package com.artsquare.gallery.api.rest;

import java.util.Set;

import org.springframework.hateoas.ResourceSupport;

public class WorkResource extends ResourceSupport {
	private String canonicalTitle;

	public String getCanonicalTitle() {
		return canonicalTitle;
	}

	public void setCanonicalTitle(String canonicalTitle) {
		this.canonicalTitle = canonicalTitle;
	}

	private Set<String> alternateTitles;

	public Set<String> getAlternateTitles() {
		return alternateTitles;
	}

	public void setAlternateTitles(Set<String> alternateTitles) {
		this.alternateTitles = alternateTitles;
	}

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
