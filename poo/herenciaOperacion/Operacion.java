package herenciaOperacion;

import java.util.Scanner;

public class Operacion {

	// Variables que vamos a utilizar.
	protected Scanner teclado;
	protected double valor1;
	protected double valor2;
	protected double resultado;

	public Operacion() {
		teclado = new Scanner(System.in);// Le damos un nombre al objeto Scanner.

	}

	// Pedimos al usuario que ingrese los valores.
	public void cargar1() { // Void: NO DEVUELVE NADA.
		System.out.print("Ingrese el primer valor: ");
		valor1 = teclado.nextInt();// Llamamos al objeto que hemos definido anteriormente.
	}

	public void cargar2() {
		System.out.print("Ingrese el segundo valor: ");
		valor2 = teclado.nextInt();

	}

	// Mostramos los resultados de las supuestas operaciones que se darán en las
	// clases de Suma y Resta.
	public void mostrarResultado() {
		System.out.println(resultado);
	}
}
