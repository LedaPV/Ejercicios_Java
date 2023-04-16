/**Enunciado Array_11:
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos segun la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elemetos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados.
 */
package ejer_obligatorios;

public class Array_11 {

	public static void main(String[] args) {
		char[] simbolo = { 'a', 'x', ' ', ' ', '@', ' ', ' ', '+', 'Q', ' ' };
		// Declaramos dos nuevas variables para nombrar las filas y las columnas. Además
		// posicionamos un índice.
		int fila, columna;
		System.out.print("Índice\t");

		// En este ciclo "for" organizamos el marco o la estructura de las columnas de
		// la tabla.
		for (columna = 0; columna < simbolo.length; columna++) {
			System.out.print(columna + "\t");
		}

		// Insertamos el título de la fila.
		System.out.println();
		System.out.print("Valor" + "\t");

		// En este utilizamos otro ciclo for para rellenar la tabla con los símbolos del
		// array.
		for (fila = 0; fila < simbolo.length; fila++) {
			System.out.print(simbolo[fila] + "\t");
		}
	}
}
