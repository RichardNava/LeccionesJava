package com.ac3.models;

public class Avion extends Vehiculo {
	public int alas;

	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avion(String nombre, long pasajeros, double altura, double peso, double anchura, int alas) {
		super(nombre, pasajeros, altura, peso, anchura);
		this.alas = alas;
	}

	@Override
	public Vehiculo ruido(String ruido) {
		// TODO Auto-generated method stub
		super.ruido(ruido+"COSA");
		return null;
	}


	
	
}
