package com.ynap.tdd.search;

import com.ynap.tdd.search.weight.Important;
import com.ynap.tdd.search.weight.MustMatch;
import com.ynap.tdd.search.weight.Weight;

public enum Facet {
	
	CATEGORY(new MustMatch()),
	PATTERN(new Important()),
	SIZE(new Important()),
	PRICE(new Important());
	
	private Weight weight;
	
	Facet(Weight weight){
		this.weight = weight;
	}

	public Weight weight() {
		return weight;
	}

	
}
