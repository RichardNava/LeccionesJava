package com.ac3.models;
import java.text.DecimalFormat;
import com.ac3.inter.Operaciones;

public class Triangulo extends Figura implements Comparable<Triangulo>, Operaciones<Triangulo>{
	
	private int altura, base;
	private String nombre;

	public Triangulo(String color, int altura, int base, String nombre) {
		super(color);
		this.altura = altura;
		this.base = base;
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return this.nombre+" -> Altura= " + altura + ", Base= " + base + super.toString()+ " Area= "+ df.format(this.area());
	}

	//Método abstracto implementado
	@Override
	public double area() {
		return altura*base/2;
	}

	@Override
	public int compareTo(Triangulo t) {
		if (this.area()>t.area()) return 1;
		else 
			if (this.area()<t.area()) return -1;
			else return 0;
	}

	@Override
	public void esMayor(Triangulo t) {
		int o = compareTo(t);
		if (o == 1) System.out.println("El "+ this.nombre+" es mayor que el triangulo "+ t.nombre);
		else
			if (o ==-1) System.out.println("El "+ this.nombre+" es menor que el triangulo "+ t.nombre);
			else System.out.println("El "+ this.nombre+" y el triangulo "+ t.nombre+ " son iguales.");
	}


	
}
