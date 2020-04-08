package com.animals;

import com.abtraction.Animal;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public String getSound() {
		return sound;
	}
	
	@Override
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String getDogOwner(String owner) {
		return "The dog's owner is " + owner;
	}
}
