/**Enunciado Array_14:
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0-9). Seguidamente
 * el programa pedirá dos posiciones a las que llamaremos "inicial" y "final". Se debe comprobar 
 * que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá colocar 
 * el número de la posición final, rotando el resto de números para que no se pierda ninguno. Al final
 * se debe mostrar el array resultante.
 */
package ejer_obligatorios;

import java.util.Scanner;

public class Array_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos un array de una dimensión con 10 elementos (un véctor de 10),
		// pidiéndole al usuario que los rellene, y mostrando su posición
		// con respecto al índice del array.
		int[] numeros = new int[10];
		System.out.println("Introduce 10 números:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
			System.out.println("El número en la posición " + i + " es " + numeros[i]);
		}

		// Pedir al usuario las dos posiciones: inicial y final.
		System.out.print("Introduce la posición inicial: ");
		int inicial = sc.nextInt();
		System.out.print("Introduce la posición final: ");
		int fin_al = sc.nextInt();

		// A continución debemos confirmar si inicial es menor que final y están en los
		// límites del índice del array, 0-9. Si se cumple la condición, empezamos a
		// rotar los números de forma decreciente en una posición. En caso de
		// incumplirse la condición, pedir que comience otra vez.
		if (inicial < fin_al && inicial >= 0 && fin_al < 10) {
			int num_final = numeros[fin_al];
			for (int i = fin_al; i > inicial; i--) {
				numeros[i] = numeros[i - 1];
			}
			numeros[inicial] = num_final;
		} else {
			System.out.println("Empezar de nuevo, introduce otras posiciones.");
		}

		// Mostramos nuestro resultado.
		System.out.print("Array: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		sc.close();
	}
}
