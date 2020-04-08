package com.abtraction;

public abstract class Animal {
	//TODO: Create 2 public Strings: name and sound. 
	public String name;
	public String sound;
	//TODO: create only the constructor for the variable name. 
	public Animal(String name) {
		
		this.name = name;
	}
		
	//TODO: Create the getter and setter for name. 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//TODO: Create getter and setter as abstract for sound variable. 
	abstract String getSound();
	abstract void setSound();
	//TODO: Create the toString method using the Source in eclipse. 

	@Override
	public String toString() {
		return "Animal [name=" + name + ", sound=" + sound + "]";
	}
	
	
	

}
