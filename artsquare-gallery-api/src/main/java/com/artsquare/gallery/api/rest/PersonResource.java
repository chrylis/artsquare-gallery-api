package com.artsquare.gallery.api.rest;

import java.util.Set;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.roo.addon.javabean.RooJavaBean;

@RooJavaBean
public class PersonResource extends ResourceSupport {

	public PersonResource() {
		// TODO Auto-generated constructor stub
	}
	
	private String displayName;
	
	private Set<String> nicknames;
	
	private String legalName;
}
