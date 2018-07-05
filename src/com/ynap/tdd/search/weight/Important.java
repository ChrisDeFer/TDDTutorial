package com.ynap.tdd.search.weight;

public class Important implements Weight {

	private final int weight = 5;
	
	@Override
	public boolean mustMatch() {
		return false;
	}

	@Override
	public int getWeight() {
		return weight;
	}

}
