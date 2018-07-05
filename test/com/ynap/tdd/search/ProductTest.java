package com.ynap.tdd.search;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class ProductTest {

	@Test
	public void matchesNothingWhenProductIsEmpty() {
		Product product = new Product();
		Attribute attribute = new Attribute(Facet.CATEGORY, "Dress");
		SearchCriterea searchCriterea = new SearchCriterea(attribute);
		
		boolean result = product.matches(searchCriterea);
		
		assertThat(result, is(false));
	}
	
	@Test
	public void matchesWhenProductContainsMatchingAttribute() {
		
		Attribute attribute = new Attribute(Facet.CATEGORY, "Dress");
		
		Product product = new Product();
		product.setAttribute(attribute);
		SearchCriterea searchCriterea = new SearchCriterea(attribute);
		
		boolean result = product.matches(searchCriterea);
		
		assertThat(result, is(true));
		
	}

}
