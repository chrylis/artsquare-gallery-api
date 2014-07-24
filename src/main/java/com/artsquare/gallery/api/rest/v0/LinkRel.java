package com.artsquare.gallery.api.rest.v0;

/**
 * A list of the standard custom link relations used in the Gallery API.
 * Whenever possible, relations listed at
 * <a href="http://microformats.org/wiki/existing-rel-values">microformats.org</a>
 * have been used.
 *
 * @author Christopher Smith
 *
 */
public final class LinkRel {

	private LinkRel() {
	}

	/**
	 * Profile picture. Following <a href="https://developers.facebook.com/docs/graph-api/reference/user/picture/">
	 * Facebook's API</a>, this links directly to the requested image (via a 302).
	 *
	 */
	public static final String PICTURE = "picture";

	/**
	 * Collection resource containing the works this person has contributed to.
	 */
	public static final String WORKS = "works";

	/**
	 * Resource representing the person identified as this work's primary artist.
	 */
	public static final String ARTIST = "artist";

	/**
	 * Resource representing the owner of a resource such as a collection.
	 */
	public static final String OWNER = "owner";
}
