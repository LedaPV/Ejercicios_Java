package ejercicio_4;

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
	public String toString() {
		return super.toString() + " El titulo es: " + titulo + " el autor es: " + autor + " es del periodo " + periodo + " se encontro en: " + localizacion + " es de genero " + genero + " el color es " + color + " el contexto es " + contexto;
	}
}
 