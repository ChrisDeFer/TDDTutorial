package com.ynap.tdd.search;

public class Product {
	
	Attribute attribute;
	
	public boolean matches(SearchCriterea searchCriterea) {
		if(attribute == null) {
			return false;
		} else {
			return attribute.getFacet().equals(searchCriterea.getAttribute().getFacet());
		}
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

}
