package com.epam.training.lordoftherings.domain;

import java.util.Random;

public class Battle {
	private String name;
	private Army armyOfLight;
	private Army armyOfDarkness;
	private Random dice;
	public Battle(String name, Army armyOfLight, Army armyOfDarkness) {
		super();
		this.setName(name);
		this.armyOfLight = armyOfLight;
		this.armyOfDarkness = armyOfDarkness;
		dice = new Random();
	}
	
	public void doBattle(){
		while(armyOfLight.getTroopStrenght() > 0 && armyOfDarkness.getTroopStrenght() > 0){
			if(dice.nextBoolean()){
				armyOfLight.attack(armyOfDarkness);
			}else{
				armyOfDarkness.attack(armyOfLight);
			}
		}
		
	}
	
	public Army getWinner(){
		if(armyOfLight.getTroopStrenght() == 0){
			return armyOfDarkness;
		}else{
			return armyOfLight;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
