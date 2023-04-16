package abstractainterface_Animales;

class Ave implements Animal {

	// Declaramos los atributos de la clase hija Ave
	private String nombre;
	private String familia;
	private String tipoPlumaje;
	private String colorPlumaje;

	// Método constructor
	public Ave(String nombre, String familia, String tipoPlumaje, String colorPlumaje) {
		super();
		this.nombre = nombre;
		this.familia = familia;
		this.tipoPlumaje = tipoPlumaje;
		this.colorPlumaje = colorPlumaje;
	}

	// Método MostrarDatos()
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Familia: " + familia);
		System.out.println("Tipo de plumaje: " + tipoPlumaje);
		System.out.println("Color de plumaje: " + colorPlumaje);
	}

}
