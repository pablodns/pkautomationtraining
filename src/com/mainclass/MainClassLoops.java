package com.mainclass;

public class MainClassLoops {
	
	
	public static void main(String[] args) {
		
		String nombre = "Anita Lava la Tina";
		String nombreInverso = ""; 
		
		
		for(int i = nombre.length() - 1; i >= 0; i --) {
			//System.out.println("La posición de i = " + i + " La letra en esta posición es: " + nombre.charAt(i));
			nombreInverso += nombre.charAt(i);
			
			System.out.print(nombre.charAt(i));
		}

		//System.out.println(nombreInverso);
		
		
		
		
		/*
		 * While
		 * 
		 * Do - While
		 * 
		 * For
		 * 
		 * For mejorado
		 * 
		 * 
		int count = 10;
		int i = 0;
		
		
		boolean condition = false;
		
		while (condition) {
			
			System.out.println("The loop while is executed");
			
		}
		
		System.out.println("**************************************************");
		
		do {
			System.out.println("The loop do while is executed");
			
		}while(condition);
		 * */
		
		
		
		
		
		
		
		
	}

}
