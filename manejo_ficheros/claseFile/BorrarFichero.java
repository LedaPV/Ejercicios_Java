package claseFile;

import java.io.File;

public class BorrarFichero {

	public static void main(String[] args) {

		// Se crean dos variables para contener la ruta y la carpeta y que el código sea
		// más efectivo.
		String nombrefichero = "c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\malaga.txt.txt";

		// Se crea un objeto
		File fichero = new File(nombrefichero);
		if (fichero.exists() == true) {
			fichero.delete();
			System.out.println("El fichero se ha borrado correctamente.");
		} else {
			System.out.println("El fichero " + nombrefichero + "no existe.");
		}

	}

}
