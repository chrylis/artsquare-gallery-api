package com.artsquare.gallery.api.rest.v0;

/**
 * Indicates the status of an uploaded work image. If the image is uploaded by
 * a third party, the artist is asked to review it for quality and correctness.
 *
 * @author Christopher Smith
 *
 */
public enum ImageWorkflowStatus {
    OK,
    PENDING_REVIEW,
    REJECTED;
}
