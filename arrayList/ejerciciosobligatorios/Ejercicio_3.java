package ejerciciosobligatorios;

/**
 * Siguiendo el modelo anterior crea un Arraylist con nombres de productos:
 * Crea una lista de productos, añade modifica, elimina y muestra los datos que tu elijas.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_3 {
	public static void main(String[] args) {
		ArrayList<String> productos = new ArrayList<String>();

		// ArrayList de productos/utensilios de mesa
		System.out.println("");
		System.out.println("---------------Lista de utensilios de mesa.");
		productos.add("Taza");
		productos.add("Tenedor");
		productos.add("Plato");
		productos.add("Vaso");
		System.out.println("Nº de productos: " + productos.size());
		System.out.println(productos);
		productos.add("Mantel");
		productos.add("Servilleta");
		productos.add("Cuchillo");
		System.out.println("Nº de productos: " + productos.size());
		System.out.println(productos);

		// Eliminamos Taza, Vaso y Mantel
		System.out.println("");
		ArrayList<String> productosAEliminar = new ArrayList<String>(Arrays.asList("Taza", "Vaso", "Mantel"));
		productos.removeAll(productosAEliminar);
		System.out.println("---------------Eliminamos Taza, Vaso y Mantel.");
		System.out.println(productos);

		// Cambiamos Cuchillo por Cuchara
		System.out.println("");
		System.out.println("---------------Cambiamos el utensilio Cuchillo por Cuchara.");
		String buscar = "Cuchillo";
		int position = productos.indexOf(buscar);
		productos.set(position, "Cuchara"); // Machaca la palabra Cuchillo
		System.out.println(productos);
	}

}
