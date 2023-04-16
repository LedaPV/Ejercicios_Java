/**Enunciado de Arrays_3:
 * Define 3 arrays de 20 números cada uno, con nombres número, cuadrado y cubo.
 * Carga el array número con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacener los cuadrados de los valores de los arrays que 
 * hay en el array número.En el array cubo se deben almacenar los cubos se deben
 * almacenar los cubo se deben almacenar los cubor de los valores que hay en el 
 * número. A continuación muestra los contenidos de los tres arrays.
 */
package ejer_obligatorios;

public class Array_3 {

	public static void main(String[] args) {
		// Lo primero, declaramos los tres arrays de una dimensión y reservamos los
		// puestos
		// para 20 números enteros

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		// A continuación, utilizaremos esta vez un sólo for donde se incluyan todas las
		// operaciones
		// a realizar, puesto que en el ejercicio anterior se repetía de forma
		// innnecesaria.
		// Además y como anteriormente hemos descrito vamos a realizar un casting para
		// las funciones Math
		// debido a que nos otorgan por defecto valores double.

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 101); // * 101 para que contemple valores desde el 0 a 100.
			cuadrado[i] = (int) (Math.pow(numero[i], 2)); // (base, exponente)
			cubo[i] = (int) (Math.pow(numero[i], 3));// (base, exponente)
		}
		// Ahora mostraremos los valores obtenidos de las distintas operaciones por
		// pantalla.
		// Con tabuladores para crear una ilusión óptica en forma de columnas.

		System.out.println("Número\tCuadrado\tCubo");
		for (int i = 0; i < 20; i++) {
			System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
		}

	}

}
