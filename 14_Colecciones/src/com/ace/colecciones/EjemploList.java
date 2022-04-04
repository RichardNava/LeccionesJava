package com.ace.colecciones;

import java.util.*;

public class EjemploList {

	public static void main(String[] args) {
		// 1- Podemos crear la lista con una instancia de ArrayList
			// Es recomendable indicar el generico de nuestra lista
		List<String> list1 = new ArrayList<>(); 
			//Usando tipo inferido
		var list2 = new ArrayList<String>();
			list1.add("A"); // 0
			list1.add("B"); // 1
			list1.add("C"); // 2
			list1.add("D"); // 3 - 4
			list1.add("E"); // 4 - 5 
			list1.add("F"); // 5 - 6
			list1.add(3,"H"); // 3 
			list1.remove(0);
			list1.remove("C");
			//list1.add(4, null);
			
		// 2- Podemos crear la lista desde el método asList() de la Clase Arrays
			// IMPORTANTE: estas listas nos permiten modificar su contenido pero no permite añadir o eliminar datos.
		Integer [] nums = new Integer[] {1,2,3,4,5};
		List<Integer> numsList1 = Arrays.asList(nums);
		List<Integer> numsList2 = Arrays.asList(15,16,28,39,45,65);
			numsList1.set(0, 10);
			//numsList1.forEach(System.out::print);		// Esto es una referencia a método
														// for (Integer integer : numsList1) {System.out.println(integer);}
				// numsList2.remove(15); NO PERMITIDO
				// numsList2.add(15); NO PERMITIDO
		// 3- Podemos crear la lista con método de factoria 
			// IMPORTANTE: las listas son inmutables
			
			List<String> list3 = List.copyOf(list1);
			List<String> list4 = List.of("N","M","R","S");
			String letra = list1.set(1, "J");
			System.out.println(letra);
			//list4.remove("N"); NO permitido
			//list3.add("N"); NO permitido
			list1.forEach(System.out::print);
			System.out.println();
			list3.forEach(System.out::print);
			
	}

}
