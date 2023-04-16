package ficherostexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Muéstrame el contenido del fichero anterior.
 * 
 * @author Leda
 *
 */

public class Ejemplofichero06 {

	public static void main(String[] args) {
		try {
			// Creamos un objeto, con la ruta especificada.
			BufferedReader bur = new BufferedReader(new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\pares.txt"));
			// Creamos una variable con la que poder jugar en el bucle que pueda
			// mostrar los datos en caso de que no sean nulos
			String linea = "";
			while (linea != null) {
				linea = bur.readLine();
				System.out.println(linea);
			}
			// Se cierra el objeto.
			bur.close();
			// Menejamos la excepción en caso de que exista un error.
		} catch (IOException e) {
			System.out.println("Error en la lectura del fichero" + e.getMessage());
		}

	}

}
