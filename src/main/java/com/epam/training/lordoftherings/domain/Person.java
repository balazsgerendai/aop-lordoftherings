package com.epam.training.lordoftherings.domain;

import java.util.Random;

public class Person {
    private String name;
    private Gender gender;
    private int attackPower;
    protected int health = 100;

	private Random attacking;
	
	public Person() {
        attacking = new Random();
    }
	
	public boolean attack(Person enemyPerson){
		boolean shootHit = false;
		if(attacking.nextBoolean()){
			enemyPerson.setHealth(enemyPerson.getHealth() - attackPower);
			shootHit = true;
		}
		
		return shootHit;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getHealth() {
			return health;
	}
    public void setHealth(int health) {
		this.health = health;
	}
    
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", attackPower="
				+ attackPower + "]";
	}


    
}
