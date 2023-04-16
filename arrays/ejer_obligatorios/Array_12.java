/**Enunciado Array_12:
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por 
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer 
 * valor por el segundo en la lista generada anteriormente. Los números que se han 
 * cambiado deben aparecer entrecomillados.
 */
package ejer_obligatorios;

import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
		// Creamos un array "aleatorio" que contenga los espacios
		// correspondientes a 100 números.
		int[] aleatorio = new int[100];

		// Creamos un ciclo for que rellene los espacios del array
		// de forma aleatoria.
		// "Math.random()*21", esta función se multiplica por 21,
		// porque dicho método solo devuelve valores aleatorios
		// entre 0 y 1, pero sin contar el 1. Por ello, si deseamos
		// que sea entre 0 y 20, deberíamos multiplicarlo por 20+1=21.
		for (int i = 0; i < 100; i++) {
			aleatorio[i] = (int) (Math.random() * 21);
			System.out.print(aleatorio[i] + " ");
		}

		// A continuación, pedimos los valores por teclado.
		// Para que los lea, debemos utilizar la función Scanner.
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce el primer valor, el del número que deseas cambiar: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce el segundo valor: ");
		int num2 = sc.nextInt();

		// Ahora, hacemos un bucle que recorra todos los números
		// cambiando los valores de un número por otro.
		// En caso de que el valor del número 1 introducido sea
		// idéntico a alguno de los números aleatorios generados
		// por el array, se cambiará por el número 2.
		for (int i = 0; i < 100; i++) {
			if (aleatorio[i] == num1) {
				aleatorio[i] = num2;
				System.out.print("\"" + num2 + "\" ");
			} else {
				System.out.print(aleatorio[i] + " ");
			}
		}
		sc.close();
	}
}