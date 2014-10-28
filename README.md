artsquare-gallery-api [![build status](https://travis-ci.org/chrylis/artsquare-gallery-api.svg?branch=develop)](https://travis-ci.org/chrylis/artsquare-gallery-api/)
=====================

This project contains the resource definitions for the ArtSquare Gallery REST API.

The classes in this project are used by Gallery to represent the resources in the
system and are translated directly into JSON when returned over HTTP. Clients written
in Java (e.g., for Android) can map the responses back onto these classes if desired.

This project is versioned by the Java package namespace; the current version, v0, is
pre-deprecated and is not publicly supported. It contains a number of simplifications
in the representations of snippets and linked entities pending stabilization in some
of the details surrounding CURIEs and `_embedded` entities in HAL and the corresponding
serialization support in Spring HATEOAS.

This library uses Groovy to substantially reduce the boilerplate needed, since most
of the classes in it are DTOs. All Groovy classes are annotated `@CompileStatic`, and
the library should be usable normally from any Java client application.