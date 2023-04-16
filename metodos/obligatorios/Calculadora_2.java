/**Repetir el ejercicio de Calculadora_1, variando el orden de los métodos.
 */
package obligatorios;

import java.util.Scanner;

public class Calculadora_2 {
	
	// Primero, crear los métodos que posteriormente se van a utilizar.
	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}

	public static int dividir(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("indica el primer número: ");
		int a = sc.nextInt();
		System.out.print("indica el segundo número: ");
		int b = sc.nextInt();

		System.out.println("Suma: " + sumar(a, b));
		System.out.println("Resta: " + restar(a, b));
		System.out.println("Producto: " + multiplicar(a, b));
		System.out.println("Division: " + dividir(a, b));
		
		sc.close();
	}
}
