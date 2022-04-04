package com.app.main;

public class DatosPrimitivos { // Main

	String nombre;
	String apellido;

	// DRY (Don't repeat yourself)
	public String saludarNombreCompleto() { // Método que devuelve un dato de tipo String
		// Instrucciones de la acción que hace mi método
		String nombreCompleto = "Hola " + nombre + " " + apellido;
		return nombreCompleto;
	}

	public static void main(String[] args) {

		// TIPOS DE DATOS PRIMITIVOS
		// Datos númericos
			// Números enteros
		byte numByte = -127; // Este tipo de dato comprende números enteros entre -128 / 127
		short numShort = -32767; // Este tipo de dato admite números enteros comprendidos entre -32768/32767
		int numInt = 10; // " " basado en 32 bits, su rango es (-2^31 / 2^31-1)
		long numLong = -1234567891312412331l; // "" basado en 64 bits, su rango (-2^63 / 2^63-1)
			// Números decimales
		float numFloat = -4.123f; // Número decimal basado en 32 bits
		double numDouble = -15.1212313; // Número decimal basado en 64 bits
		
		// Datos no númericos
		char letter = 'A'; // Tipo de dato que sirve para espresar caracteres alfanúmericos
		boolean condition = true; // Valor basado en verdadero o falso (true/false) unidad de 1 bit.
			//Imprimimos en consola nuestras variables para ver su valor actual
		System.out.println("byte: "+numByte+
				"\nshort: "+numShort+
				"\nint: "+numInt+
				"\nlong: "+numLong+
				"\nfloat: "+numFloat+
				"\ndouble: "+numDouble+
				"\nchar: "+letter+
				"\ncondition: "+condition);
		// Especial (No es un tipo de dato primitivo pero se usa de forma similar, sin necesidad de instancia)
		String text = "Bienvenidos al primer dia de curso"; // Cadena de caracter o texto plano
		System.out.println(text);
		//Tipo inferido
		var var1 = 10.5f; // => Float //Adopta el tipo del valor por el que es inicializada
		System.out.println(((Object)var1).getClass().getSimpleName());
		
		//CLASES ENVOLTORIO (WRAPPER)
			//Estas clases disponen de mecanismos para envolver un tipo de dato primitivo permitiendonos
			//tratarlos como objetos y usar métodos que nos aportan distintas funcionalidades.
		@SuppressWarnings("deprecation")
		Integer numInteger = new Integer(2); // Aunque se puede usar una instancia, este sistema esta obsoleto
			//AUTOBOXING
		numInteger = numInt; // Un tipo primitivo es automáticamente encapsulado (boxed) en su envoltura (wrapper) de tipo equivalente
			//AUTOUNBOXING
		numInt = numInteger; // Es el proceso inverso al anterior. Pasamos de envoltura (wrapper) a dato primitivo equivalente.
		Byte numByteWrapper = numByte;
		numByte = numByteWrapper.byteValue(); // Podemos usar métodos que devuelven el valor en forma del dato primitivo.
		Short numShortWrapper = 24; // También podemos inicializar la variable a un dato valido y este se convierte automáticamente
		System.out.println(numShortWrapper.compareTo(numShort)); //Podemos usar métodos propios de los objetos (Object)
		Long numLongWrapper = Long.MAX_VALUE; // Podemos asignar el valor de una constante que nos da el valor máximo disponible en Long
		System.out.println(numLongWrapper);
		Float numFloatWrapper = Float.MIN_VALUE; // Podemos asignar el valor de una constante que nos da el valor minimo disponible en Long
		System.out.println(numFloatWrapper);
		Double numDoubleWrapper = Double.valueOf(24.8); // Podemos usar el método estático valueOf(dato) para dar valor
		System.out.println(numDoubleWrapper+109.12); // Al igual que con los datos primitivos, podemos realizar operaciones aritméticas
		Character charWrapper = 'B';
		System.out.println(charWrapper.charValue());
		Boolean booleanWrapper = Boolean.FALSE;
		System.out.println(booleanWrapper);
		
	}
}
