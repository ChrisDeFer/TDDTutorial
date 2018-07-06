package com.ynap.tdd.search;

public class Product {

	MatchingAttribute matchingAttr;
	
	public boolean matches() {
		return matchingAttr != null;
	}

	public void add(MatchingAttribute attr) {
		matchingAttr = attr;
	}

}
