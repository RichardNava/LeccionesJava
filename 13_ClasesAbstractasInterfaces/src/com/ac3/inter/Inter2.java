package com.ac3.inter;

public interface Inter2 extends Inter3 {

	String TEXT = "Inter2";
	
	default void girar(int num) {
		System.out.println(texto(TEXT, num) + num);
	}

	static void metodoEstatico() {
		System.out.println("Método Estático de Interfaz.");
	}

	private String texto(String t, int num2) {
		/*
		if (NUM > num2) {
			t = t.concat(" me gusta. ");
		} else {
			t = t.concat(" la odio. ");
		}
		*/  // (Condicion) ?       (Bloque If)       :     (Bloque else)         
		return NUM > num2  ? t.concat(" me gusta. ") : t.concat(" la odio. ");
	}
}
