package com.artsquare.gallery.api.rest.v0

import groovy.transform.CompileStatic

/**
 * Represents the size (both in pixels and in bytes) of an image.
 * @author Christopher Smith
 *
 */
@CompileStatic
class ImageInfo implements Serializable {

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

    /**
     * What format this image is stored in.
     */
    ImageFormat format

    ImageInfo() {
    }

    ImageInfo(final int width, final int height) {
        this.width = width
        this.height = height
    }

    ImageInfo(final int width, final int height, final int bytes, final ImageFormat format) {
        this(width, height)
        this.bytes = bytes
        this.format = format
    }

    @Override
    String toString() {
        if(width == null) {
            return "ImageInfo[unknown]"
        } else if(bytes == null) {
            return "ImageInfo[${width}x${height}]"
        } else if(format == null) {
            return "ImageInfo[${width}x${height}, ${bytes} bytes]"
        } else {
            return "ImageInfo[${width}x${height}, ${bytes} bytes, ${format}]"
        }
    }
}
