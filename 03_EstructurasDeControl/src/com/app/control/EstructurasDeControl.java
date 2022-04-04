package com.app.control;

public class EstructurasDeControl {

	public static void main(String[] args) {
		//Declaramos unas variables para usar nuestras estructuras de control
		int num1 = 6, num2= 2; // Modifica los valores para obtener distintos resultados
		char letter = 'C';
		
		//EXPRESIONES CONDICIONALES
			// Las expresiones condicionales utilizan operadores relacionales y lógicas para realizar una
			// evaluación y devolver un boolean (true/false) en función del resultado
		boolean expCond = num1 > num2; // evaluamos si el número 1 es mayor que el num2
		System.out.println(expCond); // Podemos imprimir el resultado o utilizarlo en estructuras de control
		
		// OPERADORES RELACIONALES (==, !=, >, >=, <, <=)
		System.out.println("Igualdad '==' ->"+(num1==num2)); //Comprobamos si los números son iguales
		System.out.println("Desigualdad '!=' ->"+(num1!=num2)); //Comprobamos si los números son distintos
		System.out.println("Mayor '>' ->"+(num1>num2)); //Comprobamos si el primer número es mayor que el segundo
		System.out.println("Mayor o Igual '>=' ->"+(num1>=num2)); //Comprobamos si el primer número es mayor o igual que el segundo
		System.out.println("Menor '<' ->"+(num1<num2)); //Comprobamos si el primer número es menor que el segundo
		System.out.println("Menor o Igual '<=' ->"+(num1<=num2)); //Comprobamos si el primer número es menor o igual que el segundo 
			// Es habitual ver el operador aritmético '%' usandose para comprobar si un número es divisor de otro
		System.out.println("El número es divisor de 3 ->"+(num1%3==0));
		
		//ESTRUCTURA IF
		if (num1>num2) { // En los parentesis de un If ponemos una o varias condiciones a evaluar
		 // Si la condición se cumple ejecutaremos las instrucciones especificadas en el cuerpo del "if"
			System.out.println("El número "+ num1 +" es mayor que el número "+num2);
		}
		//ESTRUCTURA IF-ELSE
		if (num1>num2) { // En los parentesis de un If ponemos una o varias condiciones a evaluar
			// Si la condición se cumple ejecutaremos las instrucciones especificadas en el cuerpo del "if"
			System.out.println("El número "+ num1 +" es mayor que el número "+num2);
		}
		else {
			// Si la condición no se cumple ejecutaremos las instrucciones especificadas en el cuerpo del "else" 
			System.out.println("El número "+ num1 +" es menor que el número "+num2);
		}
		//ESTRUCTURA IF-ELSEIF-ELSE
		if (num1>num2) { // En los parentesis de un If ponemos una o varias condiciones a evaluar
			// Si la condición se cumple ejecutaremos las instrucciones especificadas en el cuerpo del "if"
			System.out.println("El número "+ num1 +" es mayor que el número "+num2);
		}
		else if(num1==num2){ // Podemos poner tantos bloques "else if" como consideremos necesarios
			System.out.println("Los números "+ num1 +" y "+ num2 +" son iguales.");			
		}
		else {
			// Si la condición no se cumple ejecutaremos las instrucciones especificadas en el cuerpo del "else" 
			System.out.println("El número "+ num1 +" es menor que el número "+num2);
		}
		
		// OPERADORES LÓGICOS -> (&& , & , || , |)
		if(num1>num2 && num1%2==0) { // El operador && es un AND con cortocircuito (Deja de evaluar cuando una de las expresiones es false) 
			//Solo realizaremos el bloque if si num1 es mayor que num2 y es par (divisor de 2)
			System.out.println("El número "+num1+"es mayor que "+num2+" y es un número par");
		} // & es un AND sin cortocircuito
		if(num1>num2 || num1%2==0) { // El operador || es un OR con cortocircuito (Deja de evaluar cuando una de las expresiones es true)
			//Solo realizaremos el bloque if si num1 es mayor que num2 y es par (divisor de 2)
			System.out.println("El número "+num1+"es mayor que "+num2+" y es un número par");
		} // | es un OR sin cortocircuito
		
		//SWITCH
			// Un switch en Java es una manera de tomar una decisión a partir de un valor dado, con varios resultados posibles.
		switch (letter) { // Para la expresión de un Switch podemos usar; byte, short, char, int, String y Enum.
			case 'A': { // Realizamos la instrucción del case si existe coincidencia entre el valor del Case y el valor de la expresión del switch
				System.out.println("La letra es una A");
				break; //Con esta sentencia salimos del bloque del "switch"
			}
			case 'B': {
				System.out.println("La letra es una B");
				break; 
			}
			case 'C','c','D','d': { //Podemos usar varios valores separados por comas. Recordemos que Java es case sensitive
				System.out.println("La letra es una C");
				break; 
			}
			default: // Si ponemos default (No obligatorio) realizaremos su instrucción cuando no exista ninguna coincidencia
				System.out.println("No reconozco la letra");
		}
	}

}
