/**
 * Realizar el ejercicio anterior de Salario, pero usando el scanner para
 * introducción de datos.
 */
package salario;

import java.util.Scanner;

public class MainSalarioScanner {

	public static void main(String[] args) {

		// Pedimos los datos al usuario.
		Scanner sc = new Scanner(System.in);

		System.out.print("El empleado es: ");
		String nombre = sc.nextLine();
		System.out.print("El salario es: ");
		double salario = sc.nextDouble();
		System.out.print("El incremento es: ");
		double incremento = sc.nextDouble();

		// Creamos el objeto sal con tres argumentos, que adoptaderemos
		// de los datos extraídos por el usuario.
		Salario sal = new Salario(nombre, salario, incremento);

		// Resolvemos el tema del incremento salarial y obtenemos el total.
		double suma = sal.getSalario() + sal.getIncremento();

		// Imprimimos el resultado total, junto con el resto de información.
		System.out.println("El empleado " + sal.getNombre() + ", cuyo salario es de " + sal.getSalario()
				+ "; le corresponde un incremento de " + sal.getIncremento() + " euros. Su total salarial quedaría en: "
				+ suma + " euros.");

		sc.close();

	}

}
