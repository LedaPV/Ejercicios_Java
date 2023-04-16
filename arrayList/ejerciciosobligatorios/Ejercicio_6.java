package ejerciciosobligatorios;

/**
 * Ejercicio 6: ArrayList y el uso del sort. Ciudades
 */
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio_6 {

	public static void main(String[] args) {

		// Creación del arrayList de ciudades
		ArrayList<String> ciudades = new ArrayList<String>();
		ciudades.add("Malaga");
		ciudades.add("Sevilla");
		ciudades.add("Cadiz");
		ciudades.add("Almeria");
		ciudades.add("Granada");
		ciudades.add("Cordoba");
		ciudades.add("Jaen");
		ciudades.add("Huelva");

		// Salida de información
		System.out.println("\t--CIUDADES DE ANDALUCIA--");

		// Bucle que muestra los datos en el orden introducido
		System.out.println("\nCiudades en el orden original:");
		for (String ciu : ciudades) {
			System.out.println(ciu);
		}

		// Ordenamos las ciudades por orden alfabético
		Collections.sort(ciudades);
		
		// Bucle que muestra los datos en orden alfabético
		System.out.println("\nCiudades en orden alfabetico:");
		for (String ciu : ciudades) {
			System.out.println(ciu);
		}
	}
}
