
package ejercicioobligatorio_10;

import java.util.ArrayList;
import java.util.Collections;

public class MainPelicula {

	public static void main(String[] args) {
		// Creamos una lista de las peliculas
		ArrayList<Pelicula> lista_peliculas = new ArrayList<Pelicula>();

		// Incorporamos los datos de los libros en la lista que acabamos de crear
		Pelicula pelicula1 = new Pelicula("Cangrejo negro", "Adam Berg", 112, 2022);
		lista_peliculas.add(pelicula1);
		Pelicula pelicula2 = new Pelicula("Marte", "Ridley Scott", 142, 2015);
		lista_peliculas.add(pelicula2);
		Pelicula pelicula3 = new Pelicula("Z, la ciudad perdida", "James Grey", 141, 2016);
		lista_peliculas.add(pelicula3);

		// Lista de libros ordenados por defecto, según hemos introducido los datos
		System.out.println("\t \t PELÍCULAS");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("--------------------------Lista de películas ordenadas por defecto:");
		System.out.println();
		for (Pelicula film : lista_peliculas) {
			System.out.println(film);
			System.out.println();
			
		}

		// Ordenamos la lista de libros por los títulos en orden alfabético
		Collections.sort(lista_peliculas);

		// Imprimimos la lista de libros
		System.out.println("\n------------------------Lista de películas ordenados alfabéticamente según su nombre:");
		System.out.println();
		for (Pelicula film : lista_peliculas) {
			System.out.println(film);
			System.out.println();
		}

	}

}
