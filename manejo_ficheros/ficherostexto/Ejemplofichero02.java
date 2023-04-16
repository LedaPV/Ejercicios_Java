package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * En esta actividad se te solicita crear un programa Java llamado
 * "EjemploFichero02" que utilice la clase "BufferedWriter" para escribir en un
 * archivo de texto llamado "clientes.txt". Este archivo se encuentra en la ruta
 * "c:\\DIGITECH\\xx.EJERCICIOS\\Prueba" y debe contener las siguientes líneas
 * de texto: Alberto, Eva, Laura y Antonio.
 *
 * @author Leda
 */
public class Ejemplofichero02 {
	public static void main(String[] args) {
		try {
			// Creamos un objeto de BufferedWriter y le damos la ruta donde estará el
			// archivo de texto.//
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\clientes.txt.txt"));
			// No añade, pisa el fichero con los datos que se metan si se ejecuta de nuevo//
			// Introducimos las líneas a escribir.//
			bw.write("Alberto\n");
			bw.write("Eva\n");
			bw.write("Laura\n");
			bw.write("Antonio\n");
			System.out.println("Fichero creado");
			bw.close();
		} catch (IOException e) {
			// Manejamos la excepción para el caso de que se produzca un error.//
			System.out.println("No se ha podido escribir en el fichero" + e.getMessage());
		}
	}

}
