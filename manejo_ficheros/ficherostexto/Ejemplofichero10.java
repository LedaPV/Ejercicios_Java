package ficherostexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Elabora una actividad de lectura del o los ficheros creados anteriormente.
 * 
 * @author Leda
 *
 */
public class Ejemplofichero10 {

	public static void main(String[] args) {
		try {
			// Para leer la informacion de los ficheros utilizaremos BufferedReader.
			BufferedReader lec_color = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\color.txt"));
			BufferedReader lec_coche = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\coche.txt"));
			BufferedReader lec_info = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\Informacion.txt"));

			// Definimos una variable (de una cadena de caracteres vacía) para almacenar
			// temporalmente la información
			// de las lecturas.
			String linea1 = "";
			String linea2 = "";
			String linea3 = "";

			// Iniciamos los bucle while
			// Primero comenzaremos con el bucle correspondiente a la lectura de datos de
			// color.txt.
			while (linea1 != null) {
				linea1 = lec_color.readLine(); // Se almacena en la lectura del objeto en dicha variable.
				if (linea1 != null) {
					System.out.println("Datos/información de color.txt: " + linea1); // Se muestra por consola la
																						// información.
				}
			}
			// Cerramos el objeto que acabamos de utilizar.
			lec_color.close();

			// Iniciamos el segundo bucle while para la lectura de datos de coche.txt.
			while (linea2 != null) {
				linea2 = lec_coche.readLine();
				if (linea2 != null) {
					System.out.println("Datos/información de coche.txt: " + linea2);
				}
			}
			// Cerramos el objeto.
			lec_coche.close();

			// Iniciamos el bucle while correspondiente a la lectura del archivo
			// Informacion.txt.
			while (linea3 != null) {
				linea3 = lec_info.readLine();
				if (linea3 != null) {
					System.out.println("Datos/información por cada línea de Informacion.txt: " + linea3);
				}
			}
			// Cerramos el objeto.
			lec_info.close();

			System.out.println("Se han leído correctamente los distintos archivos de texto.");
		} catch (IOException e) {
			System.out.println("Se ha producido un error en la lectura de los archivos: " + e.getMessage());
		}
	}

}
