package com.artsquare.gallery.api.rest;

import java.util.Set;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.roo.addon.javabean.RooJavaBean;

@RooJavaBean
public class WorkResource extends ResourceSupport {
	private String canonicalTitle;
	
	private Set<String> alternateTitles;
	
	private String description;
}
