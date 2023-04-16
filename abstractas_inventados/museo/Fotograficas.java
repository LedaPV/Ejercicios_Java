package museo;

class Fotograficas extends Obras {

	// Declaramos los atributos pertenecientes a la clase hija Fotográficas
	private String genero;
	private String color;
	private String contexto;

	// Método constructor
	public Fotograficas(String titulo, String autor, String periodo, String localizacion, String genero, String color,
			String contexto) {
		super(titulo, autor, periodo, localizacion);
		this.genero = genero;
		this.color = color;
		this.contexto = contexto;
	}

	// Método getter y setter
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	//Métodos de función
	@Override
	public void MostrarDatos() {
		System.out.println("Título: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Periodo: " + getPeriodo());
		System.out.println("Localización: " + getLocalizacion());
		System.out.println("Género: " + getGenero());
		System.out.println("Color: " + getColor());
		System.out.println("Contexto: " + getContexto());
	}
}
 