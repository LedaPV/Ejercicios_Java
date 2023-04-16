/**Enunciado:
 * Calcula las notas de un alumno utilizando para ello un método,
 * que te devuelva la nota según la puntuación obtenida, menor que
 * 4 suspenso, 5 suficiente, 6 bien, 7 y 8 notable, 9 y 10 sobresaliente.
 */
package obligatorios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la puntuación del alumno: ");
		double puntuacion = sc.nextDouble();

		System.out.println("La nota del alumno es: " + calcularNota(puntuacion));
		
		sc.close();
	}

	public static String calcularNota(double puntuacion) {
		if (puntuacion < 4) {
			return "Suspenso";
		} else if (puntuacion >= 5 && puntuacion <= 6) {
			return "Suficiente";
		} else if (puntuacion > 6 && puntuacion <= 7) {
			return "Bien";
		} else if (puntuacion > 7 && puntuacion <= 8) {
			return "Notable";
		} else if (puntuacion > 9 && puntuacion <= 10) {
			return "Sobresaliente";
		} else {
			return "Puntuación inválida";
		}
	}
}
