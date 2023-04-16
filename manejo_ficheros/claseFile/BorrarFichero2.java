package claseFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BorrarFichero2 {

	public static void main(String[] args) {
		
		String nombrefichero = "c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\malaga.txt";

		
		File fichero = new File(nombrefichero);
		if (fichero.exists() == true) {
			fichero.delete();
			System.out.println("El fichero se ha borrado correctamente.");
		} else {
			try {
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\malaga.txt"));
				bw.write("A Alberto le sale\n");
				System.out.println("Fichero creado");
				bw.close();
			} catch (IOException e) {
				System.out.println("No se ha podido escribir en el fichero" + e.getMessage());
			}
			
		}

	}

}

