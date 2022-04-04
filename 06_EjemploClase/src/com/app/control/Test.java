package com.app.control;

import com.app.models.Persona;

public class Test {

	public static void main(String[] args) {

		var yo = new Persona(); //Instancia - Constructores
		yo.setNombre("Ricardo");
		yo.setApellidos(new String[]{"Nava","Hernandez"});
		yo.setAltura(1.86f);
		yo.setPeso(90.0f);
		yo.setDni("123456789D");
		/*
		yo.nombre = "Ricardo";
		yo.apellidos[0] = "Nava";
		yo.apellidos[1] = "Hernández";
		yo.altura = 1.86f;
		yo.peso = 90.0f;
		yo.dni = "24356980F";
		*/
		Persona tu = new Persona("Alvaro", new String[] {"Lopez","Garcia"}, 1.75f, 81.5f, "20304059G");
		
		//System.out.println(yo.toString());
		//System.out.println(tu);
		//System.out.println(yo.equals(tu));
		//tu.saludarPersona();
		//Persona.saludarPersona2("Buenas noches");
/*
		yo.edad++; // 0 + 1 = 1
		tu.edad++; // 0 + 1 = 1
		System.out.println("Edad de " + yo.getNombre() + " es "+ yo.getEdad());
		System.out.println("Edad de " + tu.getNombre() + " es "+ tu.getEdad());
		yo.edad1++;
		tu.edad1++;
		System.out.println("Edad estatica de " + yo.getNombre() + " es "+ yo.getEdad1());
		System.out.println("Edad estatica de " + tu.getNombre() + " es "+ tu.getEdad1());
		
		System.out.println("----------------------------------------------------------");
	
		Persona el = new Persona();
		el.setNombre("Yotuel");
		tu.edad1++;
		System.out.println("Edad de " + el.getNombre() + " es "+ el.getEdad());
		System.out.println("Edad estatica de " + el.getNombre() + " es "+ el.getEdad1());
		System.out.println("Edad estatica de " + yo.getNombre() + " es "+ yo.getEdad1());
		System.out.println("Edad estatica de " + tu.getNombre() + " es "+ tu.getEdad1());
		System.out.println("----------------------------------------------------------");
		
		//System.out.println(new Persona().getCount());
		System.out.println(Persona.getCount());
	*/	
		
	}
	public static double calculoRaro(int number) {
		// Muchisimas instrucciones
		number = number + 2;
		number = number * 10;
		number += number % 5;
		number = number + (number/3);
		return number*number;
	}
}
