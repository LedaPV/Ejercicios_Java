package matematicas;

import java.util.Scanner;

import matematicas.geometría.*;
import matematicas.varias.*;

public class PruebaFunciones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prueba es Primo()
		System.out.print("Introduzca un número entero positivo: ");
		int n = sc.nextInt();
		if (matematicas.varias.Varias.esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + "no es primo.");
		}

		// Prueba dígitos()
		System.out.print("Introduzca un número entero positivo: ");
		n = sc.nextInt();
		System.out.println(n + " tiene " + matematicas.varias.Varias.digitos(n) + "dígitos.");

		// Prueba volumenCilindro()
		double r, h;
		System.out.println("Cálculo del volumen del cilindro");
		System.out.print("Introduzca el radio en metros: ");
		r = sc.nextInt();
		System.out.print("Introduzca la altura en metros: ");
		h = sc.nextInt();
		System.out.println("El volumen del cilindro es " + matematicas.geometría.Geometria.volumenCilindro(r, h) + "m3.");
		sc.close();
	}
}
