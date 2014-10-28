package com.artsquare.gallery.api.rest.v0

import groovy.transform.CompileStatic

@CompileStatic
class WorkCollectionResource extends ResourceWithPicture {

    String title

    String description

    List<WorkResource> works = Collections.emptyList()

    Collection<WorkResource> getWorks() {
        return works
    }

    void setWorks(final Collection<WorkResource> works) {
        this.works = new ArrayList<>(works)
    }
}
