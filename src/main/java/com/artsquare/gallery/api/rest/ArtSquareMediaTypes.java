package com.artsquare.gallery.api.rest;

import org.springframework.http.MediaType;

/**
 * Constants for the media types used for the ArtSquare REST API.
 *
 * @see MediaType
 * @author Christopher Smith
 *
 */
public final class ArtSquareMediaTypes {

    public static final String APPLICATION_ARTSQUARE_V0_VALUE = "application/vnd.artsquare.v0+json";

    public static final MediaType APPLICATION_ARTSQUARE_V0 = MediaType.valueOf(APPLICATION_ARTSQUARE_V0_VALUE);

    private ArtSquareMediaTypes() {
    }
}
