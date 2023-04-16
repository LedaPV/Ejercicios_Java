package notasarray;

public class NotasAsignaturasMain {

	public static void main(String[] args) {
		// Creamos un objeto de la clase anterior.
		NotasAsignaturas notas = new NotasAsignaturas();

		// Introducimos las notas a partir del método setter definido en
		// NotasAsignaturas. Primero, colocamos sus nombres mediante un
		// array y luego, mediante otro, la calificación de las mismas.
		notas.setAsignaturas(new String[] { "Entorno de desarrollo", "Programación", "Sistemas informáticos",
				"Bases de datos", "Lenguaje de marcas" });
		notas.setNotas(new float[] {7,8,9,10,8});

		// A continuación obtenemos la media global, utilizando el método
		// calcularNotaMedia()
		// de NotasAsignaturas(). Teniendo en cuenta "float notaMedia =
		// calcularNotaMedia()" y sabiendo que debemos determinar una variable para
		// llamar al método.
		float notaMediaCurso = notas.calcularNotaMedia();
		System.out.println("Nota media del curso: " + notaMediaCurso);

		// Lo último que queda, es la determinación de la anterior nota.
		// Para ello utilizaremos el método determinarCalificacion() de
		// NotasAsignaturas().
		String calificacion = notas.determinarCalificacion();
		System.out.println("Por tanto su calificación final es: " + calificacion);

	}

}
