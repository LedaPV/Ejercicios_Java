/**Ejemplo de recorrido de un array.
 * Un array que almacena notas de los alumnos. 
 */
package ejer_clase;
import java.util.Scanner;
public class Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nota = new double[4]; // se define el array y se reservan los espacios correspondientes a 4 notas.
		System.out.println("Para calcular la nota media necesito saber la nota de cada uno de tus examenes.");
		for (int i=0; i<4; i++) { // se introduce un ciclo for para que el usuario inserte sus notas.
			System.out.print("Nota del examen nº " + (i+1) + ": ");
			nota [i] = sc.nextDouble();
		}
		double suma = 0;
		for (int i=0; i<4; i++) {
			System.out.print(nota[i] + " / ");
			suma += nota[i];
		}
		System.out.println("\nLa media es " + suma/4);
	}

}