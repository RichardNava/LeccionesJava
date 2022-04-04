package com.ac3.app;

import com.ac3.inter.Inter2;
import com.ac3.inter.Operaciones;
import com.ac3.models.Circulo;
import com.ac3.models.Triangulo;

public class Test {

	public static void main(String[] args) {
		Circulo fig = new Circulo("Rojo",5);
		System.out.println(fig);
		Triangulo fig2 = new Triangulo("Verde",4,8,"Triangulo Verde");
		System.out.println(fig2);
		Triangulo fig3 = new Triangulo("Azul",14,18,"Triangulo Azul");
		System.out.println(fig3);
		fig2.esMayor(fig3);
		System.out.println(Inter2.TEXT);
		fig.girar(Inter2.NUM);
		System.out.println(Operaciones.CONV);
		Inter2.metodoEstatico();
		//Inter2 i2 = new Circulo("Naranja",8);

	}

}
