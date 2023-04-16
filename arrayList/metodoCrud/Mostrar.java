package metodoCrud;

import java.util.ArrayList;

public class Mostrar {
	public static void main(String[] args) {

		ArrayList<String> asigna = new ArrayList<String>();
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");

		// Muestra todos los datos
		for (String a : asigna) {
			System.out.println("-" + a);

		}
	}
}