package com.app.models;

import java.util.Arrays;

public class Persona {
	// Parametros/Atributos de clase (Variables globales) // Fields
	// Package-private
	private String nombre;
	private String [] apellidos = new String[2];
	private float altura;
	private float peso;
	private String dni;
	public int edad;
	public static int edad1 = 0;
	private static int count = 0;
	{
		System.out.println("Bloque inicializador instancia 2");	
	}
	static {
		System.out.println("Bloque inicializador estatico");
	}
	
	public static int getCount() {
		return count;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getEdad1() {
		return edad1;
	}

	public static void setEdad1(int edad1) {
		Persona.edad1 = edad1;
	}

	// CONSTRUCTORES
	public Persona() { // Sin argumentos
		super();
		count++;
		System.out.println("Bloque constructor");	
	}
	 
    public Persona(String nombre, String[] apellidos, float altura, float peso, String dni) { // Sobrecargado
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.altura = altura;
		this.peso = peso;
		this.dni = dni;
		count++;
		System.out.println("Bloque constructor");	
	}

    {
    	System.out.println("Bloque inicializador instancia 1");	
    }
    // Getters & Setters (GET & SET) - Accesors Methods // Get = Modo lectura Set= Modo escritura/edici�n
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getApellidos() {
		return apellidos;
	}

	public void setApellidos(String[] apellidos) {
		this.apellidos = apellidos;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	// toString()
	@Override
	public String toString() { // M�todo sobreescrito
		return "Persona\n Nombre: " + nombre + ",\n Apellidos: " + Arrays.toString(apellidos) + ",\n Altura: " + altura
				+ ",\n Peso: " + peso + ",\n DNI: " + dni;
	}
	
	public void saludarPersona() {
		System.out.println("Hola "+getNombre()+" "+getApellidos()[0]);
	}
	private void saludarPersona(String saludo) { // M�todo sobrecargado
		System.out.println(saludo+" "+getNombre()+" "+getApellidos()[0]);
	}
	public void saludarPersona(String saludo, long numero) { // M�todo sobrecargado
		System.out.println(saludo+" "+getNombre()+" "+getApellidos()[0]+" "+numero);
	}
	void saludarPersona(String saludo, int numero) { // M�todo sobrecargado
		System.out.println(saludo+" "+getNombre()+" "+getApellidos()[0]+" "+numero);
	}
	
	protected String saludarPersona(String saludo, float dec) { 
		saludarPersona(saludo);
		return saludo+" "+ new Persona().getNombre() +" "+ new Persona().getApellidos()[0];
	}
	/*
	public String saludarPersona(String saludo) { // M�todo sobrecargado
		String saludoCompleto = saludo+" "+getNombre()+" "+getApellidos()[0];
		System.out.println(saludoCompleto);
		return saludoCompleto;
	}
	public int saludarPersona(String saludo, int num) { // M�todo sobrecargado
		String saludoCompleto = saludo+" "+getNombre()+" "+getApellidos()[0];
		System.out.println(saludoCompleto);
		return num;
	}
	*/
}
