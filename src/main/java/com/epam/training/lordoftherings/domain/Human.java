package com.epam.training.lordoftherings.domain;

public class Human extends Person {
	private final Race RACE = Race.HUMAN;
	public Human() {
		super();
	}
	public Race getRACE() {
		return RACE;
	}
	@Override
	public String battleCry() {
		return "FOR ARAGORN";
	}

}
