package notasporconsola;

import java.util.Scanner;

public class NotasAsignaturasMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// A continuación pedimos los datos al usuario.
		System.out.println("Ingresa la nota final de la asignatura de Entorno de desarrollo: ");
		float notaEntornoDesarrollo = sc.nextFloat();
		System.out.println("Ingresa la nota final de la asignatura de Programación: ");
		float notaProgramacion = sc.nextFloat();
		System.out.println("Ingresa la nota final de la asignatura de Sistemas Informáticos: ");
		float notaSistemasInformaticos = sc.nextFloat();
		System.out.println("Ingresa la nota final de la asignatura de Bases de datos: ");
		float notaBasesDatos = sc.nextFloat();
		System.out.println("Ingresa la nota final de la asignatura de Lenguajes de Marcas: ");
		float notaLenguajeMarcas = sc.nextFloat();

		NotasAsignaturas notas = new NotasAsignaturas(notaEntornoDesarrollo, notaProgramacion, notaBasesDatos,
				notaLenguajeMarcas, notaSistemasInformaticos);
		
		System.out.println();
		System.out.println("/////////////////////////////////////");
		
		// A continuación obtenemos la media global.
		float notaMediaCurso = notas.calcularNotaMedia();
		System.out.println("Nota media del curso: " + notaMediaCurso);

		// Lo último que queda, es la determinación de la anterior nota.
		String calificacion = notas.determinarCalificacion();
		System.out.println("Por tanto su calificación final es: " + calificacion);
		
		sc.close();

	}

}
