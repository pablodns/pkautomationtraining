package com.mainclass;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;
import com.animals.Ostrich;

public class Lists {

	public static void main(String[] args) {
		
		Ostrich avestruz = new Ostrich ("Rocky");
		Dog perro = new Dog("Dog");
		Cat gato = new Cat("Cat");
		
		
		List<Animal> lista = new ArrayList<Animal>();
		
		lista.add(avestruz);
		lista.add(perro);
		lista.add(gato);
		
		Scanner scan = new Scanner(System.in);
		boolean controlador = true;
		
		do {
			System.out.println("Estos son los animales actuales: ");
			System.out.println(getNamesInList(lista));
			System.out.println("¿Qué acción quieres hacer? "
					+ "1.- Agregar animal"
					+ "2.- Eliminar animal"
					+ "3.- Salir del Ciclo");
			
			int opcion;
			try {

				opcion = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				continue;
			}
			
			switch (opcion) {
			case 1:
				System.out.println("¿Qué tipo de animal quieres agregar? "
						+ "1.- Avestruz"
						+ "2.- Perro"
						+ "3.- Gato"
						+ "4.- Cancelar");
				int opcion2;
				try {
					opcion2 = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					continue;
				}
				
				switch (opcion2) {
				case 1:
					System.out.println("Ingrese el nombre del Avestruz");
					Ostrich o = new Ostrich(scan.nextLine());
					lista.add(o);					
					break;

				default:
					break;
				}
				
				
				break;
				
			case 3:
				controlador = false;
				break;

			default:
				break;
			}
			
			
		}while(controlador);
		
		
		

		/*
		List <Object> lista = new ArrayList<Object>();
		
		lista.add("Primer elemento");
		lista.add(100);
		lista.add('c');
		lista.add(2.43);
		
		List <String> lista2 = new ArrayList<>();
		
		lista2.add("String");
		
		List <Animal> listaAnimales = new ArrayList<Animal>();
		Ostrich avestruz1 = new Ostrich("Rocky");
		listaAnimales.add(avestruz1);System.out.println("************FOR MEJORADO*************");
		for (Object objectos : lista) {
			
			System.out.println(objectos);
			
		}
		
		System.out.println("***********FOR SIMPLE**************");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));;
		}

		System.out.println("*************ITERATOR************");
		
		Iterator<Object> iterador = lista.iterator();
		
		while(iterador.hasNext()) {
			Object actualObject = iterador.next();
			System.out.println(actualObject);
			
		}*/
		
		
	}
	
	
	public static String getNamesInList(List<Animal> lista) {
		String retorno = "";
		
		for(int i = 0; i < lista.size(); i++) {
			retorno = retorno + lista.get(i).getName() + " Index: [" + i + "] + Class: " + lista.get(i).getClass() + "\n";		
		}
		
		return retorno;
		
	}

}
