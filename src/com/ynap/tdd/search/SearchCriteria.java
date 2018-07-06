package com.ynap.tdd.search;

public class SearchCriteria {

	MatchingAttribute matchingAttribute;
	
	public SearchCriteria(MatchingAttribute matchingAttribute) {
		this.matchingAttribute = matchingAttribute;
	}
	
	public MatchingAttribute getMatchingAttribute() {
		return matchingAttribute;
	}

	public void setMatchingAttribute(MatchingAttribute matchingAttribute) {
		this.matchingAttribute = matchingAttribute;
	}
	
}
