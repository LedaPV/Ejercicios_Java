package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * En esta actividad, se te solicita crear un programa Java que cree un archivo
 * de texto llamado "asignatura.txt" y que grabe las asignaturas del primer año
 * de DAW (Desarrollo de Aplicaciones Web).
 * 
 * @author Leda
 *
 */

public class Ejemplofichero03 {
	public static void main(String[] args) {
		try {
			// Creamos un nuevo objeto buw de BufferedWriter añadiendo la ruta del archivo
			// de texto que vamos a utilizar.
			BufferedWriter buw = new BufferedWriter(
					new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\asignatura.txt"));
			// Llamamos al objeto para que escriba las lías que están contenidas en el
			// archivo
			// de texto.
			buw.write("Programación\n");
			buw.write("Bases de datos\n");
			buw.write("Entornos de desarrollo\n");
			buw.write("Lenguaje de marcas\n");
			buw.write("Sistemas informáticos\n");
			// Cerramos el objeto.
			buw.close();
			// Mensaje en el caso de que encuentre la ruta y deposite la información en el
			// archivo.
			System.out.println("El archivo se ha creado correctamente");
		} catch (IOException e) {
			// Manejo de la excepción en caso de error.
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}
	}

}
