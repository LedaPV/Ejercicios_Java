/** Ejercicio Libre.
 * 
 * ----------Enunciado de Array Inventado (ejercicios obligatorios)---------
 * 
 * Realiza un programa en Java que guarde en un array 10 números enteros que se 
 * leen por teclado. A continuación se recorre el array y calcula cuántos números 
 * son positivos, cuántos negativos y cuántos ceros. Además calcula la media de 
 * cada uno de ellos
 */

package obligatorios;

import java.util.Scanner;

public class Numeros {

	// Declaramos el array de 10 números y el resto de variables que vamos a
	// necesitar.
	int[] numeros = new int[10];
	int pos;
	int neg;
	int ceros;
	double mediaPos;
	double mediaNeg;
	double mediaCeros;
	
	// Determinamos los métodos(media, calcular positivos, negativos o ceros y
	// la lectura de números
	public double leerNumeros() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = sc.nextInt();
		}
		return 0;
	}

	public double calcular() {
		for (int i = 0; i < 10; i++) {
			if (numeros[i] > 0) {
				pos++;
				mediaPos += numeros[i];
			} else if (numeros[i] < 0) {
				neg++;
				mediaNeg += numeros[i];
			} else {
				ceros++;
				mediaCeros += numeros[i];
			}
		}
		return 0;
	}
	
	public double media(double suma, double contador) {
		    return suma / contador;
		  }


	public static void main(String[] args) {
		
		//Nos devuelve los resultados de todas operaciones
		Numeros numeros = new Numeros();
		numeros.leerNumeros();
		numeros.calcular();
		double mediaPos = numeros.media(numeros.mediaPos, numeros.pos);
		System.out.println("Números positivos: " + numeros.pos + " (media: " + mediaPos + ")");
		double mediaNeg = numeros.media(numeros.mediaNeg, numeros.neg);
		System.out.println("Números negativos: " + numeros.neg + " (media: " + mediaNeg + ")");
		double mediaCeros = numeros.media(numeros.mediaCeros, numeros.ceros);
		System.out.println("Números de ceros: " + numeros.ceros + " (media: " + mediaCeros + ")");

	}
}
