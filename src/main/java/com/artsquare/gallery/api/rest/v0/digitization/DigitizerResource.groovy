package com.artsquare.gallery.api.rest.v0.digitization

import groovy.transform.CompileStatic
import groovy.transform.ToString

import org.springframework.hateoas.ResourceSupport

import com.artsquare.gallery.api.rest.v0.Views
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonView
import com.fasterxml.jackson.annotation.JsonInclude.Include

@JsonInclude(Include.NON_NULL)
@CompileStatic
@ToString
class DigitizerResource extends ResourceSupport {

    @JsonView(Views.Summary)
    String name

    @JsonView(Views.Summary)
    String metro

    @JsonView(Views.Public)
    String referralSlug

    @JsonView(Views.Public)
    String shortCode

    @JsonView(Views.Public)
    String slug

    List<String> admins = []

    List<String> uploaders = []

    String phone
}
