package centro;

public class InstitutoMain1 {

	public static void main(String[] args) {
		Profesor1[] profesores = { new Profesor1("Alberto", "Ruiz", 45872, "Programación", 3000, "Enero"),
				new Profesor1("Bernardo", "Perez", 56231, "Sistemas Informáticos", 3000, "Febrero") };

		Alumno1[] alumnos = { new Alumno1("Fulgencio", "Ramirez", 58649, "Programación", 8, 9),
				new Alumno1("Mar", "Gonzalez", 12345, "Base de datos", 9.5, 10) };

		Trabajador1[] trabajadores = { new Trabajador1("Marina", "Acosta", 74866, null, "Subdirectora", 1800, "Enero"),
				new Trabajador1("Eduardo", "De Ceuta", 56120, null,"Agente de Seguridad", 1000, "Febrero") };

		System.out.println("\t\t CENTRO DIGITECH");
		System.out.println();
		System.out.println("Datos de los profesores: ");
		System.out.println("---");
		for (Profesor1 profesor : profesores) {

			profesor.MostrarDatos();
			profesor.Calendario();
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println("Datos de los alumnos: ");
		System.out.println("---");
		for (Alumno1 alumno : alumnos) {

			alumno.MostrarDatos();
			alumno.Calendario();
			System.out.println();

		}
		System.out.println("------------------------------------");
		System.out.println("Datos de los trabajadores: ");
		System.out.println("---");
		for (Trabajador1 trabajador : trabajadores) {

			trabajador.MostrarDatos();
			trabajador.Calendario();
			System.out.println();
		}

	}
}
