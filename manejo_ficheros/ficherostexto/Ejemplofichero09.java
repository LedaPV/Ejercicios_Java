package ficherostexto;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Elabora un actividad de escritura de uno o más ficheros que tu elijas.
 * 
 * Enunciado propio: para que el ejercicio sea más completo, vamos a realizar
 * una pequeña variación del ejercicio de Ejemplofichero07. En este caso, le
 * pediremos al usuario que introduzca la información que le pedimos en dos
 * ficheros de origen. Estos ficheros se crearán, se escribirán y se leerán la
 * información contenida en ellos y se escribirán en otro documento que
 * contendrá la información completa, partiendo de ambos.
 * 
 * @author Leda
 *
 */

public class Ejemplofichero09 {

	public static void main(String[] args) {
		// Creamos un objeto Scanner para recibir información desde la consola.
		Scanner sc = new Scanner(System.in);

		// Se pide al usuario que introduzca la información contenida en los dos
		// ficheros de origen.
		System.out.println("Introduce tu color favorito en el primer fichero de origen: ");
		String color = sc.nextLine();
		System.out.println("Introduce tu modelo de coche deseado en el segundo fichero de origen: ");
		String coche = sc.nextLine();

		try {
			// Creación de ficheros "color.txt", "coche.txt" e "Informacion.txt" a partir de
			// BufferedWriter.
			BufferedWriter fichero1 = new BufferedWriter(
					new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\color.txt"));
			fichero1.write(color); // Se escribe la información contenida en el primer fichero origen.
			fichero1.newLine(); // Se inserta una nueva línea para que los datos de cada fichero queden
								// separados.

			BufferedWriter fichero2 = new BufferedWriter(
					new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\coche.txt"));
			fichero2.write(coche);// Se escribe la información contenida en el segundo fichero origen.
			fichero2.newLine();	// Se inserta una nueva línea para que los datos de cada fichero queden
								// separados.

			// Cerrar objetos.
			sc.close();
			fichero1.close();
			fichero2.close();

			try {
				// Creamos el fichero3 que contega la información total de los anteriores
				// archivos.
				BufferedWriter fichero3 = new BufferedWriter(
						new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\Informacion.txt"));

				// Leer los datos de los ficheros "color.txt" y "DNI.txt"
				BufferedReader lectura1 = new BufferedReader(
						new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\color.txt"));
				BufferedReader lectura2 = new BufferedReader(
						new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\coche.txt"));

				// Definimos dos variables tipo String que contenga la lectura total de cada
				// archivo de texto
				String colorlectura = lectura1.readLine();
				String cochelectura = lectura2.readLine();

				// Utilizamos un bucle while para que el programa lea todas las lecturas totales
				// de cada archivo hasta que sean nulas.
				while (colorlectura != null || cochelectura != null) {

					if (colorlectura != null) {
						fichero3.write(colorlectura + "\n");
						colorlectura = lectura1.readLine();
					}
					if (cochelectura != null) {
						fichero3.write(cochelectura + "\n");
						cochelectura = lectura2.readLine();
					}

				}

				// Cerramos todos los objetos creados.
				fichero3.close();
				lectura1.close();
				lectura2.close();

				// Escribimos por consola el mensaje de que todo lo anterior se ha ejecutado
				// correctamente.
				System.out.println("Archivo destino ha sido creado satisfactoriamente.");

				// Manejamos la excepción en caso de que no se pueda leer o escribir en los
				// propios ficheros.
			} catch (IOException e) {
				System.out.println("Error al escribir en los ficheros: " + e.getMessage());
			}

		} catch (IOException ex) {
			System.out.println(
					"Error al leer los ficheros datos.txt y DNI.txt, o  error al escribir y crear Informacion.txt"
							+ ex.getMessage());
		}

	}

}
