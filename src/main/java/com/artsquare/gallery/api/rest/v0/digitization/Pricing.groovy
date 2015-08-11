package com.artsquare.gallery.api.rest.v0.digitization

/**
 * Contains various enums used as keys to keep track of pricing parameters.
 *
 * @author Christopher Smith
 *
 */
final class Pricing {

    private Pricing() {}

    enum PerWork {
        BASE,
        REFLECTIVE,
        OVERSIZE
    }

    enum PerSession {
        TRAVEL,
        RUSH_BOOKING
    }
}
