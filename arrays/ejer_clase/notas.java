/**
 * 
 */
package ejer_clase;

import java.util.Scanner;

public class notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = sc.nextInt();
		System.out.println(evaluacion(num));
		sc.close();
	}

	public static String evaluacion(int nota) {
		String cadena = null;
		if (nota < 5) {
			cadena = "Suspenso";
		} else if (nota >= 5 && nota < 6) {
			cadena = "Suficiente";
		} else if (nota >= 6 && nota < 7) {
			cadena = "Bien";
		} else if (nota >= 7 && nota < 9) {
			cadena = "Notable";
		} else if (nota >= 9 && nota <= 10) {
			cadena = "Sobresaliente";
		}
		return cadena;
	}
}