package com.artsquare.gallery.api.rest.v0

import groovy.transform.CompileStatic;

/**
 * Represents the size (both in pixels and in bytes) of an image.
 * @author Christopher Smith
 *
 */
@CompileStatic
class ImageSize {

    /**
     * The width of this image in pixels.
     */
    Integer width

    /**
     * The height of this image in pixels.
     */
    Integer height

    /**
     * The size of this image in bytes.
     */
    Integer bytes

    public ImageSize() {
    }

    public ImageSize(final int width, final int height) {
        this.width = width
        this.height = height
    }

    public ImageSize(final int width, final int height, final int bytes) {
        this(width, height)
        this.bytes = bytes
    }
}
