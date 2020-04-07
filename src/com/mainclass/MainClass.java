package com.mainclass;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal a1 = new Cat("Whyskas");
		Animal a2 = new Dog("Doky");
		a1.setSound("meow");
		a2.setSound("barf");
		System.out.println(a1.getSound());
		System.out.println(a.getSound());
	}

}
