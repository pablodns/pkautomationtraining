package com.interfaces;

import com.enums.Days;

public interface IAnimalBasicActions {
	public final String ACTIONS_INTERFACE = "These are the basic actions from an Animal";
	
	public String eat(String food);
	public String sleep(int time);
	//TODO: 06.- Create the void method setDayToEat(Days day); and solve the errors.
	//TODO: 07.- Create the getter getDayToEat();
	
	
}
