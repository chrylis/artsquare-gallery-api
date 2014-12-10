package com.artsquare.gallery.api.rest.v0;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.ImmutableMap;

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

    public static final ImmutableMap<String, ImageFormat> BY_EXTENSION;

    static {
        ImmutableMap.Builder<String, ImageFormat> builder = ImmutableMap.builder();
        for(ImageFormat format: ImageFormat.values())
            builder.put(format.getExtension(), format);
        BY_EXTENSION = builder.build();
    }

    public static ImageFormat forExtension(final String extension) {
        ImageFormat format = BY_EXTENSION.get(extension);
        if(format == null)
            throw new IllegalArgumentException("extension " + extension + " does not map to a known image type");
        return format;
    }
}
