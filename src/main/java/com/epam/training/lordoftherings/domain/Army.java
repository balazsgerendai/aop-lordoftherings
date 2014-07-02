package com.epam.training.lordoftherings.domain;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Army {
	private String name;
	private Side side;
	private List<Person> troops;
	private Random randomSoldier;
	private static final Logger LOGGER = LoggerFactory.getLogger(Army.class);
	
	public Army(){
		
	}
	
	public Army(Side side, List<Person> troops) {
		this.side = side;
		this.troops = troops;
		randomSoldier = new Random();
	}
	public Person getRandomSoldier(){
		return troops.get(randomSoldier.nextInt(troops.size()));
	}
	public Ainur getAinur(){
		for(Person soldier : troops){
			if(soldier instanceof Ainur){
				return (Ainur) soldier;
			}
		}
		return null;
	}
	public void attack(Army enemyArmy){
		
		Person enemySoldier = enemyArmy.getRandomSoldier();
		
		if(isTheRingBeenStolen(enemySoldier)){
			Ainur ainur = getAinur();
			ainur.setAlreadyStoleRing(true);
			ainur.stealRing((Ainur) enemySoldier);
			LOGGER.info(ainur.getName() + " stole the the ring from " + enemySoldier.getName());
		}else{
			Person soldier = getRandomSoldier();
			
			if(soldier.attack(enemySoldier)){
				LOGGER.info(soldier.getName() + " hit enemy " + enemySoldier.getName() + " for " + soldier.getAttackPower() + " damage!");
				if(enemySoldier.getHealth()  < 0) enemyArmy.removeDead(enemySoldier);
			}else{
				LOGGER.info(soldier.getName() + " missed the shoot!");
			}
		}
	}
	
	private boolean isTheRingBeenStolen(Person enemySoldier){
		return (enemySoldier instanceof Ainur && getAinur() != null &&  !getAinur().isAlreadyStoleRing());
	}
	
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public List<Person> getTroops() {
		return troops;
	}
	public void removeDead(Person soldier){
		troops.remove(soldier);
		LOGGER.info(soldier.getName() + " has died!");
	}
	public int getTroopStrenght(){
		return troops.size();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		   StringBuilder builder = new StringBuilder();
	        builder.append("Army [side=" + side + ",[Troops= [");

		 for (Person person : troops) {
	            builder.append(person.toString()+", ");
	        }
		 builder.append("]");
		 
		return builder.toString();
	}

	
}
