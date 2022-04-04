package com.app.control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Introduzca su contraseña"); String password =
		 * sc.nextLine(); // System.out.println("Introduzca valor para el número 2");
		 * String passwordBBDD = "ABCD1234";
		 * 
		 * if ((!password.isEmpty() || password.startsWith("a") || password.length()<=5)
		 * && ((password.endsWith("z")) || (password.indexOf(2) == 'd'))) {
		 * System.out.println("Acceso"); } else { System.out.println("Peinate"); }
		 * System.out.println("Estoy fuera del If"); // boolean condition =
		 * password.isEmpty() == false;
		 * 
		 * if (password.length() > 0) { // Cuando un método nos devuelve un resultado y
		 * // queremos comprobar su resultado opuesto // Opcion A= condition == false //
		 * /!condition if (password.trim().toUpperCase().equals(passwordBBDD)) {
		 * System.out.println("Acceso permitido"); } else {
		 * System.out.println("La contraseña introducida es incorrecta"); } } else {
		 * System.out.println("Debe introducir algo para acceder"); }
		 */
		int num1 = 5;
		int num2 = 6;

		if (num1 > num2) {
			System.out.println("El número 1 es mayor que el número 2");
		} else if (num1 == num2) {
			System.out.println("El número 1 es igual que el número 2");
		} else {
			System.out.println("El número 1 es menor que el número 2");
		}

		int mayor = (num1 > num2) ? 1 : (num1 < num2) ? -1 : 0; // Ternario
		String resultado = (mayor == 1) ? "El número mayor es " + num1
				: (mayor == -1) ? "El número mayor es " + num2 : "Los números son iguales";
		System.out.println(resultado);

		num1 = 1; // 2 -> 3 -> 4 -> 5 -> 6
		num2 = 5;
		if (num1 != 0 | ++num1 > num2)
			num1++;
		// TRUE -OR- FALSE ->
		if (num1 == 2 || ++num1 > num2)
			num1++;
		// FALSE -OR- TRUE ->
		if (num1 == 3 & ++num1 > num2)
			num1++;
		// FALSE -AND- TRUE X
		if (num1 == 4 && ++num1 > num2)
			num1++;
		// FALSE X

		System.out.println("Valor: " + num1);

		num1 = 3; // 4
		num2 = 2; // 3/4
		boolean condition = num1 > ++num2; // False
		condition = num1 < ++num2; // True
		condition = ++num1 == num2; // True
		condition = !condition; // False

		System.out.println(condition);

		if (condition) { // condition == true
			condition = false;
		} else {
			condition = true;
		}
		Scanner sc = new Scanner(System.in);
		// CLASES
		// DATOS PRIMITIVOS - OPERADORES - STRING-STRINGBUILDER - METODOS - ESTRUCTURA
		// IF - BUCLES
		/*
		 * System.out.println("Introduzca un número: "); int result = sc.nextInt(); //
		 * float d = 0.5f;
		 * 
		 * // Estructura IF-ELSE // -> % + - * / if (result % 2 == 0)
		 * System.out.println(result + " es par."); else System.out.println(result +
		 * " es impar.");
		 * 
		 */
		//System.out.println("Introduzca un número: ");
		//int result = sc.nextInt();
		/*
		 * if (result == 1) { System.out.println("Hola"); } else if (result == 2) {
		 * System.out.println(LocalDate.now()); } else if (result == 3) {
		 * System.out.println("Adios"); } else {
		 * System.out.println("No existe la opción seleccionada"); }
		 */

		int result = 3;
		switch (result) {
		case 2:
			result++;
			break;
		default:
			result += result; // result * 2
			break;
		case 3:
			result++; // 4
		case 4:
			result += ++result; // result = result + (result+1) -> result = 4 + (4+1) -> result = 4+5 -> 9
		case 5:
			result += 2; // 9 + 2 = 11
			break;
		case 6:
			result--;
			break;
		}
		System.out.println(result);


		sc.close();
		
		EstructurasControl ec = new EstructurasControl();
	}

}
