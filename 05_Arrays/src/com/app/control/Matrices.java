package com.app.control;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

	public void miMetodo() {
		System.out.println("Hola");
	}
	public static void main(String[] args) {
		// Declaraci�n de una Matriz
		// Forma 1 -> Declaramos el Array dimensionandolo (Diciendole el n�mero de datos que va a contener)
		int [] arrayNumeros = new int[5]; // 0  1  2
		arrayNumeros[0] = 10;			  // 10 20 30
		arrayNumeros[1] = 20;    
		arrayNumeros[2] = 30;
		arrayNumeros[3] = 40;
		arrayNumeros[4] = 50;
		//System.out.println(arrayNumeros[arrayNumeros.length-1]);
		for (int i = 0; i <= arrayNumeros.length-1; i++) {
			System.out.println(arrayNumeros[arrayNumeros.length-1]);
		}
		// Forma 2 -> En lugar de decirle solo la dimensi�n le indicamos el valor de los datos que contiene
		String arrayTexto [] = new String[] {"Paco",null,"Sandra","Sofia"};
		arrayTexto[0] = "Diego";
		System.out.println(arrayTexto[0]);
		
		// Forma 3 -> Similar a la anterior pero simplificada
		char [] arrayLetras = {'a','b','c'}; // 'a' != "a" 
		System.out.println(arrayLetras[2]);
		
		// Si queremos imprimir todo el contenido del Array:
		System.out.println(Arrays.toString(arrayNumeros));
										  //x y			x=0				  				x=1
		String [][] biArrayTxt = new String[][] {{"Manolo","Antonio","Ivan"},{"Eva","Ana","Daniela","Sara"}};
												// 	 	y=0 	y=1	  y=2		y=0	  y=1   y=2		y=3
		System.out.println(biArrayTxt[0][2]);
		
		// Matrices tridimensonales        x  y z
		char [][][] triArrayChar = new char[][][] {
			//   y=0      y=1      
			{{'a','z'},{'@','&'}}, // x=0 
			//z=0 z=1	z=0 z=1
			//   y=0      y=1     		
			{{'l','#'},{'h','R'}}, // x=1
			//z=0 z=1	z=0 z=1
			//   y=0      y=1     
			{{'W','!'},{'?','*'}}  // x=2
			//z=0 z=1	z=0 z=1
			};
		System.out.println(triArrayChar[2][0][1]);
		System.out.println(Arrays.toString(triArrayChar[2]));
		//Tipo de dato inferido respecto al Array
		var boolArray = new boolean[]{true,false,true};
		var boolArray2 = new boolean[6];
		System.out.println(boolArray+" "+boolArray2);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
