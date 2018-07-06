package com.ynap.tdd.search;

public class MatchingAttribute {
	
	private String name;
	private String value;
	
	public MatchingAttribute(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean matches(SearchCriteria searchCriteria) {
		return getName().equals(searchCriteria.getMatchingAttribute().getName())
				&& getValue().equals(searchCriteria.getMatchingAttribute().getValue());
	}
	
}
