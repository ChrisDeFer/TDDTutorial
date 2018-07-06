package com.ynap.tdd.search;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SearchTest {

	@Test
	public void matchesNothingWhenProductIsEmpty() {
		Product product = new Product();
		MatchingAttribute attr = new MatchingAttribute("Colour", "Red");
		SearchCriteria searchCriteria = new SearchCriteria(attr);
		boolean result = product.matches(searchCriteria);
		assertThat(result, is(false));
	}
	
	@Test
	public void matchesWhenProductContainsMatchingAttribute() {
		Product product = new Product();
		MatchingAttribute attr = new MatchingAttribute("Colour", "Red");
		SearchCriteria searchCriteria = new SearchCriteria(attr);
		product.add(attr);
		
		boolean result = product.matches(searchCriteria);
		
		assertThat(result, is(true));
	}
	
	@Test
	public void doesNotMatchWhenNoMatchingAttribute() {
		Product product = new Product();
		MatchingAttribute attrColourRed = new MatchingAttribute("Colour", "Red");
		MatchingAttribute attrColourYellow = new MatchingAttribute("Colour", "Yellow");
		SearchCriteria searchCriteria = new SearchCriteria(attrColourYellow);
		product.add(attrColourRed);
		
		boolean result = product.matches(searchCriteria);
		
		assertThat(result, is(false));
	}

}
