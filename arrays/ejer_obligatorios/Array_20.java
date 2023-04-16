/**Enunciado Array_20:
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 */
package ejer_obligatorios;

public class Array_20 {

	public static void main(String[] args) {
		// Creamos un array y definimos e inicializamos las valiables que más tarde
		// vamos
		// a utilizar
		int[][] array = new int[6][10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int max_fil = 0;
		int max_col = 0;
		int min_fil = 0;
		int min_col = 0;

		// El primer y segundo bucle (i,j) recorre las filas y las columnas que lo
		// componen.
		// Anidado a ellos, colocamos un bucle "do while" que contiene a su vez dos
		// bucles for anidados
		// que se encarga de que los números no se repitan.

		// En el do, se generan los números aleatorios a través de la función
		// Math.random y se inician otros dos for para recorrer el mismo array 
		// comparando uno a uno los números generados. Si se encuentra alguna 
		// coincidencia, se le asigna el valor -1 y se vuelve a generar otro número.
		// Todo esto se repite hasta que se genere un número único, en tal caso el
		// número generado se aplica al array (añadiendo una posición) y se sale de
		//este último bucle do while.
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				int num_alea;
				do {
					num_alea = (int) (Math.random() * 1001);
					for (int y = 0; y < i; y++) {
						for (int z = 0; z < j; z++) {
							if (array[y][z] == num_alea) {
								num_alea = -1;
								break;
							}
						}
					}
				} while (num_alea == -1);
				array[i][j] = num_alea;
				System.out.println(array[i][j]);

				// En este caso, seguimos los pasos del ejercicio Array_19, para encontrar y
				// situar el máximo y el mínimo.
				if (array[i][j] > max) {
					max = array[i][j];
					max_fil = i;
					max_col = j;
				} else if (array[i][j] < min) {
					min = array[i][j];
					min_fil = i;
					min_col = j;
				}
			}
		}

		// Imprimimos el resultado.
		System.out.println("Número máximo: " + max + " |Posición: [" + max_fil + "][" + max_col + "]");
		System.out.println("Número mínimo: " + min + " |Posición: [" + min_fil + "][" + min_col + "]");
	}
}