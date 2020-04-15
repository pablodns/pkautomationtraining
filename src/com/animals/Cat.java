package com.animals;
import com.abtraction.Animal;

public class Cat extends Animal{
	
	
	public Cat(String name) {
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
	
	public String getCatOwner(String catOwner) {
		return "The cat's owner is: " + catOwner;
	}

}
