package ejerciciosobligatorios;

/**
 * Ejercicio 7: Realiza el mismo ejercicio que el ejercicio 6 pero usando los
 * siguientes números 32,12,8,60,20.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio_7 {
	public static void main(String[] args) {

		// Creación del arrayList de los números
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(32);
		numeros.add(12);
		numeros.add(8);
		numeros.add(60);
		numeros.add(20);

		// Salida de información
		System.out.println("\t--NUMEROS--");

		// Bucle que muestra los datos en el orden introducido
		System.out.println("\nNumeros en el orden original:");
		for (Integer num : numeros) {
			System.out.println(num);
		}
		
		// Ordenamos los números
		Collections.sort(numeros);
		
		// Bucle que muestra los datos en orden ascendente
		System.out.println("\nNumeros de menor a mayor:");
		for (Integer num : numeros) {
			System.out.println(num);
		}
	}
}
