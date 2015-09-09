package com.artsquare.gallery.api.rest.v0.digitization

import groovy.transform.CompileStatic
import groovy.transform.ToString

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include

@JsonInclude(Include.NON_NULL)
@CompileStatic
@ToString
class OnSiteBookingResource {

    String artist

    String service

    Map<Pricing.PerWork, Integer> worksBooked

    Set<Pricing.PerSession> options

    Date requestedTime

    String note
}
