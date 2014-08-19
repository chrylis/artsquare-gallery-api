package com.artsquare.gallery.api.rest;

public final class ArtSquareUrls {

	public static final String ID_PATH_VARIABLE = "/{id}";

	public static final String PEOPLE = "/people";
	public static final String PERSON = PEOPLE + ID_PATH_VARIABLE;

	public static final String WORKS = "/works";
	public static final String WORK = WORKS + ID_PATH_VARIABLE;

	private ArtSquareUrls() {
	}
}
