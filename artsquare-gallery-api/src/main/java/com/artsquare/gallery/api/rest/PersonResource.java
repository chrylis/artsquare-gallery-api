package com.artsquare.gallery.api.rest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.hateoas.ResourceSupport;

public class PersonResource extends ResourceSupport {

	private String displayName;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	private Set<String> nicknames = new HashSet<>();

	public void addNickname(String nickname) {
		nicknames.add(nickname);
	}

	public boolean removeNickname(String nickname) {
		return nicknames.remove(nickname);
	}

	public void clearNicknames() {
		nicknames.clear();
	}
}
