package com.mainclass;

import java.util.Scanner;

import com.animals.Ostrich;
import com.enums.Days;

public class MainSwitchTasks {
	
	
	public static void main(String[] args) {
		Ostrich o = new Ostrich("Rocky");
		
		o.setDayToEat(Days.WEDNESDAY);

		Scanner scan = new Scanner(System.in);
		boolean control = true;
		
		do {
			System.out.println("Try to guess the day Rocky eats: ");
			
			Days day = null;
			Days dayToEat = o.getDayToEat();
			
			try {
				day = Days.valueOf(scan.nextLine());
			}catch(Exception cualquierNombre) {
				System.out.println("Este día no existe, intenta nuevamente" + cualquierNombre.getMessage());
				continue;
			}
			
			if(day.equals(dayToEat)) {
				System.out.println("Yes, i eat on " + day.name()) ;
				control = false;
			}else {
				System.out.println("Wrong, try again");
			}

		}while(control);
		
	}

}
