package ejercicio_3;

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
	public String toString() {
		return super.toString() + " con una longitud del pelo " + tipoPelo + ",con un color que puede ser " + colorPelo;

	}
}
