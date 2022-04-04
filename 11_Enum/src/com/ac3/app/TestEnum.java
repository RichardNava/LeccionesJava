package com.ac3.app;

public class TestEnum {
	static Dias day = Dias.DOMINGO;


	public static void main(String[] args) {
		for (var d : Dias.values()) {
			
			if (d.equals(Dias.MARTES)) {
				d.st = "Hola";
				System.out.println("Hoy es Martes");
			}
			System.out.println(d.name()+" "+d.st);
			if (d.s == 5) {
				System.out.println("Hoy es viernes. ¡¡FIESTAAAA!!");
			}
		}
		/*
		for (int i =  Dias.values().length-1; i > Dias.values().length; i-=2) {
			System.out.println(Dias.values()[i].name());
		}
		*/
		switch (day) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
		case SABADO:
		case DOMINGO:
		}
		switch (day.s) {
		case 1:		
			break;
		case 6:		
			break;
		case 7:
			break;
		}
		
	}

}
