/**Enunciado:
 * A través de métodos, crea una aplicación que me calcule si un 
 * número es primo. Siguendo este módelo.
 */
package obligatorios;

import java.util.Scanner;

public class Numeroprimo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un número entero positivo: ");
		int n = Integer.parseInt(s.nextLine());
		if (esPrimo(n) == true) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + " no es primo.");
		}
		s.close();
	}

	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;

	}

}
