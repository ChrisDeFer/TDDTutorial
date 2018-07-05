package com.ynap.tdd.search;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {
	
	private Product product;
	private Attribute categoryAttribute;
	
	@Before
	public void createProduct() {
		product = new Product();
	}
	
	@Before
	public void createAttribute() {
		categoryAttribute = new Attribute(Facet.CATEGORY, "Dress");
	}

	@Test
	public void matchesNothingWhenProductIsEmpty() {
		SearchCriterea searchCriterea = new SearchCriterea(categoryAttribute);
		assertThat(product.matches(searchCriterea), is(false));
	}
	
	@Test
	public void matchesWhenProductContainsMatchingAttribute() {
		product.setAttribute(categoryAttribute);
		SearchCriterea searchCriterea = new SearchCriterea(categoryAttribute);
		assertThat(product.matches(searchCriterea), is(true));
	}

}
