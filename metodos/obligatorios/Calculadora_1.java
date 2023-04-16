/**Realice la siguiente calculadora.
 */
package obligatorios;

import java.util.Scanner;

public class Calculadora_1 {
	public static void main(String[] args) {
		//Ejemplo de calculadora sin instanciar objetos (a parte del caso scanner),
		//por este motivo usamos métodos static.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Indica el primer número: ");
		int a= sc.nextInt();
		System.out.print("Indica el segundo número: ");
		int b= sc.nextInt();

		//invocamos los diferentes métodos.
		System.out.println("Suma: "+ suma(a,b));
		System.out.println("Resta: "+ resta(a,b));
		System.out.println("Producto: "+ producto(a,b));
		System.out.println("División: "+ division(a,b));
		
		sc.close();
	}
	
	//Aquí, elaboramos los métodos, fuera del void main.
	//Estos métodos static no necesitan instanciar una clase.
	
	public static int suma(int a, int b) {
		return a+b;
	}
	public static int resta(int a, int b) {
		return a-b;
	}
	public static int producto(int a, int b) {
		return a*b;
	}
	public static int division(int a, int b) {
		return a/b;
	}
}