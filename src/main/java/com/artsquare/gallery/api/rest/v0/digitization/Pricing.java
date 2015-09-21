package com.artsquare.gallery.api.rest.v0.digitization;

/**
 * Contains various enums used as keys to keep track of pricing parameters.
 *
 * @author Christopher Smith
 *
 */
public final class Pricing {

    private Pricing() {}

    public enum PerWork {
        BASE("works to be digitized"),
        REFLECTIVE("reflective works"),
        OVERSIZE("oversize works");
        
        public final String description;
        
        private PerWork(String description) {
            this.description = description;
        }
    }

    public enum PerSession {
        TRAVEL("travel fee"),
        RUSH_BOOKING("rush fee");
        
        public final String description;
        
        private PerSession(String description) {
            this.description = description;
        }
    }
}
