package com.ynap.tdd.search;

import java.util.ArrayList;
import java.util.List;

public class Product {

	List<MatchingAttribute> matchingAttrs = new ArrayList<>();
	
	public boolean matches(SearchCriteria searchCriteria) {
			return !matchingAttrs.isEmpty() 
					&& matchingAttrs.stream().anyMatch(a -> a.matches(searchCriteria));
	}

	public void add(MatchingAttribute attr) {
		matchingAttrs.add(attr);
	}

}
