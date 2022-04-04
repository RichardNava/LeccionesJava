package com.ac3.app;

public enum Dias{ // Podemos implementar interfaces
	LUNES(1, "Odio los lunes"),
	MARTES(2,"Ni te cases ni te embarques"),
	MIERCOLES(3,"Día feo"),
	JUEVES(4,"Día del trueno"),
	VIERNES(5, "Día del amor y la belleza"),
	SABADO(6, "Día de fiesta"),
	DOMINGO(7, "Día del señor y del Larguero");
	
	int s;
	String st;
	
	Dias(int k, String st) { // private de una forma implicita
		this.s = k;
		this.st = st;
	}
	
}
