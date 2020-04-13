package com.mainclass;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;
import com.animals.Ostrich;

public class MainClass {
	
	public static void main(String[] args) {
		
		Ostrich a3 = new Ostrich("Rakan");
		a3.setSound("I AM A BIG BIRD");
		a3.setWingsNumber(2);
		System.out.print(a3.toString());
		
	}

}
