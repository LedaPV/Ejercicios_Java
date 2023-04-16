/**Enunciado de Array_13:
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números 
 * junto con la palabra "par" o "impar" según proceda.
 */
package ejer_obligatorios;

import java.util.Scanner;

public class Array_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Creamos un array que almacene los 8 números enteros y
		// un ciclo for que pida la introducción de valores,
		// permitiendo que el programa los lea.
		// Además dentro de nuestro ciclo for, insertaremos el condicional
		// para determinar si es número par o impar. La instrucción,
		// num[i] % 2 == 0, indica que si el resto de dividir el valor
		// entre dos es = 0, se considera número par.

		int[] num = new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.print("Introduce un número entero: ");
			num[i] = sc.nextInt();

			if (num[i] % 2 == 0) {
				System.out.println("Este número es par.");
			} else {
				System.out.println("Este número es impar.");
			}

		}
		sc.close();
	}

}
