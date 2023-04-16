package museo;

class Escultoricas extends Pictoricas {
	
	// Método constructor
	public Escultoricas(String titulo, String autor, String periodo, String localizacion, String estilo, String tema,
			String tecnica, String material) {
		super(titulo, autor, periodo, localizacion, estilo, tema, tecnica, material);
		
	}
	
	// Método de función
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
