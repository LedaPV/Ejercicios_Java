/**
 * Ejercicio Método Constructor incluyendo la media y el IRPF.
 */
package metodoConstructor;

import java.util.Scanner;

public class MétodoConstructorIRPF {
	// Declaramos las variables de Scanner, Sueldos e IRPF; haciéndolas privadas.
	private Scanner teclado;
	private double[] sueldos;
	private double[] irpf;

	// Inicializamos el Método Constructor
	public MétodoConstructorIRPF() {
			teclado = new Scanner(System.in);
			sueldos = new double[5];
			
			for (double f = 0; f < sueldos.length; f++) {
				System.out.print("Ingrese el valor del sueldo:");
				sueldos[(int) f] = teclado.nextInt();
			}
		}


	// Método imprimir
	public void imprimir() {
		for (double f = 0; f < sueldos.length; f++) {
			System.out.println("Sueldo " + " " + f + " : " + sueldos[(int) f] + " €");
		}
	}

	// Método media
	public void media() {
		double suma = 0;
		for (double f = 0; f < sueldos.length; f++) {
			suma += sueldos[(int) f];
		}
		System.out.println("La suma de los sueldos es " + suma + " euros.");
		System.out.println("La media es " + suma / sueldos.length);
	}
	
	//15% de IRPF de cada salario
	public void irpf() {
		for(double f=0; f<5; f++) {
			System.out.println("IRPF: " + sueldos[(int) f]*0.15);
		}
	}

	// Ejecutor
	public static void main(String[] ar) {
		MetodoConstructorMedia operario = new MetodoConstructorMedia();
		operario.imprimir();
		operario.media();
		operario.irpf();
	}
}
