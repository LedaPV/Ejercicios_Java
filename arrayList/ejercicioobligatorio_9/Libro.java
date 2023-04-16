package ejercicioobligatorio_9;

/**
 * Ejercicio 9: ArrayList con objetos y el uso del sort. Utiliza para ello 3
 * objetos con los siguientes datos: El señor de los anillos, Tolkien, aventura.
 * El Hobbit, Tolkien, aventura. Dune, Frank Herbert, ciencia ficción.
 */

public class Libro implements Comparable<Libro> {
	// Declaramos los atributos de Libro
	private String titulo;
	private String autor;
	private String tema;

	// Método constructor
	public Libro(String titulo, String autor, String tema) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
	}

	// Método getter y setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	// Método toString
	public String toString() {
		return "Titulo: " + titulo + "\nAutor: " + autor + "\nTema: " + tema;
	}

	// Método compareTo para ordenar los datos de los libros en función de su título
	public int compareTo(Libro librito) {
		return this.titulo.compareTo(librito.titulo);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Libro) {
			Libro librito = (Libro) obj;
			return this.titulo.equals(librito.titulo);
		}
		return false;
	}
}