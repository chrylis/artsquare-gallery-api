package com.artsquare.gallery.api.rest.v0.digitization

import groovy.transform.CompileStatic
import groovy.transform.ToString

import com.artsquare.gallery.api.rest.v0.HasPrincipal
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include

@JsonInclude(Include.NON_NULL)
@CompileStatic
@ToString
class OnSiteBookingResource implements HasPrincipal {

    String artist
    
    final String principal() { artist }

    String service

    Map<Pricing.PerWork, Integer> worksBooked = new EnumMap(Pricing.PerWork)

    Set<Pricing.PerSession> options = EnumSet.noneOf(Pricing.PerSession)

    Date requestedTime
    
    String promoCode

    String note
}
