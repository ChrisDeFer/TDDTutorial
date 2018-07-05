package com.ynap.tdd.search;

public class SearchCriterea {

	Attribute attribute;
	
	public SearchCriterea(Attribute attribute) {
		this.attribute = attribute;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

}
