package ejerciciosObligatorios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Realiza el siguiente ejercicio, utilizando la clase File y un array que me
 * muestre los ficheros por pantalla.
 */
public class EjercicioObligatorio1 {

	public static void main(String[] args) {
		File ruta = new File("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\");
		String[] lista = ruta.list();// list es listar, y lo ponemos en un array para que se
		// guarden todos los archivos tanto carpetas como ficheros.

		int i = 0;
		try {
			BufferedWriter memoria = new BufferedWriter(new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\ficheros.txt"));

			for (String nomarchivo : lista) {
				i = i + 1;
				System.out.println(i + "-" + nomarchivo); // muestra el nombre.
				memoria.write(i + "-" + nomarchivo + "\n"); // graba/escribe los nombres.
			}
			memoria.close();

		} catch (IOException e) {
			System.out.println("Error al escribir o leer el fichero: " + e.getMessage());

		}

	}

}
