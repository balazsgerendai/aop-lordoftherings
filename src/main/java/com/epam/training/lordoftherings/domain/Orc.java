package com.epam.training.lordoftherings.domain;

public class Orc extends Person {
	private final Race RACE = Race.ORC;
	
	public Orc() {
		super();
		this.health = 50;
	}
}
