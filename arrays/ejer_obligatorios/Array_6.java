/**Enunciado Array_6:
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num.
 * y asigna valores según la siguiente tabla. Muestra el contenido de todos los
 * elementos del array dispuestos en forma de tabla como se muestra en la figura.
 */
package ejer_obligatorios;

public class Array_6 {
	public static void main(String[] args) {
		// Definimos el array de dos dimensiones con tres filas y 6 columnas.
		Integer[][] num = { { 0, 30, 2, null, null, 5 }, { 75, null, null, null, 0, null },
				{ null, null, -2, 9, null, 11 } };

		// Declaramos dos nuevas variables para filas y columnas.
		int fila, columna;

		// En este ciclo for organizamos el marco o la estructura de las columnas de la
		// tabla.
		for (columna = 0; columna < 6; columna++) {
			System.out.print("\tColumna" + columna + " ");
		}

		// De igual manera, estructuramos el marco de las filas.
		// En este caso anidamos otro ciclo para rellenar la tabla con los números del
		// array.
		for (fila = 0; fila < 3; fila++) {
			System.out.print("\nFila " + fila);

			for (columna = 0; columna < 6; columna++) {
				System.out.print("\t" + num[fila][columna] + "\t");
			}
		}
	}
}
