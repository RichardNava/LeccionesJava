package com.ac3.app;

public enum Dias{ // Podemos implementar interfaces
	LUNES(1, "Odio los lunes"),
	MARTES(2,"Ni te cases ni te embarques"),
	MIERCOLES(3,"D�a feo"),
	JUEVES(4,"D�a del trueno"),
	VIERNES(5, "D�a del amor y la belleza"),
	SABADO(6, "D�a de fiesta"),
	DOMINGO(7, "D�a del se�or y del Larguero");
	
	int s;
	String st;
	
	Dias(int k, String st) { // private de una forma implicita
		this.s = k;
		this.st = st;
	}
	
}
