package com.app.control;

import java.util.Arrays;
import java.util.Scanner;

public class Bucles {
	public static void burbuja(int[]matrix) {
		int temp;
		for (int i = 1; i < matrix.length; i++) {
			System.out.println("Bucle 1 - vuelta "+i);
			for (int j = 0; j < matrix.length-1; j++) {
				System.out.println("\tBucle 2 - vuelta "+(j+1));
				System.out.println("\t\tValor en posicion "+j+" = "+matrix[j]+", Valor en posicion "+(j+1)+" = "+matrix[j+1]);
				if (matrix[j]>matrix[j+1]) {
					System.out.println("\t\tIntercambiamos posiciones");
					temp = matrix[j];
					matrix[j]=matrix[j+1];
					matrix[j+1]=temp;
					System.out.println("\t\t"+Arrays.toString(matrix));
				}
			}
		}
		System.out.println(Arrays.toString(matrix));
	}
	public static void reverse(int[]matrix) {
		int[] matrixB = new int[matrix.length];
		for (int i = matrix.length-1, j = 0; i >= 0; i--, j++) {
			matrixB[j] = matrix[i];
		}
		System.out.println(Arrays.toString(matrixB));
	}
	public static void main(String[] args) {
		int[] matrix = new int[] {3,5,7,4,2,1};
								 //3,2,1,5
								 //2,1,3,5
								 //1,2,3,5
		burbuja(matrix);
		reverse(matrix);
		
		byte numero = 0; 
		int num = 0;
		// BUCLE FOR
		// El bucle for en Java toma como punto de partida un índice de control. 
		// Al final de cada bucle, este índice se actualiza según una regla que estableces 
		// en la estructura del bucle. Acto seguido, el bucle comprueba si el índice satisface la condición booleana.
		// SINTAXIS -> for([DECLARACIÓN_INDICE];[CONDICIÓN_VUELTA_BUCLE];[ACTUALIZACIÓN_INDICE]){ }
		for (num= 0; num < 10; num++) { // Iniciamos variable en 0 (Solo en la primera vuelta ; revisamos si el número es menor a 10, 
										//en caso afirmativo entramos en el bloque de instrucciones del for 
			System.out.print(num);
		} // num++ -> Se incrementa nuestro indice en 1

		System.out.println("\nEstoy fuera del bucle For. Número de vueltas " + num);
		
		//BUCLE WHILE
		//El bucle while evalúa una condición y luego ejecuta un bloque de código si la condición es verdadera.
		while (numero<10) {
			System.out.print(numero);
			numero++; // Incrementamos nuestra variable para evitar un bucle infinito
		}
		
		System.out.println("\nEstoy fuera del bucle While. Número de vueltas " + numero);
		
		//BUCLE DO-WHILE
		//Similar al bucle while con la diferencia que la condición se evalua al final del bucle
		//por tanto, nos aseguramos que al menos vamos a entrar una vez en el bucle
		numero = 0;
		do {
			System.out.print(numero);
			numero++;
		} while (numero<10);
		System.out.println("\nEstoy fuera del bucle Do-While. Número de vueltas " + numero);
		
		//EJEMPLOS
		String text = "La casa es azul";
		String fraseEnConstruccion = "";
		
		for (int i = 3 ; i < text.length() ; i++) { // Recorremos respecto al tamaño del String(length())
			fraseEnConstruccion += text.charAt(i); // Vamos añadiendo letra a letra la frase indexando los carácteres con charAt()
			System.out.println(fraseEnConstruccion); // Imprimimos el estado actual de la frase
		}
		for (int i = text.length()-1; i >=0 ; i-- ) { // En este bucle recorremos la frase a la inversa
			fraseEnConstruccion += text.charAt(i);
			System.out.println(fraseEnConstruccion);
		}
		BucleA: //Podemos usar etiquetas para referenciar un bucle
			for (int i = 0; i < 5; i++) {
				System.out.println("BucleA "+i);
					for (int j = 3; j < 6; ) { // Podemos prescindir de alguno de los bloques. En este caso no hacemos ningún cambio en el indice j 
						System.out.println("BucleB "+j);	
						if (i>j) break BucleA; // Si cumple la condición sale del bucle B
						else continue BucleA;
						
					}
			}

		/*//Este bucle esta comentado porque aunque no nos da ningún error de compilación. Al no tener ningún bloque especificado se trata de un bucle infinito 
		for ( ; ; ) {
			System.out.println("Hola");
		}
 		*/		
		String [] nombres = {"Aurelio","Gumersindo","Eustaquio","Agapito"};
		for (int i = 0; i < nombres.length; i++) { // Es habitual recorrer arrays y colecciones con un bucle for
			System.out.println("Hola " + nombres[i]); // Indexamos cada uno de los nombres de nuestra array
		}
		//BUCLE FOR-EACH
		//El uso de Java ForEach nos permite recorrer la lista de elementos de una forma mas compacta y el código se reduce.
		for (String e : nombres) { // equivalente a -> int i = 0; i < nombres.length; i++
			// e = nombres[i]; -> Elemento indexado. Así lo hariamos en un bucle for
			System.out.println("Hola " + e); // En un bucle forEach no es necesario indexar el elemento porque en cada vuelta
											 // la variable que hemos declarado (e) tomara el valor del siguiente elemento
		}
		//El bucle for nos ofrece mayor flexibilidad porque podemos invertir el orden en el que queremos recorrer la colección
		for (int i = nombres.length-1; i >= 0; i--) {
			System.out.println("Hola " + nombres[i]);
		}
		// Podriamos realizar modificaciones para hacer lo mismo en un bucle forEach. Sin embargo no es para lo que fue diseñado
		int j = nombres.length-1;
		for (String e : nombres) { // int i = 0; i < nombres.length; i++
			// e = nombres[i];
			System.out.println("Hola " + nombres[j]);
			j--;
		}
					
		//Dentro de un bucle podemos usar cualquier estructura de control
		for (int i = 1; i < 10; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].toUpperCase().startsWith("A")) {
				System.out.println(nombres[i]);
			}
		}
		 
		
		//EJERCICIO 1 BUCLES: CREAR UN PROGRAMA QUE CONVIERTA TODAS LAS LETRAS DE UNA PALABRA EN MINUSCULAS
		//NOTA: NO SE PUEDE USAR toLowerCase()
		
		// EJERCICIO 2 BUCLES: CREAR UN PROGRAMA QUE OBTENGA LOS FACTORIALES DE LOS 10 PRIMEROS DIGITOS
		// E IMPRIMIRLOS DE LA SIGUIENTE FORMA: 1! = 1
		// PISTA: NECESITAMOS DOS BUCLES. UNO ANIDADO DENTRO DEL OTRO.
		
		//EJERCICIO 3 BUCLES: CREAR UN MENÚ PARA USAR MÉTODOS QUE CONTENGAN LA LÓGICA DE LOS DOS EJERCICIOS ANTERIORES
		
		// SOLUCIÓN EJERCICIO 3:
		Scanner sc = new Scanner(System.in); // Scanner para recoger texto por teclado
		boolean isActive = true; // Booleano que maneja el bucle de nuestro menú
		int key = 0; // Variable númerica para las opciones del menú = case del switch
		String word = "";
		do { // En este caso usamos un bucle do-while y así nos aseguramos que el usuario vea el menú al menos una vez		
			System.out.println("\nElija una opción: " //Mensaje por consola para indicar las opciones de nuestro menú
					+ "\n1-MINUSCULAS"
					+ "\n2-FACTORIAL"
					+ "\n3-SALIR");
			key = sc.nextInt(); // Asignamos el valor indicado por el usuario a nuestra variable
			switch (key) {
				case 1:
					System.out.println("Introduza una palabra en mayusculas: ");
					//sc.useDelimiter("\n");
					word = sc.next(); //Recogemos el texto que el usuario escribe por teclado
					System.out.println(minisculas(word)); //Llamamos al método que tiene la lógica del ejercicio 1
					break;
				case 2:
					System.out.println("Introduzca un número para calcular su factorial: ");
					factorial(sc.nextLong()); //Llamamos al método que tiene la lógica del ejercicio 2 pasandole el valor por teclado
					break;
				case 3:
					isActive = false; // Ponemos el booleano en false para salir del bucle
					System.out.println("Gracias por usar la aplicación.");
					break;
				default:
					System.out.println("La opción seleccionada no esta disponible. Intentelo de nuevo.");
					break;
			}
		} while (isActive); //Verificamos el booleano. Si es true entramos en un nuevo ciclo
		sc.close();
		 
		// BUCLE (DO WHILE - WHILE) -> PETICIÓN DATO NÚMERICO -> INSTRUCCIÓN / SALIR DEL PROGRAMA 
		// LA CONDICIÓN PARA SALIR DEL PROGRAMA SERÁ QUE EL USUARIO PASE UN NÚMERO NEGATIVO
		int num2 = -1;
		Bucle1:
		while (num2 <= 10 && num2>=0) {			
			System.out.println(num2+" Bucle 1");
			do {
				num2++;
				if (num2 >= 5) {
					continue Bucle1;
				}
				System.out.println(num2);
			} while (num2>0);
		}
		System.out.println(num2);
	}

	
	public static String minisculas(String text) { // Método del ejercicio 1
		String textMin = ""; //Variable String para la frase que vamos a crear en minusculas
		char letra; //Variable para verificar si el caracter se trata de una letra o no
		for (int i = 0; i <text.length() ; i++ ) { //Creamos un bucle que recorre el texto 
			letra = text.charAt(i); //Recogemos el caracter
			if (letra >= 65 && letra<=90) { //Si el caracter esta entre los valores ASCII comprendidos en estas dos expresiones es una letra mayusculas
				letra += 32; // Sumando 32 obtenemos el valor en ASCII de la letra en minisculas
			}
			else if(letra == 209) { // Revisamos si se trata de la letra Ñ
				letra = 241; // Asignamos "ñ" en codigo ASCII
			}
			textMin += letra; //Añadimos el caracter a nuestra texto modificado		
		}
		return textMin; //Devolvemos el texto modificado
	}
	public static void factorial(long num) { // Creamos un método para realizar el ejercicio de los
		long fact; //Creamos una variable que utilizaremos para inprimir nuestro factorial
		for (long i = 0; i <= num; i++) { //El primer bucle recorre los números comprendidos entre 0 y el número dado como argumento
			fact = 1; // Asignamos el valor 1 a nuestro factorial
			for (int j = 2; j <= i; j++) { //Recorremos el bucle tantas veces como valores comprendidos entre 2 y el valor actual del indice i
				fact *=j; //Multiplicamos el valor actual por el indice j. Similar a -> fact = fact*j;
			}
			System.out.println(i+"!= "+fact); //Imprimimos el factorial
		}	
	}
	public static void pause(Scanner sc) {
		System.out.println("Presione enter para continuar...");
		sc.next();
	}
}
