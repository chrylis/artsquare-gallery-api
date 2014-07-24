package com.artsquare.gallery.api.rest.v0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

public abstract class ResourceWithPicture extends ResourceSupport {
	public void addPictureLink(String uriTemplate) {
		add(new Link(uriTemplate, LinkRel.PICTURE));
	}

	public String pictureUrlForIntent(DisplayIntent intent) {
		Link picture = getLink(LinkRel.PICTURE);

		if(picture == null)
			return null;

		return picture.expand(Collections.singletonMap(DisplayIntent.DISPLAY_INTENT_URI_PARAMETER, intent)).getHref();
	}

	private Map<String, Identifiable<Link>> _embedded = new HashMap<>();

	public void embed(String linkRel, Identifiable<Link> object) {
		_embedded.put(linkRel, object);
	}

	public Map<String, Identifiable<Link>> get_embedded() {
		return Collections.unmodifiableMap(_embedded);
	}
}
