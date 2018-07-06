package com.ynap.tdd.search;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class SearchTest {

	@Test
	public void matchesNothingWhenProductIsEmpty() {
		Product product = new Product();
		boolean result = product.matches();
		assertThat(result, is(false));
	}

}
