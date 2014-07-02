package com.epam.training.lordoftherings.domain;

public class Ainur extends Person {
    private Ring ringPower;
	private final Race RACE = Race.AINUR;
	private boolean alreadyStoleRing = false;
	
	public Ainur() {
		this.health = 2000;
	}
	
	public void stealRing(Ainur enemyRingBearer){	
		this.setRingPower(enemyRingBearer.getRingPower());
		this.setAttackPower(100);
		enemyRingBearer.setRingPower(null);
		enemyRingBearer.setAttackPower(10);
	}
	
	public Ring getRingPower() {
		return ringPower;
	}

	public void setRingPower(Ring ringPower) {
		this.ringPower = ringPower;
	}

	public boolean isAlreadyStoleRing() {
		return alreadyStoleRing;
	}

	public void setAlreadyStoleRing(boolean alreadyStoleRing) {
		this.alreadyStoleRing = alreadyStoleRing;
	}

	public Race getRACE() {
		return RACE;
	}

	@Override
	public String battleCry() {
		return "YOU SHALL NOT PASS!!!";
	}
}
