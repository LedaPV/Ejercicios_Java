package ejercicioobligatorio_4;

import java.util.ArrayList;

public class GatoMain {
	public static void main(String[] args) {
		ArrayList<Gato> g = new ArrayList<Gato>();

		g.add(new Gato("Garfield", "naranja", "mestizo", 7));
		g.add(new Gato("Pepe", "gris", "angora", 12));
		g.add(new Gato("Mauri", "blanco", "manx", 9));
		g.add(new Gato("Ulises", "marrón", "persa", 5 ));
		g.add(new Gato("Agata", "naranja", "persa", 2 ));
		System.out.println("Características de los gatos:");
		System.out.println("--------------------------------------------------------------");

		for (Gato gato : g) {
			System.out.println(gato.toString());
		}
	}

}
