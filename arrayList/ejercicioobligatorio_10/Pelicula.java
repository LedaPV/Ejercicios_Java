/**
 * Ejercicio 10, ejercicio inventado.
 * Utilizar ArrayList y sort en un ejercicio inventado o en un ejercicio
 * anterior. En este caso hemos escogido el uno de realizado anteriormente
 * de programación orientada a objetos, películas.
 */
package ejercicioobligatorio_10;

public class Pelicula implements Comparable<Pelicula> {
	// Declaramos los argumentos de Película
	private String nombre;
	private String director;
	private int duracion;
	private int año;

	// Método constructor
	public Pelicula(String nombre, String director, int duracion, int año) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.duracion = duracion;
		this.año = año;
	}

	// Método getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// Método toString
	public String toString() {
		return "Nombre: " + nombre + "\nDirector: " + director + "\nDuración: " + duracion + " minutos."+ "\nAño: " + año;
	}

	// Método compareTo para ordenar los datos de los libros en función de su título
	public int compareTo(Pelicula peliculita) {
		return this.nombre.compareTo(peliculita.nombre);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Pelicula) {
			Pelicula peliculita = (Pelicula) obj;
			return this.nombre.equals(peliculita.nombre);
		}
		return false;
	}

}
