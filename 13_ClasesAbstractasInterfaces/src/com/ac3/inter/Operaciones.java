package com.ac3.inter;

@FunctionalInterface
public interface Operaciones<K> {
	double CONV = 8.75; //Los parametros de una interfaz son implicitamente publicos estaticos y final

	default void girar(Integer num) {
		System.out.println("OPERACIONES");
	}
	abstract void esMayor(K k); // enum{UP,DOWN,RIGTH,LEFT;}
	// UI - User Interface GUI- Graphic User Interface
	//abstract void esMenor(K k);
}
