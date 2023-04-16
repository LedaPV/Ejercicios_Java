/**Enunciado Array_9:
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el 
 * mínimo y la media de los números que hay en esa diagonal.
 */
package ejer_obligatorios;

public class Array_9 {
	public static void main(String[] args) {

		// Creamos un array de 10x10 relleno con números aleatorios.
		int[][] array = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				array[i][j] = (int) (Math.random() * 101 + 200);
				// El método Math.random en Java, devuelve valores aleatorios entre cero y
				// uno (sin contar el uno). Por tanto si nosotros queremos un rango de valores
				// entre 200 y 300, debemos multiplicar este método por la resta entre ambos
				// (300-200=100) y que contenga al 1(100+1=101); y sumarle el mínimo de ese
				// rango
				// (200).
			}
		}

		// Mostramos el array, con las posiciones de cada valor.
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// Mostramos el enunciado de la diagonal principal.
		System.out.print("Diagonal principal: ");

		// Declaramos las variables que vamos a utilizar y les damos un valor concreto o
		// las inicializamos.
		// En el caso de int min, declaramos que el número mínimo será el máximo al
		// iniciar.
		// En int max, sucede lo mismo, pero de forma contraria.
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int suma = 0;
		int memo = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					int num = array[i][j];
					System.out.print(num + " ");
					min = Math.min(min, num);
					max = Math.max(max, num);
					suma += num;
					memo++;
				}
			}
		}
		System.out.println();

		// Mostrar el mínimo, el máximo y la media de los números de la diagonal
		// principal.
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		System.out.println("Media: " + (double) suma / memo);
	}
}
