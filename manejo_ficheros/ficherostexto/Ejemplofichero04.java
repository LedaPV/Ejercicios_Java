package ficherostexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Escribe un programa en Java que lea y muestre por pantalla el contenido del
 * fichero "asignatura.txt", que contiene las asignaturas de 1º de DAM Ejemplo
 * de uso de la clase File Lectura de un fichero de texto Muestra por pantalla
 * el contenido del fichero "asignatura.txt".
 * 
 * @author Leda
 * 
 */

public class Ejemplofichero04 {

	public static void main(String[] args) {
		try {
			// Creamos un nuevo objeto bur de BufferedReader añadiendo la ruta del archivo
			// de texto que vamos a utilizar.
			BufferedReader bur = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\asignatura.txt"));
			// Creamos la variable línea que utilizaremos en el bucle while, para manejar
			// el bucle para que imprima la información en caso de que la información
			// contenida no sea nula.
			String linea = "";
			System.out.println("Asignaturas de 1º de DAM:");
			while (linea != null) {
				linea = bur.readLine();
				if (linea != null) {
					System.out.println(linea);
				}
			}
			// Cerramos el objeto.
			bur.close();
		} catch (IOException e) {
			// Qué hacer si hay un error de lectura en el fichero.
			System.out.println("No se puede leer el fichero de asignatura.txt" + e.getMessage());
		}
	}
}
