package com.ynap.tdd.search;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SearchTest {

	@Test
	public void matchesNothingWhenProductIsEmpty() {
		Product product = new Product();
		boolean result = product.matches();
		assertThat(result, is(false));
	}
	
	@Test
	public void matchesWhenProductContainsMatchingAttribute() {
		Product product = new Product();
		MatchingAttribute attr = new MatchingAttribute("Colour", "Red");
		product.add(attr);
		
		boolean result = product.matches();
		
		assertThat(result, is(true));
	}

}
