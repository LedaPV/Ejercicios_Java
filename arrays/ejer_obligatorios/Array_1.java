/**Enunciado Array_1:
 * Define un array de 12 números con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de 
 * los elementos que no han sido inicializados?
 */
package ejer_obligatorios;

public class Array_1 {
	public static void main(String[] args) {

		// Se define un array de una dimensión y se reservan los puestos de 12 valores.
		int[] num = new int[12];

		// A continuación se indican los valores de cada posición.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Inicializamos un bucle "for" renombrando la variable "num" para imprimir los
		// datos.
		// Metemos un condicional, donde solo nos muestre aquellos datos que no
		// corresponden a 0
		for (int valor : num) {
			if (valor != 0) {
				System.out.println(valor);
			}
		}

	}
}
