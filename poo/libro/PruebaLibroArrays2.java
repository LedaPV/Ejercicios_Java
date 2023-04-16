package libro;

public class PruebaLibroArrays2 {

	public static void main(String[] args) {
		// Creamos los arrays de autores, título, isbn, número de páginas y precio.
		// En primer lugar creamos nuestro objeto, una lista de Libros, que va a ser
		// un array porque en él agruparemos de un tirón todos los Libros mencionados
		// en la anterior PruebaLibros.
		// Este array será un array unidimensional de 5 valores.
		Libro[] listaLibros = new Libro[5];

		// Definimos la posición para cada libro.
		listaLibros[0] = new Libro();
		listaLibros[1] = new Libro();
		listaLibros[2] = new Libro();
		listaLibros[3] = new Libro();
		listaLibros[4] = new Libro();

		// A continuación, definimos los argumentos como un array.
		String[] autor = { "Tolkien", "Frank Herbert", "Cervantes","Shakespeare","Lola Flores"};
		String[] titulo = { "El Hobbit", "Dune", "El Quijote", "Hamlet", "Si me quereís, ¡irse!" };
		String[] isbn = { "1", "2", "3", "4", "5"};
		int[] numeroDePaginas = { 200, 400, 1200, 320, 150 };
		double[] precio = { 23.40, 30.00, 55.80, 41.20, 18.42};

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
