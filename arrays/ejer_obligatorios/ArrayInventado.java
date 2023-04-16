/**Enunciado ArrayInventado:
 * Realiza un programa en Java que guarde en un array 10 números enteros que se leen por teclado. 
 * A continuación se recorre el array y calcula cuántos números son positivos, 
 * cuántos negativos y cuántos ceros. Además calcula la media de cada uno de ellos
 */
package ejer_obligatorios;

import java.util.Scanner;

public class ArrayInventado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos el array que contenga 10 valores y declaramos e inicializamos
		// las variables que vamos a utilizar.
		int[] array = new int[10];
		int num_pos = 0;
		int num_neg = 0;
		int nulo = 0;

		// A continuación, pedimos al usuario que rellene el array anterior con valores,
		// lo situamos dentro del array y añadimos la condición de sumar los números en
		// caso de que sean positivos, negativos o nulos.
		
		System.out.println("Introduce 10 números enteros (positivos, negativos o ceros): ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			System.out.println("El número en la posición [" + i + "] es " + array[i]);
			if (array[i] > 0) {
				num_pos++;
			} else if (array[i] < 0) {
				num_neg++;
			} else {
				nulo++;
			}
		}

		// Calculamos la media de cada uno de ellos. Incluyendo nuevas variables de
		// carácter double, para que funcione.
		double media_pos = (double) num_pos / 10;
		double media_neg = (double) num_neg / 10;
		double media_nulo = (double) nulo / 10;

		// Mostramos los resultados de las sumas y las medias.
		System.out.println();
		System.out.println("Cantidad de números positivos:" + num_pos + "\t|Media total de positivos: " + media_pos);
		System.out.println("Cantidad de números negativos:" + num_neg + "\t|Media total de negativos: " + media_neg);
		System.out.println("Cantidad de números nulos:" + nulo + "\t|Media total de ceros: " + media_nulo);
		sc.close();
	}

}
