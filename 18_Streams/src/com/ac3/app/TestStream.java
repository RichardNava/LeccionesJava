package com.ac3.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	static List<Movie> movies = new ArrayList<Movie>();

	public static void main(String[] args) {

		// Creamos el Stream con el que realizaremos distintos ejercicios
		Stream<Movie> moviesStream = movies.stream();

		// Ejercicio 1: Seleccionar todas las peliculas del Siglo XX y agruparlas por
		// género

		Map<String, List<Movie>> moviesSXX = moviesStream
												.filter((Movie m) -> m.getYear() < 2000)
												.collect(Collectors.groupingBy((Movie m) -> m.getGenre()));
		//moviesSXX.forEach((k, v) -> System.out.println(k + " : " + v));

		// Ejercicio 2: Dividir las peliculas suspendidas y las que estan aprobados en
		// dos grupos y modificar su nota.
		// Aprobando aquellas que esten suspendidas siempre y cuando el director no sea
		// J.J.Abrams. En el caso de las aprobadas
		// si la pélicula es de la década de los 90 le bajaremos la nota un punto.
		// Finalmente, agrupar las peliculas
		// por director e imprimirlas
		

		movies.stream().collect(Collectors.partitioningBy((Movie m) -> m.getRating().doubleValue() >= 5))	// false: lista suspendidas - 0
																											// true: lista aprobadas - 1
		.forEach((k, v) -> {
			if (k) { // Si es True = Aprobadas -> Instrucciones: 
				v.stream() // Convierto la lista de peliculas aprobadas en otro stream
				 .filter(m -> m.getYear() >= 1990 && m.getYear() <= 1999) // filtro las peliculas de la decada de los 90
				 .forEach(m -> m.setRating( 
						 BigDecimal.valueOf(m.getRating().doubleValue() - 1).setScale(2, RoundingMode.HALF_UP))); // Modificamos el valor de la nota (-1 punto)
			} else { // Si es False = Suspendidas -> Instrucciones:
				v.stream() // Convierto la lista de peliculas suspendidas en otro stream
				 .filter(m -> m.getDirector() != "J.J. Abrams") // Filtro por los directores que no sean J.J.Abrams
				 .forEach(m -> BigDecimal.valueOf(5).setScale(2, RoundingMode.HALF_UP)); // Asignamos 5 a la nota de las peliculas
			}
		}); //  
		movies.stream()
		      .collect(Collectors.groupingBy(m -> m.getDirector()))
			  .forEach((k, v) -> System.out.println(k + ": \n" + v));

		// Ejercicio 3: Crear un método que reciba como argumento un género y mediante un stream dicho método 
		// nos devolvera una pélicula al azar que sea de ese género.
		System.out.println("Película para ver hoy "+printMovie(findMovieByGenre("Thriller")));
		
		// Ejercicio 4: Crear un método que nos devuelva el número de peliculas aprobadas en un rango de años.
		int startYear=1900, endYear= 1996;
		System.out.println("Películas aprobadas entre "+startYear+" y "+endYear+": "+passMovies(startYear,endYear));
		
		// Ejercicio 5: Crear un método al cual le pasamos un director y nos diga la media de nota de sus películas
		// otro método que nos dice el número de películas que tenemos de ese director
		// y otro que, usando los dos métodos, nos imprima un mensaje que diga las películas del director con su nota media
		printSelectedDirector("Quentin Tarantino");

	}
	
	static void printSelectedDirector (String director){
		System.out.printf("El director %S tiene %d películas en nuestra base de datos, con una valoración media de %.2f."
				,director,moviesByDirector(director),directorAvgRating(director));
	}
	
	static long moviesByDirector (String director) {
		return movies.stream()
				.filter(m -> m.getDirector().equals(director))
				.count();
	}
	static long moviesByDirector (String director, List<Movie> movies) {
		int count = 0;
		for (Movie m : movies) count += (m.getDirector().equals(director)) ? 1 : 0;
		return count;
	}
	static double directorAvgRating (String director) {
		return movies.parallelStream()   //Método de colección, no de Stream
				.filter(m -> m.getDirector().equals(director)) 
				.mapToDouble(m -> m.getRating().doubleValue())
				.average()
				.orElse(0);			
	}

	static long passMovies(int startYear, int endYear) {
		return movies.stream()
			  .filter(m -> m.getYear() >= startYear && m.getYear() <= endYear)
			  .mapToInt(m -> (int)m.getRating().doubleValue())
			  .filter(r -> r >=5)
			  .count();
	}
	
	static Optional<Movie> findMovieByGenre(String genre) {
		return movies.stream()
				.parallel()
				.filter(m -> m.getGenre().equals(genre))
				.findAny();
	}
	static String printMovie(Optional<Movie> movie) {
		if (movie.isPresent()) {
			return movie.get().toString();
		} else {

			return "No existe una película con el género escogido";
			
		}
	}
	static {
		movies.add(new Movie("El Club de la Lucha", "Thriller", "David Fincher", BigDecimal.valueOf(10), 1999));
		movies.add(new Movie("Aguirre, la Colera de Dios", "Épica", "Werner Herzog", BigDecimal.valueOf(8.5), 1975)); // Ver Enemigos Intimos
		movies.add(new Movie("Crepúsculo", "Romántica", "Catherine Hardwicke", BigDecimal.valueOf(3.2), 2008));
		movies.add(new Movie("La Naranja Mecánica", "Thriller", "Stanley Kubrick", BigDecimal.valueOf(8), 1975));
		movies.add(new Movie("Johnny Cogio su Fusil", "Drama", "Dalton Trumbo", BigDecimal.valueOf(7.8), 1971));
		movies.add(new Movie("El Diario de Noa", "Romántica", "Nick Cassavetes", BigDecimal.valueOf(5), 2004));
		movies.add(new Movie("Forrest Gump", "Drama", "Robert Zemeckis", BigDecimal.valueOf(8), 1994));
		movies.add(new Movie("Alejandro Magno", "Épica", "Oliver Stone", BigDecimal.valueOf(4.2), 2004));
		movies.add(new Movie("Ciudadano Kane", "Drama", "Orson Welles", BigDecimal.valueOf(10), 1946));
		movies.add(new Movie("2001 Una Odisea en el Espacio", "Ciencia Ficción", "Stanley Kubrick",
				BigDecimal.valueOf(7), 1968));
		movies.add(new Movie("Star Wars Episodio 4", "Ciencia Ficción", "George Lucas", BigDecimal.valueOf(7.5), 1977));
		movies.add(new Movie("Star Wars: El Despertar de la Fuerza", "Ciencia Ficción", "J.J.Abrams",
				BigDecimal.valueOf(3), 2015));
		movies.add(new Movie("Star Wars: El Último Jedi", "Ciencia Ficción", "Rian Johnson", BigDecimal.valueOf(3.2),
				2017));
		movies.add(new Movie("Star Wars: El Ascenso de SkyWalker ", "Ciencia Ficción", "J.J.Abrams",
				BigDecimal.valueOf(3.5), 2019));
		movies.add(new Movie("Tienes un email", "Romántica", "Nora Ephron", BigDecimal.valueOf(2.5), 1999));
		movies.add(new Movie("Kill Bill: Volumen 1", "Thriller", "Quentin Tarantino", BigDecimal.valueOf(7.7), 2003));
		movies.add(new Movie("Pulp Fiction", "Thriller", "Quentin Tarantino", BigDecimal.valueOf(8.4), 1994));
		movies.add(new Movie("Django Desencadenado", "Western", "Quentin Tarantino", BigDecimal.valueOf(6.3), 2012));
		movies.add(new Movie("Los Odiosos Ocho", "Western", "Quentin Tarantino", BigDecimal.valueOf(8), 2015));
	}
}

class Movie {
	private String name;
	private String genre;
	private String director;
	private BigDecimal rating;
	private int year;

	public Movie(String name, String genre, String director, BigDecimal rating, int year) {
		super();
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.rating = rating;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "\n\tNOMBRE: " + name + " GENERO: " + genre + " DIRECTOR: " + director + " VALORACIÓN: " + rating
				+ " AÑO: " + year+"\n";
	}

}
