package ejercicio_2;

public class InstitutoMain1 {

	public static void main(String[] args) {
		Profesor1[] profesores = { new Profesor1("Alberto", "Ruiz", 45872, 3000, "Enero", "Programación"),
				new Profesor1("Bernardo", "Perez", 56231, 3000, "Febrero", "Sistemas Informáticos") };

		Alumno1[] alumnos = { new Alumno1("Fulgencio", "Ramirez", 58649, 2.8, 8.1, "programacion"),
				new Alumno1("Mar", "Gonzalez", 12345, 3.1, 9.5, "Sistemas") };

		Trabajador1[] trabajadores = { new Trabajador1("Marina", "Acosta", 74866,"Subdirectora", 1800.3, "Enero"),
				new Trabajador1("Eduardo", "De Ceuta", 56120,"Agente de Seguridad", 1000, "Febrero") };

		System.out.println("\t\t CENTRO DIGITECH");
		System.out.println();
		System.out.println("Datos de los profesores: ");
		System.out.println("---");
		for (Profesor1 profesor : profesores) {

			System.out.println(profesor);
			profesor.Calendario();
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println("Datos de los alumnos: ");
		System.out.println("---");
		for (Alumno1 alumno : alumnos) {

			System.out.println(alumno);
			alumno.Calendario();
			System.out.println();

		}
		System.out.println("------------------------------------");
		System.out.println("Datos de los trabajadores: ");
		System.out.println("---");
		for (Trabajador1 trabajador : trabajadores) {

			System.out.println(trabajador);
			trabajador.Calendario();
			System.out.println();
		}

	}
}
