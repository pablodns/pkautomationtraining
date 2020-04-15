package com.interfaces;

import com.enums.Days;

public interface IAnimalBasicActions {
	public final String ACTIONS_INTERFACE = "These are the basic actions from an Animal";
	
	public String eat(String food);
	public String sleep(int time);
	public void setDayToEat(Days day);
	public Days getDayToEat();
	
	
}
