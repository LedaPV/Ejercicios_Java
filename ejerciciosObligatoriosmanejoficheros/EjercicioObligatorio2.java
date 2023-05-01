package ejerciciosObligatorios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Crea una aplicación que pida el nombre de usuario y la contraseña, tanto uno
 * como otro se guardaran en una carpeta, denominado clientes y el fichero se
 * denominará usuario.txt.
 */

public class EjercicioObligatorio2 {

	public static void main(String[] args) {
		// Creamos el objeto scanner para que el programa te pida el nombre de
		// usuario y la contraseña.
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un nombre de usuario: ");
		String usuario = sc.nextLine();
		System.out.print("Introduzca una contraseña: ");
		String contraseña = sc.nextLine();

		// Variables a utilizar
		String ruta = "c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\";
		String nombrecarpeta = "clientes";

		// ----Creación de una carpeta "clientes" y un fichero "usuario.txt"----
		File a = new File(ruta + nombrecarpeta);
		if (a.exists() == true) {
			System.out.println("La carpeta está creada");
		} else {
			a.mkdir();
			System.out.println("Carpeta creada");

			// Crear un archivo dentro.
			try {
				File b = new File(a + "//usuario.txt"); // Creamos un nuevo objeto que contenga la ruta completa, más el
														// nombre del archivo.
				BufferedWriter buw = new BufferedWriter(new FileWriter(b));// En este paso, creamos el archivo llamando
																			// al objeto que contiene la ruta completa y
																			// su nombre.
				// Escribe la información que debe contener el archivode texto.
				buw.write(usuario + "\n");
				buw.write(contraseña + "\n");
				
				System.out.println("Archivo creado");
				
				buw.close();
				sc.close();
			} catch (IOException e) {
				
				// Manejamos la excepción para el caso de que se produzca un error.
				System.out.println("No se ha podido crear el archivo" + e.getMessage());
			}
		}
	}
}