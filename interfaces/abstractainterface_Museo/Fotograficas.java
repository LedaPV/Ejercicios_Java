package abstractainterface_Museo;

class Fotograficas implements Obras {

	// Declaramos los atributos pertenecientes a la clase hija Fotográficas
	private String titulo;
	private String autor;
	private String periodo;
	private String localizacion;
	private String genero;
	private String color;
	private String contexto;

	//Método constructor
	public Fotograficas(String titulo, String autor, String periodo, String localizacion, String genero, String color,
			String contexto) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.periodo = periodo;
		this.localizacion = localizacion;
		this.genero = genero;
		this.color = color;
		this.contexto = contexto;
	}

	//Métodos de función
	@Override
	public void MostrarDatos() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Periodo: " + periodo);
		System.out.println("Localización: " + localizacion);
		System.out.println("Género: " + genero);
		System.out.println("Color: " + color);
		System.out.println("Contexto: " + contexto);
	}
}
 