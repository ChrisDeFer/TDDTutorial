package com.ynap.tdd.search;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SearchTest {
	
	Product product;
	
	MatchingAttribute attrColourRed;
	MatchingAttribute attrColourYellow;
	MatchingAttribute attrSizeM;
	
	@Before
	public void createProduct() {
		product = new Product();
	}
	
	@Before
	public void createAttrubutes() {
		attrColourRed = new MatchingAttribute("Colour", "Red");
		attrColourYellow = new MatchingAttribute("Colour", "Yellow");
		attrSizeM = new MatchingAttribute("Size", "M");
	}

	@Test
	public void matchesNothingWhenProductIsEmpty() {
		SearchCriteria searchCriteria = new SearchCriteria(attrColourRed);
		boolean result = product.matches(searchCriteria);
		assertThat(result, is(false));
	}
	
	@Test
	public void matchesWhenProductContainsMatchingAttribute() {
		SearchCriteria searchCriteria = new SearchCriteria(attrColourRed);
		product.add(attrColourRed);
		assertThat(product.matches(searchCriteria), is(true));
	}
	
	@Test
	public void doesNotMatchWhenNoMatchingAttribute() {
		SearchCriteria searchCriteria = new SearchCriteria(attrColourYellow);
		product.add(attrColourRed);
		assertThat(product.matches(searchCriteria), is(false));
	}
	
	@Test
	public void matchesWhenProductContainsMultipleAttributes() {
		SearchCriteria searchCriteria = new SearchCriteria(attrColourYellow);
		product.add(attrColourRed);
		product.add(attrColourYellow);
		assertThat(product.matches(searchCriteria), is(true));
	}

}
