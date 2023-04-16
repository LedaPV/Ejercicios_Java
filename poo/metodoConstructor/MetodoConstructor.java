/**
 * --Método Constructor Sueldos--
 * Ejercicio de ejemplo para probar cómo funciona y cómo se construye un método constructor.
 */
package metodoConstructor;

import java.util.Scanner;

public class MetodoConstructor {

	// Declaramos las variables de Scanner y Sueldos, haciéndolas privadas.
	private Scanner teclado;
	private int[] sueldos; // array

	// Inicializamos el Método Constructor con un for para que se ingresen
	// valores y los guarde en un array unidimensional de 5 espacios.
	public MetodoConstructor() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];

		for (int f = 0; f < sueldos.length; f++) {
			System.out.print("Ingrese el valor del sueldo:");
			sueldos[f] = teclado.nextInt();
		}
	}

	// Con public void damos la orden de imprimir o mostrar (pero no lo hacemos)
	// todos los sueldos en el orden introducido.
	public void imprimir() {
		for (int f = 0; f < sueldos.length; f++) {
			System.out.println(sueldos[f]);
		}
	}

	// Con este ejecutor se crea un objeto del método al completo (con el registro
	// de valores y su impresión y se llama a la función imprimir para que lo
	// ejecute.
	public static void main(String[] ar) {
		MetodoConstructor operario = new MetodoConstructor();
		operario.imprimir();
	}
}
