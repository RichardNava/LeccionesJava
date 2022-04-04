package com.app.control;

import java.util.Arrays;
import java.util.Scanner; // Acceso a la libreria que contiene la clase Scanner

public class String_StringBuilder { // String es inmutable - StringBuilder es mutable

	public static void main(String[] args) {
		
		String texto = "  Luke, yo soy tu padre. "; // Instancia = new

		// Método length() -> Devuelve el número de caracteres que tiene el texto
		// (String)
		int textSize = texto.length();
		p("Mi frase tiene " + textSize + " caracteres.");
		// Método toLowerCase() / toUpperCase() -> Métodos que sirven para pasar a
		// minisculas o mayusculas respectivamente
		p("toUpperCase()-> "+texto.toUpperCase()); // Ejemplo de la inmutabilidad de String
		p(texto); // A pesar de haber utilizado un método en la linea anterior el texto no ha sido modificado
		String textoUpper = texto.toUpperCase(); //Asignando el valor a una nueva variable si notamos el cambio
		p(textoUpper); 
		String textoLower = texto.toLowerCase();
		p("toLowerCase()-> "+textoLower);

		// Método substring(int a, int b) -> Devuelve una subcadena comprendida entre
		// los valores pasados (Inicio "Inclusivo" - Final "Exclusivo")
		String subTexto = texto.substring(6);
		p("substring(a)-> "+subTexto);
		String subTexto2 = texto.substring(6, 12);
		p("substring(a,b)-> "+subTexto2);
		// Método charAt(int pos) -> Devuelve el char(caracter) que corresponde a la
		// posición que le damos como argumento
		char letra = texto.charAt(texto.length() - 1); // -> Todos los iterables parten de la posición 0(inicio) a //
														// length -1(fin)
		p("charAt()-> "+letra);

		// Método indexOf(String expresion) -> Nos devuelve un int que corresponde al
		// valor de la posición donde comienza la expresión buscada

		int indexPos = texto.indexOf("Darth Vader"); // Al no encontrar coincidencia con la busqueda nos devuelve -1
		p("indexOf()-> "+indexPos);

		// Método replace(String c1, String c2) sustituye c1 por c2
		String textoRemplazado = texto.replace("Luke", "Mark");
		p("replace() 1-> "+textoRemplazado);
		String textoRemplazadoChar = textoRemplazado.replace('o', 'a');
		textoRemplazadoChar = textoRemplazadoChar.replace('u', 'i');
		p("replace() 2-> "+textoRemplazadoChar);
		textoRemplazado = texto.replace(texto.substring(6, 8), "tu");
		p("replace() 3-> "+textoRemplazado);

		// Método startWith(String s1)/endsWith(String s2) NOs devuelve true/false
		// despues de comprobar si el texto empieza o termina
		// con el argumento que le pasemos
		p("startsWith()-> "+texto.startsWith("Luke"));
		p("endsWith()-> "+texto.endsWith("Luke"));
		// Método trim() nos quita espacios al principio y al final
		p("trim()-> "+texto.trim());
		// System.out.println(texto.replace("yo","nosotros").toUpperCase().trim().substring(2));

		// Método concat(String s) concatena el texto original con el nuevo texto
		// (argumento)
		p("concat()-> "+texto.concat("Y además eres muy feo."));

		// Método isEmpty() nos dice si la cadena de caracteres esta vacia
		p("isEmpty()-> "+texto.isEmpty());
		String textoVacio = "";
		p(""+textoVacio.isEmpty());

		Scanner sc = new Scanner(System.in); // Instancia de la clase que permite entrada por teclado
		String nuevaFrase = sc.nextLine();
		// Método isBlank() nos dice si el texto esta en blanco
		p("isBlank()-> "+nuevaFrase.isBlank());
		p("isEmpty()-> "+nuevaFrase.isEmpty());
		// Método equals(String textoParaComparar) compara el texto original con el texto que le pasamos por argumento
		p("equals()-> "+nuevaFrase.equals(texto.trim())); // (5 == 8)
		// Método repeat(int count) repetimos el texto concatenandolo el n�mero de veces que le digamos por argumento
		p("repeat()-> "+nuevaFrase.repeat(10));
		// Método strip() similar a trim pero reconoce más espacios en blanco
		p("trim()-> "+nuevaFrase.trim());
		p("strip()-> "+nuevaFrase.strip());
		// Método split() nos devuelve un array de char suprimiendo los argumentos que especifiquemos
		p("split()-> "+Arrays.toString(texto.split(" ")));
		
		//STRINGBUILDER
		//StringBuilder sbTexto2 = new StringBuilder("Que la fuerza te acompa�e");
		
		StringBuilder sbTexto = new StringBuilder(sc.nextLine());
		p("STRINGBUILDER\n"+sbTexto);
		// Método append(Dato nombreDato) a�ade al final de nuestro String el argumento que le pasemos (Concatena).
		sbTexto.append(" fin.");
		p("append()-> "+sbTexto);
		// Método insert(int pos, Dato nombreDato) introduce en la posici�n especificada el dato que le pasamos
		p("insert()-> "+sbTexto.insert(4, "algoNuevo"));
		// Método replace(int posInicial, int posFinal, String nuevoTexto) similar al replace de String
		// pero en este caso intercambia por posición en lugar de por valor 
		p("replace()-> "+sbTexto.replace(4,13,"Remplazo"));
		// Método delete(int posInicial, int posFinal) elimina el contenido del rango de posiciones indicado
		p("delete()-> "+sbTexto.delete(4,13));
		// Método reverse() invierte el orden de nuestro texto
		p("reverse()-> "+sbTexto.reverse());

		// compareTo(StringBuilder sb2) compara los dos stringbuilder lexicográficamente
		StringBuilder sb = new StringBuilder("Frase uno");
		StringBuilder sb2 = new StringBuilder("Frase una");
		p("compareTo()-> "+sb.compareTo(sb2));
		 
		
	}

	// [MODIFICADOR DE ACCESO][TIPO DE DEVOLUCIÓN][NOMBRE][()][{ BLOQUE DE
	// INSTRUCCIONES }]
	public static void p(String text) { // Podemos sobrecargar un método (tener distintas versiones con el mismo nombre)
		// Instrucciones				
		System.out.println(text);
	}
	public static void p(boolean text) { // Para sobrecargar un método tenemos que cambiar el número y/o tipo de parametros que 
		// Instrucciones				// el método recibe
		System.out.println(text);
	}
	public static void p(StringBuilder text) {
		// Instrucciones
		System.out.println(text);
	}
	public static void p(int text) {
		// Instrucciones
		System.out.println(text);
	}
}
