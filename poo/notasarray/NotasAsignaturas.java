package notasarray;

class NotasAsignaturas {
	// Creamos los arrays de las variables que vamos a utilizar.
	private String[] asignaturas;
	private float[] notas;
	
	////////////////////////// Método getter y setter para asignaturas.

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	//////////////////////////Método getter y setter para notas.
	
	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}

	////////////////////////////// Método para calcular la nota media.

	public float calcularNotaMedia() {
		//Iniciamos la variable suma que es la que lo va a acumular.
		float sum = 0;
		for (float nota: notas) {
			sum+=nota;
		}
		return sum/notas.length;
	}
	
	////////////// Método para determinar la nota global del estudiante.

	public String determinarCalificacion() {

		// Renombramos el método anterior para trabajar con él.
		float notaMedia = calcularNotaMedia();

		// Introducimos condicionales para poder llevar a cabo la calificación global.
		if (notaMedia < 5) {
			return "Suspendido";
		} else if (notaMedia >= 5 && notaMedia < 6) {
			return "Aprobado";
		} else if (notaMedia >= 6 && notaMedia < 7) {
			return "Bien";
		} else if (notaMedia >= 7 && notaMedia < 9) {
			return "Notable";
		} else {
			return "Sobresaliente";
		}
	}
}
