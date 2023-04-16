/**
 * --Ejercicio de prueba de Método Constructor para ver cómo funciona--
 * ----------------------COLORES Y FLORES------------------------------
 */
package metodoConstructor;

import java.util.Scanner;

public class MetodoConstructorInventado {
	private Scanner catalogo;
	private String[] flores;

	public MetodoConstructorInventado() {
		catalogo= new Scanner(System.in);
		flores = new String[3];
		
		for(int f=0; f<flores.length; f++) {
			System.out.println("Dime un tipo de flor: ");
			flores[f]=catalogo.nextLine();
		}
	}
	public void mostrarloescrito() {
		for(int f=0; f<flores.length; f++) {
			System.out.println(flores[f]);
		}
	}
	public static void main(String[] ar) {
		MetodoConstructorInventado imprimir = new MetodoConstructorInventado();
		imprimir.mostrarloescrito();
	}

}
