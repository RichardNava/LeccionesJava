package com.ac3.app;

import com.ac3.models.Avion;
import com.ac3.models.Bicicleta;
import com.ac3.models.Coche;
import com.ac3.models.Vehiculo;

public class TestHerencia extends Vehiculo {

	public static void main(String[] args) {
		
		Vehiculo v = new Vehiculo();
		Coche c = new Coche("Coche", 5, 2.0, 5.2, 3.5, "Mercedes");
		Coche c2 = new Coche();
		Avion a = new Avion("Avion",150,8.5,25.6,7.9,2);
		Bicicleta b = new Bicicleta("Bicicleta", 1, 1, 15, 0.4, 2);
		c.ruido("BrmmBrmm");
		b.ruido("RingRing");

	}
}
