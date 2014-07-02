package com.epam.training.lordoftherings.domain;

public class Orc extends Person {
	private final Race RACE = Race.ORC;
	
	public Orc() {
		super();
		this.health = 50;
	}

	public Race getRACE() {
		return RACE;
	}

	@Override
	public String battleCry() {
		return "FOR MORDOR!!!";
	}
}
