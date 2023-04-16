/**Enunciado Array_10:
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, 
 * el programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el 
 * mínimo y la media de los números que hay en esa diagonal.
 */
package ejer_obligatorios;

public class Array_10 {
	public static void main(String[] args) {
		// Crear un array de 9x9 relleno con números aleatorios
		int[][] array = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				array[i][j] = (int) (Math.random() * 401 + 500);
			}
		}

		// Mostrar el array
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// Mostrar los números de la diagonal secundaria
		System.out.print("Diagonal secundaria: ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int suma = 0;
		int memo = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8) {
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
		// secundaria
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		System.out.println("Media: " + (double) suma / memo);

	}
}
