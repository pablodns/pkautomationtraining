package com.animals;

import com.abtraction.*;
import com.enums.Days;
import com.interfaces.*;

public class Ostrich extends Animal implements IAnimalBasicActions, IWings{

	public int wingsNumber;
	Days day;
	public Ostrich(String name) {
		super(name);
	}

	@Override
	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public String getSound() {
		return sound;
	}

	@Override
	public String eat(String food) {
		return "I am an ostrich and i am eating " + food;
	}

	@Override
	public String sleep(int time) {
		return "I am an ostrich and i am sleeping " + time;
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public int getWingsNumber() {
		return wingsNumber;
	}

	@Override
	public void setWingsNumber(int number) {
		this.wingsNumber = number;
	}
	
	
	@Override
	public String toString() {
		return "This is the Ostrich class, and i am " + name + " Do i fly? " + fly() + "I eat on " + day;
	}
	
	@Override
	public void setDayToEat(Days day) {
		this.day = day;
	}
	
	public Days getDayToEat() {
		return day;
	}
	
}
