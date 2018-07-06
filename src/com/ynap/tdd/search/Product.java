package com.ynap.tdd.search;

public class Product {

	MatchingAttribute matchingAttr;
	
	public boolean matches(SearchCriteria searchCriteria) {
		return matchingAttr != null
				&& matchingAttr.matches(searchCriteria);
	}

	public void add(MatchingAttribute attr) {
		matchingAttr = attr;
	}

}
