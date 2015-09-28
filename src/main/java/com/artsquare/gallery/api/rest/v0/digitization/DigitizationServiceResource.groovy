package com.artsquare.gallery.api.rest.v0.digitization

import groovy.transform.CompileStatic
import groovy.transform.ToString

import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

import org.springframework.hateoas.ResourceSupport

import com.artsquare.gallery.api.rest.v0.LinkRel
import com.artsquare.gallery.api.rest.v0.Views
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonView
import com.fasterxml.jackson.annotation.JsonInclude.Include

@JsonInclude(Include.NON_NULL)
@CompileStatic
@ToString
class DigitizationServiceResource extends ResourceSupport {

    @JsonIgnore
    String getDigitizer() {
        getLink(LinkRel.DIGITIZER)?.href
    }

    @JsonView(Views.Summary)
    String dbId

    @JsonView(Views.Summary)
    String digitizerId

    String contactKey

    @JsonView(Views.Summary)
    String name

    @JsonView(Views.Public)
    String slug
    
    @JsonView(Views.Summary)
    String metro

    /**
     * Pricing parameters dependent on number of works. This will always include at least a
     * {@code BASE} price; if the digitizer handles reflective or oversize, then those will be included
     * as well.
     *
     * These are represented here as floating-point values for dollars, as JSON treats everything as a
     * Number.
     */
    @JsonView(Views.Summary)
    Map<Pricing.PerWork, Double> perWorkPricing = new EnumMap(Pricing.PerWork)

    /**
     * Pricing parameters not dependent on number of works. If the digitizer offers delivery
     * or rush booking, these will be included here.
     *
     * These are represented here as floating-point values for dollars, as JSON treats everything as a
     * Number.
     */
    @JsonView(Views.Summary)
    Map<Pricing.PerSession, Double> perSessionPricing = new EnumMap(Pricing.PerSession)

    
    /* ---------- scheduling ---------- */

    /**
     * A time zone name, expected to be understood by Java 8's {@code ZoneId} or Joda-Time's {@code DateTimeZone}.    
     */
    @JsonView(Views.Public)
    String timezone
    
    /**
     * How far the digitizer will travel from the standard location, if travel is offered.
     */
    @JsonView(Views.Public)
    Integer travelRadiusMiles

    /**
     * The minimum session size required.
     */
    @JsonView(Views.Summary)
    @NotNull
    @Min(1L)
    Integer minimumWorks

    /**
     * The minimum notice required, in days, for a normal booking.
     */
    @JsonView(Views.Summary)
    @NotNull
    @Min(1L)
    Integer leadTime

    /**
     * The minimum notice required, in days, for a rush booking.
     */
    @JsonView(Views.Public)
    @Min(1L)
    Integer rushLeadTime


    /* ---------- process details ---------- */

    /**
     * The number of edit requests that will normally be handled.
     */
    @JsonView(Views.Public)
    @NotNull
    @Min(1L)
    Integer editRounds

    /**
     * The usual image size in pixels at the best aspect ratio.
     */
    @JsonView(Views.Public)
    Integer[] pixelSize = [0, 0] as Integer[]
}
