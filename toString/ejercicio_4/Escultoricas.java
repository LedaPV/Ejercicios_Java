package ejercicio_4;

class Escultoricas implements Obras {
	
	//Declaramos los atributos de la clase hija Escultóricas, que debe heredar 
	//de una interfaz para ello hemos cambiado la clase padre de Pictóricas a Obras.
	private String titulo;
	private String autor;
	private String periodo;
	private String localizacion;
	private String estilo;
	private String tema;
	private String tecnica;
	private String material;
	
	// Método constructor
	public Escultoricas(String titulo, String autor, String periodo, String localizacion, String estilo, String tema,
			String tecnica, String material) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.periodo = periodo;
		this.localizacion = localizacion;
		this.estilo = estilo;
		this.tema = tema;
		this.tecnica = tecnica;
		this.material = material;
	}

	// Método de función
	@Override
	public String toString() {
		return super.toString() + " El titulo es: " + titulo + " el autor es: " + autor + " es del periodo " + periodo + " se encontro en: " + localizacion + " es de estilo " + estilo + " el tema de la obra " + tema + " esta realizada en la técnia de: " + tecnica + " realizada en " + material;
	}
	
}
