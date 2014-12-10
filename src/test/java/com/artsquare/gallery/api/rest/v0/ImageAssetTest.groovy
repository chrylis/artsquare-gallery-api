package com.artsquare.gallery.api.rest.v0

import static org.junit.Assert.*
import groovy.transform.CompileStatic;

import org.junit.BeforeClass
import org.junit.Ignore;
import org.junit.Test

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

@CompileStatic
class ImageAssetTest {

    private static ObjectMapper mapper

    @BeforeClass
    static void createMapper() {
        mapper = new ObjectMapper()
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true)
    }

    @Ignore
    @Test
    void test() {
        ImageAsset ia = new ImageAsset(
                uploaded: new Date(),
                owner: "foo",
                uploader:"bar"
                )

        ia.displayImages[DisplayIntent.TILE] = new ImageInfo(
                width: 192,
                height: 192,
                bytes: 15000,
                format: ImageFormat.JPEG
                )

        ia.displayImages[DisplayIntent.THUMBNAIL] = new ImageInfo(
                width: 64,
                height: 64,
                bytes: 4000,
                format: ImageFormat.WEBP
                )


        println mapper.writeValueAsString(ia)

        fail("Not yet implemented")
    }
}
