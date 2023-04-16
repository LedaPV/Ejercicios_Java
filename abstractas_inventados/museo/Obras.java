package museo;

abstract class Obras {

	// Declaramos los atributos de la clase padre Obras.
	private String titulo;
	private String autor;
	private String periodo;
	private String localizacion;

	// Método constructor
	public Obras(String titulo, String autor, String periodo, String localizacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.periodo = periodo;
		this.localizacion = localizacion;
	}

	// Método getter y setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	// Métodos de función
	public abstract void MostrarDatos();

}
