package com.artsquare.gallery.api.rest.v0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WorkCollectionResource extends ResourceWithPicture {

	private List<WorkResource> works = Collections.emptyList();

	public Collection<WorkResource> getWorks() {
		return works;
	}

	public void setWorks(Collection<WorkResource> works) {
		this.works = new ArrayList<>(works);
	}

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
