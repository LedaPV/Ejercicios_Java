package vehiculos;

public class Main {

	public static void main(String[] args) {

		Coche[] coches = { new Coche("Negro", 5, "Renault Clio 2023", 1600),
				new Coche("Azul", 5, "Jeep Renegade Limited 2023", 1800) };

		Bicicleta[] bici = { new Bicicleta("Roja", 2, "JMK 2000", "Mountain bike"),
				new Bicicleta("Gris", 2, "BH 50-V", "Bicicleta de paseo") };

		Moto[] motos = { new Moto("Verde", 2, "Honda CRF450X", "Off road"),
				new Moto("Cobre", 3, "Hardley Davidson 40LX", "Carretera") };

		System.out.println("----------Datos de los coches: ");
		for (Coche coche : coches) {
			coche.MostrarDatos();
			coche.Acelerar();
			coche.Frenar();
			System.out.println();
		}

		System.out.println("----------Datos de las bicicletas: ");
		for (Bicicleta bicis : bici) {
			bicis.MostrarDatos();
			bicis.Acelerar();
			bicis.Frenar();
			System.out.println();
		}

		System.out.println("----------Datos de las motos: ");
		for (Moto mot : motos) {
			mot.MostrarDatos();
			mot.Acelerar();
			mot.Frenar();
			System.out.println();
		}
	}

}
