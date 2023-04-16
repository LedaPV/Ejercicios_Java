/**
 * Realiza el mismo ejercicio, pero utilizando para ello, una clase denominada película
 * donde definiremos los siguientes atributos, nombre, director, duración y año.
 * Crearemos tres objetos de esta clase película en otra clase denominada ListaDePeliculas
 * y le daremos los valores a eligir por el alumno. 
 */
package pelicula;

import java.util.Scanner;

public class ListaDePeliculas {

	public static void main(String[] args) {

		// Creamos el array ListaDePeliculas que almanecará el número de películas
		// que queremos mostrar. En nuestro caso, será un array unidimensional de
		// tres valores.
		Scanner sc = new Scanner(System.in);
		Pelicula[] ListaDePeliculas = new Pelicula[3];

		// Definimos la posición para cada película.
		ListaDePeliculas[0] = new Pelicula();
		ListaDePeliculas[1] = new Pelicula();
		ListaDePeliculas[2] = new Pelicula();

		// Definimos a priori los atributos sin atribuirle valores.
		String[] nombre = new String[3];
		String[] director = new String[3];
		int[] duracion = new int[3];
		int[] año = new int[3];

		// A continuación, pedimos al usuario que introduzca los datos,
		// el programa los lee e incluye la información dentro de un array.
		for (int i = 0; i < ListaDePeliculas.length; i++) {
			System.out.print("Introduce el nombre de la pelicula " + (i + 1) + ": ");
			nombre[i] = sc.nextLine();
			System.out.print("Introduce su director " + ": ");
			director[i] = sc.nextLine();
			System.out.print("Cuál es su duración " + " en minutos: ");
			duracion[i] = sc.nextInt();
			System.out.print("En qué año fue su lanzamiento " + ": ");
			año[i] = sc.nextInt();
			sc.nextLine();
		}

		// Ahora mostramos el resutado.
		for (int i = 0; i < 3; i++) {
			System.out.println("Nombre: " + nombre[i] + " | Director: " + director[i] + " | Duración: " + duracion[i]
					+ " minutos | Año: " + año[i]);
		}
		sc.close();
	}

}
