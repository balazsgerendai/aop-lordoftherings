package com.epam.training.lordoftherings.domain;

public class Dwarf extends Person {
	private final Race RACE = Race.DWARF;
	
	public Dwarf() {
		super();
	}

	public Race getRACE() {
		return RACE;
	}

	@Override
	public String battleCry() {
		return "Smaug feel my WRATH!!";
	}

}
