package com.ac3.models;

public class Coche extends Vehiculo {
	public String marca;

	public Coche() {
		super();
	}

	public Coche(String nombre, long pasajeros, double altura, double peso, double anchura, String marca) {
		super(nombre, pasajeros, altura, peso, anchura);
		this.marca = marca;
	}

	@Override
	public String toString() {
		return super.toString()+" marca=" + marca;
	}
	
	
	
}
