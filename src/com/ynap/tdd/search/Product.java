package com.ynap.tdd.search;

public class Product {

	MatchingAttribute matchingAttr;
	
	public boolean matches() {
		return false;
	}

	public void add(MatchingAttribute attr) {
		matchingAttr = attr;
	}

}
