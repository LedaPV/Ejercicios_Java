/**
 * Agrupamos toda la información de los diferentes libros en un array, convitiendo
 * a éste array en un objeto.
 */
package libro;

public class PruebaLibroArrays {

	public static void main(String[] args) {

		// Creamos los arrays de autores, título, isbn, número de páginas y precio.
		// En primer lugar creamos nuestro objeto, una lista de Libros, que va a ser
		// un array porque en él agruparemos de un tirón todos los Libros mencionados
		// en la anterior PruebaLibros.
		// Este array será un array unidimensional de 5 valores.
		Libro[] listaLibros = new Libro[3];

		// Definimos la posición para cada libro.
		listaLibros[0] = new Libro();
		listaLibros[1] = new Libro();
		listaLibros[2] = new Libro();

		// A continuación, definimos los argumentos como un array.
		String[] autor = { "Tolkien", "Frank Herbert", "Cervantes" };
		String[] titulo = { "El Hobbit", "Dune", "El Quijote" };
		String[] isbn = { "1", "2", "3" };
		int[] numeroDePaginas = { 200, 400, 1200 };
		double[] precio = { 23.40, 30.00, 55.80 };

		// Incluimos un ciclo for para que la máquina lea y almacene los resultados.
		for (int i = 0; i < listaLibros.length; i++) {
			listaLibros[i].autor = autor[i];
			listaLibros[i].titulo = titulo[i];
			listaLibros[i].isbn = isbn[i];
			listaLibros[i].numeroDePaginas = numeroDePaginas[i];
			listaLibros[i].precio = precio[i];
		}

		// Añadimos otro ciclo for para que esta vez muestre los resultados.
		for (int i = 0; i < listaLibros.length; i++) {
			System.out.println("Autor: " + listaLibros[i].autor + "| Título: " + listaLibros[i].titulo + "| ISBN: "
					+ listaLibros[i].isbn + "| Páginas: " + listaLibros[i].numeroDePaginas + "| Precio: "
					+ listaLibros[i].precio + " euros.");
		}

	}

}
