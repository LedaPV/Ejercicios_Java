package animales;

class Mamifero extends Animal {

	// Declaramos el atributo de la clase hija Mamífero
	private String tipoPelo;

	// Método constructor
	public Mamifero(String nombre, String tipoPelo) {
		super(nombre);
		this.tipoPelo = tipoPelo;

	}

	// Método getter y setter del atributo "tipoPelo"
	public String getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}

	// Sobrescribir el método MostrarDatos()
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Tipo de pelo: " + getTipoPelo());

	}
}
