package com.ac3.tools;

import java.util.Scanner;

public class CalcFunctions extends Object {


	private double sumar(double op1, double op2) { 
		double result = op1+op2;
		return result;
	} 
	double restar(double op1, double op2) { // No especificado = Package-private
		double result = op1-op2;
		return result;
	}
	protected double multiplicar(double op1, double op2) {
		double result = op1*op2;
		return result;
	}
	public double dividir(double op1, double op2) {
		if (op2 != 0) {
			return op1/op2;
		} else {
			System.out.print("No se pude dividir entre ");
			return 0;
		}
	}
	public boolean showOp(Scanner sc) { 
		System.out.println("Introduce el tipo de operación:\n -SUMAR \n -RESTAR \n -MULTIPLICAR \n -DIVIDIR \n -SALIR ");
		String index = sc.next().trim().toUpperCase();
		if (index != null && !index.isBlank() && !index.equals("SALIR")) { // FALSE &= AND |= OR // TRUE
			System.out.println("Introduce el primer operando: ");
			double op1 = sc.nextDouble();
			System.out.println("Introduce el segundo operando: ");
			double op2 = sc.nextDouble();
			switch (index) {
				case "SUMAR","SUMA":
					//Sumar
					System.out.println(sumar(op1,op2));
					return true;
				case "RESTAR","RESTA":
					//Restar
					System.out.println(restar(op1,op2));
					return true;
				case "MULTIPLICAR","MULTIPLICA":
					System.out.println(multiplicar(op1,op2));			
					return true;
				case "DIVIDIR","DIVIDE":
					System.out.println(dividir(op1,op2));
					return true;
				/*
				case "SALIR":
					System.out.println("Gracias por usar nuestra calculadora. ¡Hasta la próxima!");
					return false;
				*/
				default:
					System.out.println("No existe la operación indicada.");
					return true;
			}
		}
		else if (index.equals("SALIR")) {
			System.out.println("Gracias por usar nuestra calculadora. ¡Hasta la próxima!");
			return false;
		}
		else {
			System.out.println("Debe introducir una instrucción valida. Intentelo de nuevo.");
			return true;
		}
	}
	public double getOp(double op1, double op2, String index) {
		if (index != null && !index.isBlank()) { // FALSE &= AND |= OR // TRUE
			switch (index.trim().toUpperCase()) {
				case "SUMAR","SUMA":
					//Sumar
					return sumar(op1,op2);
				case "RESTAR","RESTA":
					//Restar
					return restar(op1,op2);
				case "MULTIPLICAR","MULTIPLICA":
					return multiplicar(op1,op2);			
				case "DIVIDIR","DIVIDE":
					return dividir(op1,op2);
				default:
					System.out.println("No existe la operación indicada.");
					return 0;
			}
		}
		return 0;
	}
	
}
