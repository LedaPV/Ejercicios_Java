
/**Enunciado Array_5:
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes 
 * de un determinado año y que muestre a continuación un diagrama de barras 
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteríscos o cualquier otro carácter.
 */

package ejer_obligatorios;

import java.util.Scanner;

public class Array_5 {
	public static void main(String[] args) {
		// Creamos un objeto escaner para que más tarde el programa lea las entradas por
		// teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos un array con el nombre de los meses.
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		// Creamos un array donde se almacene los datos de la temperatura de esos 12
		// meses
		int[] temp = new int[12];

		// Ciclo for para pedir datos.
		for (int i = 0; i < 12; i++) {
			System.out.print("La temperatura media del mes de " + mes[i] + " : ");
			// Creamos una variable para que lea y guarde los datos de la temperatura.
			temp[i] = sc.nextInt();
		}

		// A continuación, debemos calcular el valor máximo de las temperaturas, para
		// tener
		// en cuenta el tamaño de las barras del diagrama.
		// Para ello declaramos primero una nueva variable que recoja ese valor.
		// El valor máximo lo colocamos en la primera posición, para que a medida
		// que avance el ciclo posterior se vaya actualizando.
		int max_temp = temp[0];

		for (int i = 1; i < 12; i++) {
			if (temp[i] > max_temp) {
				max_temp = temp[i];
			}
		}

		// Calcular la escala de las barras
		int escala = 50 / max_temp;

		// Dibujar el diagrama
		for (int i = 0; i < 12; i++) {
			System.out.print(" | " + mes[i] + ": ");
			int caracter = (int) (temp[i] * escala);
			for (int j = 0; j < caracter; j++) {
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
	}
}
