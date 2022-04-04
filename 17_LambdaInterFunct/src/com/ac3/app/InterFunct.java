package com.ac3.app;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class InterFunct {

	public static void main(String[] args) {

		// Ejemplos de interfaces funcionales con expresiones lambda
		// PREDICATE
		Predicate<String> isBigger = x -> x.length() > 5;
		System.out.println(isBigger.test("casa"));
		isBigger = (String a) -> a.startsWith("r");
		System.out.println(isBigger.test("rosa"));
		BiPredicate<String, Integer> isSmaller = (text, number) -> text.length() < number;
		System.out.println(isSmaller.test("rododendro", 1));

		// Creamos dos personas para utilizarlas con un nuevo Predicate
		Persona p1 = new Persona("Alvaro", 21);
		Persona p2 = new Persona("Sandra", 28);
		BiPredicate<Persona, Persona> isOlder = (var ps1, var ps2) -> {
			ps1.setAge(30);
			return ps1.getAge() > ps2.getAge();
		};
		System.out.println(isOlder.test(p1, p2));
		System.out.println(p1.getAge() > p2.getAge());

		// FUNCTION
		Function<Persona, Integer> addOneYear = (x) -> x.getAge() + 1;
		System.out.println(addOneYear.apply(p2));
		BiFunction<Persona, Persona, Double> sumYears = (a, b) -> 0.0 + a.getAge() + b.getAge(); // Interfaz<? super T>
		System.out.println(sumYears.apply(p1, p2)); // Interfaz<? extends T>
		DoubleFunction<?> square = (d) -> d * d;
		System.out.println(square.apply(25.5));
		IntFunction<?> i = a -> a;
		System.out.println(i.apply(5));

		// SUPPLIER
		Supplier<String> greetings = () -> "hello"; // {return "hello";}
		System.out.println(greetings.get());
		LongSupplier g = () -> 100 * 100;
		System.out.println(g.getAsLong());

		// CONSUMER
		Consumer<Persona> resetName = x -> x.setName(null);
		resetName.accept(p2);
		System.out.println(p2.getName());
		BiConsumer<Persona, Persona> showNames = (s, h) -> System.out.println(s.getName() + " " + h.getName());
		showNames.accept(p1, p2);
		DoubleConsumer showInt = x -> {
			x = (double) square.apply(x);
			System.out.println(x);
		};
		showInt.accept(10);
		
		// Ejercicio 1: Dada la siguientre lista de personas, mostrar los nombres de 
		// las personas ordenadas por edad. Interfaz Comparator.
		List<Persona> personas = new ArrayList<>(List.of(
				new Persona("Marco",34),
				new Persona("Ana",28),
				new Persona("Bea",41))); 
		personas
		// Comparable -> int compareTo(T t) <--> Comparator -> int compare(T t, T t2)
		.sort((persona1,persona2) -> persona2.getAge()-persona1.getAge());
		personas.forEach(s -> System.out.println(s.getName())); 
		
		// Ejercicio 2: Dada una lista de números, escribir un bloque de código que muestre solamente
		// los números pares ordenados de mayor a menor.
		List<Integer> nums = new ArrayList<>(List.of(10,4,21,7,28,40,11,23));
		nums.removeIf(num-> num%2!=0);
		//nums.sort((x,y) -> y-x);
		nums.sort(Comparator.reverseOrder());

	}

}

class Persona {
	private String name;
	private int age;

	public Persona(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}