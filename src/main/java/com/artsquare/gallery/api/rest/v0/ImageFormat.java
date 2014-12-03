package com.artsquare.gallery.api.rest.v0;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Values representing the format for rendered images.
 *
 * @author Christopher Smith
 *
 */
public enum ImageFormat {
    JPEG("jpg"),

    WEBP("webp");

    private String extension;

    private ImageFormat(final String extension) {
        this.extension = extension;
    }

    @JsonValue
    public String getExtension() {
        return extension;
    }
}
