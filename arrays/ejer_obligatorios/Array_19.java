/**Enunciado Array_19:
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 */
package ejer_obligatorios;

public class Array_19 {

	public static void main(String[] args) {

		// Al comenzar definimos el array y declaramos todas las variables que vamos
		// a utilizar.
		int[][] array = new int[6][10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int max_fil = 0;
		int max_col = 0;
		int min_fil = 0;
		int min_col = 0;

		// Utilizamos un ciclo for para recorrer, rellenar y mostrar el array con
		// números aleatorios.Este bucle nos sirve además para localizar el máximo 
		// y el mínimo de los números generados y localizar su posición exacta.
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				array[i][j] = (int) (Math.random() * 1001);
				System.out.println(array[i][j]);

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

		// A continuación, imprimimos por pantalla el valor máximo y el mínimo numérico,
		// indicando su posición en la tabla.
		System.out.println("Número máximo: " + max + " |Posición: [" + max_fil + "][" + max_col + "]");
		System.out.println("Número mínimo: " + min + " |Posición: [" + min_fil + "][" + min_col + "]");
	}
}