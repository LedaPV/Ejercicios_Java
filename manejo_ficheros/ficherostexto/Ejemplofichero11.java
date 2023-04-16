package ficherostexto;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 * Elabora una actividad de escritura de uno o más ficheros que tu elijas.
 * Enunciado: Crea y escribe un archivo txt, llamado animales.txt. En él elabora
 * una lista y una vez hecho esto separa la información de ese archivo y
 * redirígela e otros dos. En el archivo animalesA, se almacenarán todas las
 * palabras escritas en la lista que contengan una letra "a"; y en el archivo
 * animalesO, se almacenarán todos las palabras escritas que contengan la letra
 * "o". Además, en caso de que todo salga correcto debemos crear un contador que
 * te diga a través de la consola, el número de animales que contienen una "a" y
 * el número de animales que contienen una letra "o" del archivo principal
 * animales.txt.
 * 
 * @author Leda
 *
 */

public class Ejemplofichero11 {
	public static void main(String[] args) {

		// Para realizar la creación y la escritura de un archivo de texto debemos
		// utilizar un try/catch.
		try {
			BufferedWriter animales = new BufferedWriter(
					new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\animales.txt"));
			// A continuación escribimos la información dentro del archivo de texto.
			animales.write("perro\n");
			animales.write("ballena\n");
			animales.write("león\n");
			animales.write("oso\n");
			animales.write("águila\n");
			animales.close();
			System.out.println("Archivo creado correctamente.");

			try {
				// Creamos los archivos de salida.
				BufferedWriter animalesA = new BufferedWriter(
						new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\animalesA.txt"));
				BufferedWriter animalesO = new BufferedWriter(
						new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\animalesO.txt"));

				// Creamos las variables que contengan la información de cada uno.
				int n_animalesA = 0;
				int n_animalesO = 0;

				// Lectura del archivo de entrada.
				BufferedReader lec_animales = new BufferedReader(
						new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\animales.txt"));

				// Definimos una variable donde almacenar de manera temporal las lecturas.
				String linea = lec_animales.readLine();

				// Describimos un bucle while junto con unas condicionales para que el programa
				// desarrolle su función correctamente.
				while (linea != null) {
					// Si la palabra contiene una letra a, se escribe en el archivo de texto
					// "animalesA.txt".
					if (linea.toLowerCase().contains("a") || linea.toLowerCase().contains("á")) {
						animalesA.write(linea + "\n");
						n_animalesA++;
					}
					// Si la palabra contiene una letra o, se escribe en el archivo de texto
					// "animalesO.txt".
					if (linea.toLowerCase().contains("o") || linea.toLowerCase().contains("ó")) {
						animalesO.write(linea + "\n");
						n_animalesO++;
					}
					linea = lec_animales.readLine(); // mover al siguiente elemento del archivo.
				}
				// Cerramos los objetos.
				lec_animales.close();
				animalesA.close();
				animalesO.close();

				// Mensajes por consola.
				System.out.println("Se han creado correctamente los archivos animalesA.txt y animalesO.txt");
				System.out.println("El archivo animalesA.txt contiene " + n_animalesA + " animales con letra a.");
				System.out.println("El archivo animalesO.txt contiene " + n_animalesO + " animales con letra o.");

			} catch (IOException a) {
				System.out.println("Error en la creación o escritura del archivo animales.txt" + a.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error al leer o escribir los archivos." + e.getMessage());
		}

	}
}
