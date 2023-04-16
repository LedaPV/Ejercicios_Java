package ejercicioobligatorio_9;

import java.util.ArrayList;
import java.util.Collections;

public class MainLibro {

	public static void main(String[] args) {

		// Creamos una lista de los libros
		ArrayList<Libro> lista_libros = new ArrayList<Libro>();

		// Incorporamos los datos de los libros en la lista que acabamos de crear
		Libro libro1 = new Libro("El señor de los anillos", "Tolkien", "aventura");
		lista_libros.add(libro1);
		Libro libro2 = new Libro("El Hobbit", "Tolkien", "aventura");
		lista_libros.add(libro2);
		Libro libro3 = new Libro("Dune", "Frank Herbert", "ciencia ficción");
		lista_libros.add(libro3);

		// Lista de libros ordenados por defecto, según hemos introducido los datos
		System.out.println("\t LIBROS");
		System.out.println("-----------------------------------");
		System.out.println("Lista de libros ordenados por defecto:");
		System.out.println();
		for (Libro book : lista_libros) {
			System.out.println(book);
			System.out.println();
		}

		// Ordenamos la lista de libros por los títulos en orden alfabético
		Collections.sort(lista_libros);

		// Imprimimos la lista de libros
		System.out.println("\nListos de libros ordenados alfabéticamente según su título");
		System.out.println();
		for (Libro book : lista_libros) {
			System.out.println(book);
			System.out.println();
		}

	}

}
