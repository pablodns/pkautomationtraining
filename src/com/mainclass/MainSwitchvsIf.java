package com.mainclass;

import java.util.Scanner;

import com.animals.Ostrich;
import com.enums.Browsers;
import com.enums.Days;

public class MainSwitchvsIf {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String value = in.nextLine();

		boolean cont = true;
			if(value.equals("Chrome")) {
			System.out.println("El browser elegido es CHROME");
		}else if(value.equals("Firefox")) {
			System.out.println("El browser elegido es Firefox");
			
		do {
			System.out.println("Por favor ingrese el valor del browser:");
			value = in.nextLine();
			switch (value) {
			case "Chrome": 
				System.out.println("El browser es Chrome");
				
				break;
			case "Firefox" :
				System.out.println("El browser es Firefox");
				break;

			default:
				cont = false;
				System.out.println("ERROR: No existe el browser");
				break;
			}
		}while(cont);
		}
		
		
	}

}
