package com.ac3.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MetodosStream {

	public static void main(String[] args) {

		// Creamos el stream

		// OPCION 1: A partir de una colección
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(21);
		nums.add(8);
		nums.add(105);
		nums.add(5);
		nums.add(812);
		// long l = nums.stream().filter(n -> n<=20).count();
		Stream<Integer> st = nums.stream();

		// OPCION 2: A partir de un array
		String[] cads = { "Ana","Rocio","Ana","Rocio","Manuel","Luis","Gumersindo","Rafa","Vanesa","Ricardo"};
		String[] cads2 = { "Paco", "Imanol", "Sara", "Eustaquio", "Alberto" };
		Stream<String> st2 = Arrays.stream(cads);

		// OPCION 3: A traves de un serie discreta de datos
		Stream<Double> st3 = Stream.of(2.4, 7.4, 9.1);

		// OPCION 4: A partir de un rango de datos
		IntStream stInt = IntStream.rangeClosed(1, 10);

		// OPERACIONES INTERMEDIAS

		// distinct() -> Elimina los duplicados. Deja los elementos únicos.
		s("distinct()"); // para hacer saltos de linea
		st2.distinct().forEach((s) -> System.out.print(s + " "));

		// limit(long n) -> Devuelde un stream con los primeros "n" elementos.
		s("limit()");
		st.limit(2).forEach((s) -> System.out.print(s + " "));

		// skip(long n) -> Devuelve un Stream saltando "n" elementos.
		s("skip()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		st2.skip(1).forEach((s) -> System.out.print(s + " "));

		// filter(Predicate<? super T> p) -> Devuelve un stream filtrando los elementos
		// según el criterio establecido
		s("filter()");
		st = nums.stream(); // Reinicio el Stream()
		st.filter(n -> n % 2 == 0).forEach((s) -> System.out.print(s + " "));

		// map(Function<? super T> f) -> Devuelve un stream con los elementos
		// transformados según el criterio establecido
		s("map()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		st2.map((String t) -> t.toUpperCase()).forEach((s) -> System.out.print(s + " "));

		// mapToInt(ToIntFunction<? super T> to) -> Devuelve un IntStream con la
		// transformación oportuna
		// Existen versiones para mapToDouble() y mapToLong()
		s("mapToInt()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		st2.mapToInt(name -> name.length()).forEach((s) -> System.out.print(s + " "));

		// flatMap(Function<T,Stream<R>> mapper) -> Devuelve un nuevo stream resultante
		// de unir los streams generados por la aplicación de una función de cada elemento.
		s("flatMap()");
		List<List<String>> st2List = Arrays.asList(Arrays.asList(cads), Arrays.asList(cads2)); // Reinicio el Stream
		st2List.stream().flatMap(l -> l.stream().map(s -> s.concat("nom"))).forEach((s) -> System.out.print(s + " "));

		// peek(Consumer<? super T> c) -> Devuelve un stream idéntico y realiza alguna
		// operación con los objetos intermedios
		s("peek()");
		st3.peek(d -> System.out.print(d + "- peek: ")).forEach((s) -> System.out.print(s + " "));

		// sorted(Comparator<? super Integer> c) -> Devuelve el stream
		// ordenado de forma natural o según el criterio establecido
		s("sorted()");
		st = nums.stream(); // Reinicio el Stream()
		st.sorted().forEach((s) -> System.out.print(s + " ")); // Si no le pasamos argumentos, ordenara de menor a mayor
																// (númerica o alfabeticamente)
		st = nums.stream();
		System.out.println(); // Para separar los streams
		st.sorted((a, b) -> b - a).forEach((s) -> System.out.print(s + " ")); // Podemos pasar un expresión lamba al
																				// Comparator para usar el método
																				// compare(T a,T b) con otro criterio
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(); // Para separar los streams
		st2 = Arrays.stream(cads); // Reinicio el Stream
		// Podemos usar los métodos estáticos de Comparator para establecer otros criterios
		st2.sorted(Comparator.comparing((String name) -> name.length())).forEach((s) -> System.out.print(s + " "));

		// parallel() convierte un stream en proceso paralelo. Más eficiente pero el
		// resultado puede llegar a ser impredecible
		// Podemos convertir una colección directamente a stream paralelo
		s("parallel()");
		st = nums.parallelStream(); // Reinicio el Stream directamente en paralelo
		st.parallel().forEach((s) -> System.out.print(s + " "));

		// takeWhile(Predicate<T> p) -> Tomamos un elemento hasta que encontremos el
		// elemento que coincida con el criterio condicional establecido
		s("takeWhile()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		st2.takeWhile(h -> !h.equals("Luis")).forEach((s) -> System.out.print(s + " "));

		// dropWhile(Predicate<T> p) -> Removemos un elemento hasta que encontremos el
		// elemento que coincida con el criterio condicional establecido
		s("dropWhile()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		st2.dropWhile(h -> !h.equals("Manuel")).forEach((s) -> System.out.print(s + " "));

		// OPERACIONES TERMINALES
		// anyMatch(Predicate<T> p) -> Devuelve true/false si encuentra alguna
		// coincidencia
		s("anyMatch()");
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(st.anyMatch(n -> n > 100));

		// allMatch(Predicate<T> p) -> Devuelve true/false si todos los elementos
		// coinciden con la condición
		s("allMatch()");
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(st.allMatch(n -> n > 100));

		// noneMatch(Predicate<T> p) -> Devuelve true/false si ninguno de los elementos
		// coincide con la condición
		s("noneMatch()");
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(st.noneMatch(n -> n > 100));

		// Optional<T> findFirst() -> Devuelve el primer resultado que encuentre en caso
		// de que exista.
		// La clase Optional previene de errores como NullPointerException cuando
		// analizamos un flujo que no contiene datos o en el que no hemos obtenido
		// ninguna coincidencia
		s("findFirst()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		Optional<String> op = st2.filter(s -> s.length() > 15).findFirst(); // Añadimos un filtro para dar más valor al
																			// ejemplo
		// System.out.println(op.get()); // Si descomentamos esta linea provocaremos un
		// NoSuchElementException porque no hemos encontrado coincidencia
		System.out.println(op.orElse("No hay ningun nombre con más de 15 letras")); // Alternativa orElse(arg) en el que
																					// si no tenemos ningún valor
																					// (Optional.empty) devolveremos la
																					// alternativa planteada en el
																					// argumento
		if (op.isPresent()) { // Con isPresent() comprobamos que existan elementos dentro de Optional, en caso
								// de que así sea, entraremos en el bloque if y podemos devolver el dato
			System.out.println(op.get());
		} 
		// Optional<T> findFirst() -> Devuelve el primer resultado que encuentre en caso
		// de que exista.
		// La clase Optional previene de errores como NullPointerException cuando
		// analizamos un flujo que no contiene datos o en el que no hemos obtenido
		// ninguna coincidencia
		s("findAny()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		Optional<String> op2 = st2.parallel().filter(s -> s.length() > 5).findAny(); // Añadimos un filtro para dar más
																						// valor al ejemplo y usamos
																						// stream paralelo para
																						// comprobar que el resultado es
																						// impredecible
		if (!op2.isEmpty()) { // Con isEmpty() comprobamos si Optional esta vacio, si lo negamos entraremos en
								// el bloque if cuando exista valor y podemos devolver el dato
			System.out.println(op2.get());
		}

		// reduce(BinaryOperator<T> acumulator) reduce nuestro stream a un único valor
		// según nuestra instrucción
		s("reduce()");
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(st.reduce((num1, num2) -> num1 - num2).orElse(0));

		// max(Comparator<? super T> compare) -> Establecemos un criterio de comparación
		// y obtenemos un optional del que sea el máximo valor según ese criterio
		s("max()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		System.out.println(st2.max((name1, name2) -> name1.length() - name2.length()).orElse("No hay elementos"));
		
		// min(Comparator<? super T> compare) -> Establecemos un criterio de comparación
		// y obtenemos un optional del que sea el minimo valor según ese criterio
		s("min()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		System.out.println(st2.min((name1, name2) -> name1.length() - name2.length()).orElse("No hay elementos"));
	
		// sum() -> trabaja en streams primitivos para sumar sus valores y devolverlos 
		s("sum()");
		System.out.println(stInt.mapToLong(a -> a).sum());
	
		// OptionalDouble() average() -> trabaja en streams primitivos y devuelve la media de sus valores
		s("average()");
		stInt = IntStream.rangeClosed(0, 10);
		System.out.println(stInt.mapToDouble(a -> a).average().getAsDouble());
		
		// OptionalInt max() -> trabaja en streams primitivos y devuelve el valor mayor
		s("max()");
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(st.mapToInt(a -> a).max().getAsInt());
		
		// OptionalLong min() -> trabaja en streams primitivos y devuelve el valor menor
		s("min()");
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(st.mapToLong(a -> a).min().getAsLong());
		
		//collect(Collector<? super T,U,R> col) -> convierte nuestro stream en una colección
		s("collect() - Lista");
		st = nums.stream(); // Reinicio el Stream()
		System.out.println(st.takeWhile(n -> n<100).collect(Collectors.toList()));
		s("collect() - Set");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		System.out.println(st2.collect(Collectors.toSet()));
		s("collect() - Map");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		System.out.println(st2.distinct().collect(Collectors.toMap(k -> k , v -> v.length())));
		
		//groupingBy(Function<? super T,? extends K> classifier) -> Devuelve un collector que devuelve un Map con un criterio de agrupación
		s("groupingBy()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		Map<Integer,List<String>> names = st2.collect(Collectors.groupingBy(name -> name.length()));
		System.out.println(names);
		
		//partitioningBy(Predicate<? super T> pred) -> Devuelve un map de clave boolean y una lista de objetos. Lo que cumplan la condiciones estaran en grupo true y lo que no en el grupo false
		s("partitioningBy()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		Map<Boolean,List<String>> namesR = st2.collect(Collectors.partitioningBy(name -> name.startsWith("R")));
		System.out.println(namesR);
		
		//averagingDouble(ToDoubleFunction<? super T> mapper> -> Calcula la media a partir de los valores devueltos por la función.
			// Existe también averaringInt() y averaringLong()
		s("averaringDouble()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		System.out.println(st2.collect(Collectors.averagingDouble(name -> name.length())));
		
		//summingInt(ToIntFunction<? super T> mapper) -> Permite calcular la suma a partir de los valores devueltos
			// Existe también summingLong y summingDouble
		s("summingDouble()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		System.out.println(st2.collect(Collectors.summingInt(name -> name.length())));
		
		// joining(CharSequence delimiter) -> Devuelve un collector concatenando el toString() de todos los elementos
		s("joining()");
		st2 = Arrays.stream(cads); // Reinicio el Stream
		System.out.println(st2.collect(Collectors.joining("\n")));
	}

	static void s(String m) {
		System.out.println("\n" + "-".repeat(40) + "\n" + m + ":\n");
	}
}
