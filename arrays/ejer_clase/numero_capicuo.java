/**
 * 
 */
package ejer_clase;

import java.util.Scanner;

public class numero_capicuo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = sc.nextInt();
		System.out.println(esCapicua(num));

	}

	public static boolean esCapicua(int x) {

		boolean capicua = false;
		if (x % 10 == x / 10) {
			capicua = true;
		} else {
			capicua = false;
		}
		return capicua;
	}
}
