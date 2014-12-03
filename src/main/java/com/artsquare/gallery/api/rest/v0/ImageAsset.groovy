package com.artsquare.gallery.api.rest.v0

import groovy.transform.CompileStatic

import org.springframework.hateoas.ResourceSupport

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include

@JsonInclude(Include.NON_NULL)
@CompileStatic
class ImageAsset extends ResourceSupport {
    Date uploaded

    String uploader

    String owner

    String note

    ImageInfo originalInfo

    Map<DisplayIntent, ImageInfo> displayImages = new EnumMap(DisplayIntent)
}
