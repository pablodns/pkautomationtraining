package com.mainclass;

import java.util.ArrayList;
import java.util.List;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;
import com.animals.Ostrich;

public class Arrays {

	public static void main(String[] args) {
		
		Ostrich o = new Ostrich("Rocky");
		Ostrich o2 = new Ostrich("Aunt");
		Ostrich o3 = new Ostrich("Mother");
		Ostrich o4 = new Ostrich("Father");
		Dog doggy = new Dog("Docky");
		Cat catty = new Cat("Cute");
		
		
		Ostrich [] arreglo = new Ostrich[4];
		
		Animal [] listaDeAnimales = new Animal[6];
		
		listaDeAnimales[0] = o;
		listaDeAnimales[1] = o2;
		listaDeAnimales[2] = o3;
		listaDeAnimales[3] = o4;
		listaDeAnimales[4] = doggy;
		listaDeAnimales[5] = catty;
		
		for(Animal puntero : listaDeAnimales) {
			System.out.println("El animal es: " + puntero.getName());
		}
		

/*		
		arreglo[0] = o;
		arreglo[1] = o2;
		arreglo[2] = o3;
		arreglo[3] = o4;for (int i = 0; i < arreglo.length; i++) {
			System.out.println("El avestruz dentro de la "+ i + " posición es: " + arreglo[i].getName());
			
		}
		System.out.println("***********************FOR EACH>>>*****************************");
		
		for(Ostrich puntero : arreglo) {
			System.out.println("El avestruz: " + puntero.getName());
		}*/
		
		
		
		
		
	}

}
