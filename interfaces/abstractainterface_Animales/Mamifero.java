package abstractainterface_Animales;

class Mamifero implements Animal {

	// Declaramos el atributo de la clase hija Mamífero
	private String nombre;
	private String familia;
	private String tipoPelo;
	private String colorPelo;

	// Método constructor
	public Mamifero(String nombre, String familia, String tipoPelo, String colorPelo) {
		super();
		this.nombre = nombre;
		this.familia = familia;
		this.tipoPelo = tipoPelo;
		this.colorPelo = colorPelo;
	}

	// Sobrescribir el método MostrarDatos()

	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Familia: " + familia);
		System.out.println("Tipo de pelo: " + tipoPelo);
		System.out.println("Color del pelaje: " + colorPelo);

	}
}
