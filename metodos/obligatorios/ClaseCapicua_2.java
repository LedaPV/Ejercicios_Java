/**Realiza el ejercicio de Número capicuo y modificalo para que 
 * el usuario indique un número por teclado. Además intenta de 
 * que realice el ejercicio con números de más de dos dígitos.
 */
package obligatorios;

import java.util.Scanner;

public class ClaseCapicua_2 {

	public static boolean Capicuo(int num) {
		// Creamos la varible dígitos y la convertimos en una cadena de caracteres
		// donde se pueda extraer cada dígito del número
		String[] digitos = String.valueOf(num).split("");

		// Para validar o comparar los diferentes dígitos entre sí,
		// crearemos un ciclo for con 2 variables de iteración; una
		// que valide desde la izquierda y otra desde la derecha,
		// esta última empezará por el último índice : digitos.length -1.

		// Esto "i<digitos.length/2" significa que la comparación se termine
		// hasta la mitad del número en cuestión, puesto que las variables de
		// iteración lo harán tanto por la izquierda como por la derecha.
		for (int i = 0, j = digitos.length - 1; i < digitos.length / 2; i++, j--) {
			if (!digitos[i].equals(digitos[j])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número y sabrás si es capicuo o no (mediante true o false): ");
		int cifra = sc.nextInt();
		System.out.println(Capicuo(cifra));
		sc.close();
	}
}
