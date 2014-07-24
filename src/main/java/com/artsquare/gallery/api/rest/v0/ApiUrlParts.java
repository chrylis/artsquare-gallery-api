package com.artsquare.gallery.api.rest.v0;

public final class ApiUrlParts {

	public static final String ID_PATHVAR = "/{id}";
	
	public static final String PERSON_BASE = "/p";
	public static final String PERSON = PERSON_BASE + ID_PATHVAR;
	
	public static final String WORK_BASE = "/w";
	public static final String WORK = WORK_BASE + ID_PATHVAR;
	
	private ApiUrlParts() {
	}
}
