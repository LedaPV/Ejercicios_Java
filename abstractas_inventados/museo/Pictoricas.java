package museo;

class Pictoricas extends Obras {

	// Declaramos los atributos de la clase hija Pictóricas
	private String estilo;
	private String tema;
	private String tecnica;
	private String material;

	// Método constructor
	public Pictoricas(String titulo, String autor, String periodo, String localizacion, String estilo, String tema,
			String tecnica, String material) {
		super(titulo, autor, periodo, localizacion);
		this.estilo = estilo;
		this.tema = tema;
		this.tecnica = tecnica;
		this.material = material;
	}

	// Método getter y setter de los atributos de la clase hija Pictóricas
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	// Métodos de funciones
	@Override
	public void MostrarDatos() {
		System.out.println("Título: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Periodo: " + getPeriodo());
		System.out.println("Localización: " + getLocalizacion());
		System.out.println("Estilo: " + getEstilo());
		System.out.println("Tema: " + getTema());
		System.out.println("Técnica: " + getTecnica());
		System.out.println("Material: " + getMaterial());
	}
}
