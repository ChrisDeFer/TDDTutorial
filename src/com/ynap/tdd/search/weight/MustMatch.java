package com.ynap.tdd.search.weight;

public class MustMatch implements Weight{

	private final int weight = 10;
	
	@Override
	public boolean mustMatch() {
		return true;
	}

	@Override
	public int getWeight() {
		return weight;
	}

}
