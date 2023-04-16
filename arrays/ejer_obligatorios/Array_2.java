/**Enunciado de Array_2
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 */
package ejer_obligatorios;

import java.util.Scanner;

public class Array_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaramos el array n con 10 valores en sus posiciones.
		int[] n = new int[10];
		for (int i = 0; i < 10; i++) {// Escogemos 10, porque hablamos de introducir 10 números.
			System.out.print("Por favor, introduzca un número entero: ");
			n[i] = sc.nextInt();
		}
		System.out.println(""); // Dejamos un espacio, para mejorar la visualización.
		System.out.println("Su orden inverso es: ");
		for (int i = 9; i >= 0; i--) {  // Escogemos 9, porque los arrays comienzan en 0, y como es a la inversa
									   // decrementamos.
			System.out.println(n[i]); // Para escribir los números.
		}
		sc.close();
	}
}
