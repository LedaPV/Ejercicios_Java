package notasporconsola;

class NotasAsignaturas {
	// Creamos todas las variables que vamos a utilizar.
	private float notaEntornoDesarrollo;
	private float notaProgramacion;
	private float notaSistemasInformaticos;
	private float notaBasesDatos;
	private float notaLenguajeMarcas;

	////// Método constructor. De esta forma podremos pedir al usuario que inserte las notas.

	public NotasAsignaturas(float notaEntornoDesarrollo, float notaProgramacion, float notaSistemasInformaticos,
			float notaBasesDatos, float notaLenguajeMarcas) {
		super();
		this.notaEntornoDesarrollo = notaEntornoDesarrollo;
		this.notaProgramacion = notaProgramacion;
		this.notaSistemasInformaticos = notaSistemasInformaticos;
		this.notaBasesDatos = notaBasesDatos;
		this.notaLenguajeMarcas = notaLenguajeMarcas;
	}

	////////////////////////// Método getter y setter de cada de las asignaturas.

	public float getNotaEntornoDesarrollo() {
		return notaEntornoDesarrollo;
	}

	public void setNotaEntornoDesarrollo(float notaEntornoDesarrollo) {
		this.notaEntornoDesarrollo = notaEntornoDesarrollo;
	}

	public float getNotaProgramacion() {
		return notaProgramacion;
	}

	public void setNotaProgramacion(float notaProgramacion) {
		this.notaProgramacion = notaProgramacion;
	}

	public float getNotaSistemasInformaticos() {
		return notaSistemasInformaticos;
	}

	public void setNotaSistemasInformaticos(float notaSistemasInformaticos) {
		this.notaSistemasInformaticos = notaSistemasInformaticos;
	}

	public float getNotaBasesDatos() {
		return notaBasesDatos;
	}

	public void setNotaBasesDatos(float notaBasesDatos) {
		this.notaBasesDatos = notaBasesDatos;
	}

	public float getNotaLenguajeMarcas() {
		return notaLenguajeMarcas;
	}

	public void setNotaLenguajeMarcas(float notaLenguajeMarcas) {
		this.notaLenguajeMarcas = notaLenguajeMarcas;
	}

	////////////////////////////// Método para calcular la nota media.

	public float calcularNotaMedia() {
		return (notaEntornoDesarrollo + notaProgramacion + notaSistemasInformaticos + notaBasesDatos
				+ notaLenguajeMarcas) / 5;
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
