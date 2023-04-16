package ficherostexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de uso clase File en una lectura de un fichero de texto. Enunciado:
 * Escribe un programa que lea el contenido de los tres ficheros creados en la
 * actividad anterior y los muestre por pantalla.
 * 
 * @author Leda
 *
 */
public class Ejemplofichero08 {

	public static void main(String[] args) {
		try {
			// Para leer la informacion de los ficheros utilizaremos BufferedReader.
			BufferedReader lec_fi1 = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\fichero1.txt"));
			BufferedReader lec_fi2 = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\fichero2.txt"));
			BufferedReader lec_mix = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\mezcla.txt"));

			// Definimos una variable (de una cadena de caracteres vacía) para almacenar
			// temporalmente la información
			// de las lecturas.
			String linea1 = "";
			String linea2 = "";
			String linea3 = "";

			// Iniciamos los bucle while
			// Primero comenzaremos con el bucle correspondiente a la lectura de datos de
			// fichero.txt.
			while (linea1 != null) {
				linea1 = lec_fi1.readLine(); // Se almacena en la lectura del objeto en dicha variable.
				if (linea1 != null) {
					System.out.println("Datos/información de fichero1.txt: " + linea1); // Se muestra por consola la
																						// información.
				}
			}
			// Cerramos el objeto que acabamos de utilizar.
			lec_fi1.close();

			// Iniciamos el segundo bucle while para la lectura de datos de fichero2.txt.
			while (linea2 != null) {
				linea2 = lec_fi2.readLine();
				if (linea2 != null) {
					System.out.println("Datos/información de fichero2.txt: " + linea2);
				}
			}
			// Cerramos el objeto.
			lec_fi2.close();

			// Iniciamos el bucle while correspondiente a la lectura del archivo mezcla.txt.
			while (linea3 != null) {
				linea3 = lec_mix.readLine();
				if (linea3 != null) {
					System.out.println("Datos/información por cada línea de mezcla.txt: " + linea3);
				}
			}
			// Cerramos el objeto.
			lec_mix.close();

			System.out.println("Se han leído correctamente los distintos archivos de texto.");
		} catch (IOException e) {
			System.out.println("Se ha producido un error en la lectura de los archivos: " + e.getMessage());
		}
	}

}
