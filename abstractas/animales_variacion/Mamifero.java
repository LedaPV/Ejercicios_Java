package animales_variacion;

class Mamifero extends Animal {

	// Declaramos el atributo de la clase hija Mamífero
	private String tipoPelo;
	private String colorPelo;

	// Método constructor
	public Mamifero(String nombre, String familia, String tipoPelo, String colorPelo) {
		super(nombre, familia);
		this.tipoPelo= tipoPelo;
		this.colorPelo= colorPelo;
	}

	// Método getter y setter de los atributos de la clase hija Mamífero
	public String getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	// Sobrescribir el método MostrarDatos()
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Familia: " + getFamilia());
		System.out.println("Tipo de pelo: " + getTipoPelo());
		System.out.println("Color del pelaje: " + getColorPelo());

	}
}
