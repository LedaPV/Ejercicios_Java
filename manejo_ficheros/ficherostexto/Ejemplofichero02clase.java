package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejemplo de clase para el uso de la clase File Escritura en un fichero de
 * texto.
 *
 * @author Leda
 */

public class Ejemplofichero02clase {

	public static void main(String[] args) {
		try {
			// Creamos un objeto de BufferedWriter y le damos la ruta donde estará el
			// archivo de texto.//
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\fruta.txt.txt"));
			// No añade, pisa el fichero con los datos que se metan si se ejecuta de
			// nuevo.//
			// Introducimos las líneas a escribir.//
			bw.write("naranja\n");
			bw.write("mango\n");
			bw.write("chirimoya\n");
			bw.write("fresa\n");
			System.out.println("Fichero creado");
			bw.close();
		} catch (IOException e) {
			// Manejamos la excepción para el caso de que se produzca un error.//
			System.out.println("No se ha podido escribir en el fichero" + e.getMessage());
		}
	}
}
