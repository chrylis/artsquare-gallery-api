package com.artsquare.gallery.api.rest.v0

import groovy.transform.CompileStatic

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include

@JsonInclude(Include.NON_NULL)
@CompileStatic
class WorkResource extends ResourceWithPicture {
    String title

    String description

    Integer year
}
