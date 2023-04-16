/**
 * En esta clase "PruebaLibro" creamos los objetos que corresponden a la clase libro
 * y le damos valores.
 */
package libro;

public class PruebaLibro {

	public static void main(String[] args) {

		// Vamos a crear tres objetos, tres libros.
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		Libro libro3 = new Libro();

		// A continuación le damos sus valores correspondientes.
		// libro1
		libro1.autor = "Tolkien";
		libro1.isbn = "1";
		libro1.numeroDePaginas = 200;
		libro1.titulo = "El Hobbit";
		libro1.precio = 23.40;

		// libro2
		libro2.autor = "Frank Herbert";
		libro2.isbn = "2";
		libro2.numeroDePaginas = 400;
		libro2.titulo = "Dune";
		libro2.precio = 30.00;

		// libro3
		libro3.autor = "Cervantes";
		libro3.isbn = "3";
		libro3.numeroDePaginas = 1200;
		libro3.titulo = "El Quijote";
		libro3.precio = 50.80;

		// A continuación mostramos los valores.
		System.out.println(libro1.titulo + "| " + libro1.autor + "| " + libro1.isbn + "| " + libro1.numeroDePaginas
				+ "| " + libro1.precio + " ");
		System.out.println(libro2.titulo + "| " + libro2.autor + "| " + libro2.isbn + "| " + libro2.numeroDePaginas
				+ "| " + libro2.precio + " ");
		System.out.println(libro3.titulo + "| " + libro3.autor + "| " + libro3.isbn + "| " + libro3.numeroDePaginas
				+ "| " + libro3.precio + " ");
	}

}
