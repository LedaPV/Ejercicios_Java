package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa en Java que genere un fichero llamado "pares.txt" y
 * guarde en él los números pares del 1 al 100. El programa debe mostrar un
 * mensaje indicando que se ha creado el fichero y otro mensaje indicando el
 * número total de pares guardados en el fichero.
 * 
 * @author Leda
 *
 */

public class Ejemplofichero05 {

	public static void main(String[] args) {
		try {
			//
			BufferedWriter buw = new BufferedWriter(new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\pares.txt"));
			// Iniciamos una variable para contar el número total de pares.
			int pares = 0;
			// Bucle for para mostrar los números pares.
			for (int i = 2; i <= 100; i += 2) {
				buw.write(Integer.toString(i) + "\n");
				pares++;
			}
			// Cerramos el objeto creado.
			buw.close();
			// Mostrar por pantalla el resultado correcto.
			System.out.println("Se ha creado correctamente el fichero.");
			System.out.println("El total de números pares es: " + pares);
		} catch (IOException e) {
			// Qué debe imprimir en caso de que exista un error.
			System.out.println("No se ha podido crear ni escribir el fichero correctamente" + e.getMessage());
		}
	}
}
