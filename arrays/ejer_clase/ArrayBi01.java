/**Ejercicio sobre arrays bidimensionales.
 */
package ejer_clase;

public class ArrayBi01 {
	public static void main(String[] args) {
		int[][] n = new int[3][2]; // Array de dos dimensiones, de tres filas y dos columnas.
		int fila, columna; // Declaramos el tipo de variable que más tarde vamos a utilizar.
		n[0][0] = 20;
		n[1][0] = 67;
		n[1][1] = 33;
		n[2][1] = 7;
		for (fila = 0; fila < 3; fila++) {
			System.out.print("/Fila: " + fila);
			for (columna = 0; columna < 2; columna++) {
// Se encarga de leer toda la fila columna por columna.
				System.out.printf("%10d ", n[fila][columna]);
			}
// El primer bucle no comienza hasta que no termina el segundo
		}
	}
}
