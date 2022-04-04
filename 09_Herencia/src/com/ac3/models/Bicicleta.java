package com.ac3.models;

public class Bicicleta extends Vehiculo{
	int ruedas;

	public Bicicleta() {
		super();
		
	}

	public Bicicleta(String nombre, long pasajeros, double altura, double peso, double anchura, int ruedas) {
		super(nombre, pasajeros, altura, peso, anchura);
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return super.toString()+" ruedas=" + ruedas ;
	}


	
	
}
