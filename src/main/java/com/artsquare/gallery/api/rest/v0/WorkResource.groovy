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

    String slug

    Boolean visible

    Boolean adult

    /*
     * The following are linked resources. For pragmatic reasons, they are represented
     * inline by ID rather than link. This will be revisited, especially if Spring HATEOAS
     * starts providing helpful methods for parsing URIs into domain specifiers.
     */

    String artist

    String mainImage

    void setMainImage(String mainImage) {
        this.mainImage = mainImage

        if(!allImages.contains(mainImage)) {
            allImages << mainImage
        }
    }

    List<String> allImages

    @Override
    String toString() {
        "Work[$title by $artist]"
    }
}
