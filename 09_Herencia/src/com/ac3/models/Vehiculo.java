package com.ac3.models;

public class Vehiculo {
	// Parametros de clase
	
	protected String nombre; // Sin definir = Package-Private
	long pasajeros;
	private double altura;
	private double peso;
	private double anchura;
	//CONSTRUCTORES

	public Vehiculo() {
		super();
	}

	public Vehiculo(String nombre, long pasajeros, double altura, double peso, double anchura) {
		super();
		this.nombre = nombre;
		this.pasajeros = pasajeros;
		this.altura = altura;
		this.peso = peso;
		this.anchura = anchura;
	}
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//TOSTRING
	@Override
	public String toString() {
		return nombre + ", " + pasajeros + ", " + altura + ", " + peso
				+ ", " + anchura;
	}

	public Vehiculo ruido(String ruido) {
		System.out.println(ruido);
		return this;
	}
	
	
}
