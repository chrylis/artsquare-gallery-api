package com.artsquare.gallery.api.rest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.roo.addon.javabean.RooJavaBean;

@RooJavaBean
public class PersonResource extends ResourceSupport {
	
	private String displayName;
	
	private Set<String> nicknames = new HashSet<>();
	
	private String legalName;
	
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
