package com.epam.training.lordoftherings.domain;

public class Hobbit extends Person {
	private final Race RACE = Race.HOBBIT;
	
	public Hobbit() {
		super();
	
	}

	public Race getRACE() {
		return RACE;
	}

	@Override
	public String battleCry() {
		return "For HOBBITTOWN";
	}
}
