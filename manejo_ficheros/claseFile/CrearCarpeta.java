package claseFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearCarpeta {

	public static void main(String[] args) {
		// Se crean dos variables para contener la ruta y la carpeta y que el código sea más efectivo.
		String ruta= "c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\";
		String carpeta= "ejercicio1";
		
		// Se crea un objeto fichero
		File fichero = new File (ruta+carpeta);
		if(fichero.exists()==true) {
			System.out.println("La carpeta está creada idiota");
		}else {
			fichero.mkdir();
			System.out.println("Carpeta creada");
		}
		
		// Crear un archivo dentro.
		try {
		BufferedWriter buw = new BufferedWriter(
				new FileWriter("c:\\digitech\\xx.EJERCICIOS\\Prueba\\ejercicio1\\archivo.txt"));
		buw.write("Nuevo archivo\n");
		System.out.println("Archivo creado");
		buw.close();
		}catch (IOException e) {
				// Manejamos la excepción para el caso de que se produzca un error.
				System.out.println("No se ha podido crear el archivo" + e.getMessage());
		}
		
}
}
