package com.ynap.tdd.search;

public class Attribute {

	private Facet facet;
	private String value;
	
	public Attribute(Facet facet, String value) {
		this.facet = facet;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Facet getFacet() {
		return facet;
	}

	public void setFacet(Facet facet) {
		this.facet = facet;
	}
	
}
