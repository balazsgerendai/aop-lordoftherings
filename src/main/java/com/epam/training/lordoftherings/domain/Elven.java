package com.epam.training.lordoftherings.domain;

public class Elven extends Person {
	private final Race RACE = Race.ELVEN;
	
	public Elven() {
		super();
	}

	public Race getRACE() {
		return RACE;
	}

	@Override
	public String battleCry() {
		return "For ELRON!";
	}

}
