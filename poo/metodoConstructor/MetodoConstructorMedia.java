/**
 * ----------Método Constructor Sueldos, con Media--------------
 */
package metodoConstructor;

import java.util.Scanner;

public class MetodoConstructorMedia {

	// Declaramos las variables de Scanner, Sueldos e IRPF; haciéndolas privadas.
	private Scanner teclado;
	private int[] sueldos;

	///////////////////////////////// INICIALIZAMOS EL MÉTODO CONSTRUCTOR

	public MetodoConstructorMedia() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];

		for (int f = 0; f < sueldos.length; f++) {
			System.out.print("Ingrese el valor del sueldo:");
			sueldos[f] = teclado.nextInt();
		}
	}

	/////////////////////////////// EJECUTOR

	public static void main(String[] ar) {
		MetodoConstructorMedia operario = new MetodoConstructorMedia();
		operario.imprimir();
		operario.media();
		operario.irpf();
	}

	////////////////////////////// MÉTODOS

	// IMPRIMIR
	public void imprimir() {
		for (int f = 0; f < sueldos.length; f++) {
			System.out.println("Sueldo " + " " + f + " : " + sueldos[f] + " €");
		}
	}

	// MEDIA
	public void media() {
		int suma = 0;
		for (int f = 0; f < sueldos.length; f++) {
			suma += sueldos[f];
		}
		System.out.println("La suma de los sueldos es " + suma + " euros.");
		System.out.println("La media es " + suma / sueldos.length);
	}

	// IRPF
	public void irpf() {
		for (int f = 0; f < sueldos.length; f++) {
			System.out.println("IRPF: " + sueldos[f] * 0.15);
		}
		
	}
}
