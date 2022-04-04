package com.ac3.data;

public class DatosPrimitivos {

	public static void main(String[] args) {
		// Los datos se almacenan en variables, las variables se declaran especificando su tipo de dato
		// Dentro de los tipos de datos podemos tener 1- Instancia de clases 2- Datos primitivos
		// DATOS PRIMITIVOS:
		// 1-NUMEROS ENTEROS
		
			// 1- byte: min= -128 - max= 127
		byte nByte = 127;
		nByte = (byte)(nByte + 1);
		nByte = Byte.MIN_VALUE;
		nByte = Byte.MAX_VALUE;
		System.out.println(nByte);
			// 2- short: 
		long nShort = 32000000000L;

	}
}
