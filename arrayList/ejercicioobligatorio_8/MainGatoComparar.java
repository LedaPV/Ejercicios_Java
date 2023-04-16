package ejercicioobligatorio_8;

import java.util.ArrayList;
import java.util.Collections;

public class MainGatoComparar {

	public static void main(String[] args) {

		// Creamos una lista de gatos
		ArrayList<GatoComparar> lista_gatos = new ArrayList<GatoComparar>();

		// Incorporamos los datos (gatos) a la lista
		GatoComparar gato1 = new GatoComparar("Garfield", "naranja", "Persa");
		lista_gatos.add(gato1);

		GatoComparar gato2 = new GatoComparar("Salem", "negro", "Siamés");
		lista_gatos.add(gato2);

		GatoComparar gato3 = new GatoComparar("Tom", "gris", "Europeo");
		lista_gatos.add(gato3);

		GatoComparar gato4 = new GatoComparar("Ulises", "marrón", "Angora");
		lista_gatos.add(gato4);

		GatoComparar gato5 = new GatoComparar("Agata", "naranja", "Persa");
		lista_gatos.add(gato5);

		// Lista de gatos por defecto, sin ordenar
		System.out.println("\t GATOS ");
		System.out.println("///////////////////////////////////////////////");
		System.out.println("Lista de gatos sin ordenar:");
		System.out.println();
		for (GatoComparar gato : lista_gatos) {
			System.out.println(gato);
			System.out.println();
		}

		// Ordenamos la lista de gatos por nombre
		Collections.sort(lista_gatos);

		// Imprimimos la lista de gatos ordenada
		System.out.println("\nLista de gatos ordenada alfabéticamente por nombre:");
		System.out.println();
		for (GatoComparar gato : lista_gatos) {
			System.out.println(gato);
			System.out.println();
		}

	}

}
