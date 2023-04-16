package abstractainterface_Museo;

class Pictoricas implements Obras {

	// Declaramos los atributos de la clase hija Pictóricas
	private String titulo;
	private String autor;
	private String periodo;
	private String localizacion;
	private String estilo;
	private String tema;
	private String tecnica;
	private String material;

	//Método constructor
	public Pictoricas(String titulo, String autor, String periodo, String localizacion, String estilo, String tema,
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

	// Métodos de funciones
	@Override
	public void MostrarDatos() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Periodo: " + periodo);
		System.out.println("Localización: " + localizacion);
		System.out.println("Estilo: " + estilo);
		System.out.println("Tema: " + tema);
		System.out.println("Técnica: " + tecnica);
		System.out.println("Material: " + material);
	}
}
