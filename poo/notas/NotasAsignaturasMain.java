package notas;

public class NotasAsignaturasMain {

	public static void main(String[] args) {
		// Creamos un objeto de la clase anterior.
		NotasAsignaturas notas = new NotasAsignaturas();

		// Introducimos las notas a partir del método setter definido en
		// NotasAsignaturas.
		notas.setNotaBasesDatos(10);
		notas.setNotaEntornoDesarrollo(7);
		notas.setNotaProgramacion(8);
		notas.setNotaSistemasInformaticos(9);
		notas.setNotaLenguajeMarcas(8);

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
