package com.ac3.models;

import com.ac3.inter.Inter2;
import com.ac3.inter.Operaciones;

public class Circulo extends Figura implements Inter2, Operaciones<Circulo>, Comparable<Object>{

	private int radio;

	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo ->" + super.toString() + ", Diametro= "+ radio*2 +" Area= "+ String.format("%.2f", this.area());
	}

	// Método abstracto sobreescrito
	@Override
	public double area() {
		return Math.PI*radio*radio;
	}

	@Override
	public int compareTo(Object o) {
		if(this.toString().length() > o.toString().length()) return 1;	
		else 
			if (this.toString().length() < o.toString().length()) return -1;
			else return 0;		
		//return (this.toString().length() > o.toString().length()) ? 1 : (this.toString().length() < o.toString().length()) ? -1 : 0;
	}

	@Override
	public void esMayor(Circulo c) {
		
	}

	
}
