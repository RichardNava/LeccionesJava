package com.ac3.models;

public abstract class Figura {

	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return " Color=" + color;
	}
	// Método abstracto
	public abstract double area();

	public void esMayor() {
		// TODO Auto-generated method stub
		
	}
	
}
