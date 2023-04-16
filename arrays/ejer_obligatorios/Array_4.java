/**Enunciado Array_4:
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array.
 * Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar 
 * a la posición 1, el de la 1 a la 2, etc.El número que se encuentra en la última posición
 * debe pasar a la posición 0. Finalmente, muestra el contenido del array.
 */
package ejer_obligatorios;

import java.util.Scanner; //Importamos la clase escaner para que lea los números introducidos por teclado.

public class Array_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[15];// Declaramos el array de una dimensión.
		int ultimo;// Declaramos una variable para guardar el último número que se quedaría sin
					// posición.

		// A continuación rellenamos el array con un ciclo for que vaya pidiendo números
		// enteros.
		for (int i = 0; i < 15; i++) {
			System.out.println("Por favor, introduzca un número entero: ");
			n[i] = sc.nextInt();
		}

		ultimo = n[14];// En la variable último está contenido el último valor e indicamos su posición.

		// El for de acontinuación se encarga de manejar y cambiar las posiciones. Para
		// ello empezaremos
		// desde el último valor introducido hacia arriba, de ahí :i--.

		for (int i = 13; i >= 0; i--) { // la i comienza en 13 porque el puesto 14 es el que pasara a la posición 0.
			n[i + 1] = n[i];// Aquí declaramos el cambio de posiciones, ejemplo: para n[9]= n[9+1].
		}

		// En el siguiente for se imprimen toda la rotación.

		n[0] = ultimo;
		System.out.println("Rotación o desplazamiento de los números en una posición: ");
		for (int i = 0; i < 15; i++) {
			System.out.println(n[i]);
		}
		sc.close();
	}

}
