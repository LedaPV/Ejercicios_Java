package vehiculos;

class Bicicleta extends Vehiculo {

	// Declaramos los atributos de la clase hija Bicicleta
	private String tipo;

	// Método constructor
	public Bicicleta(String color, int ruedas, String modelo, String tipo) {
		super(color, ruedas, modelo);
		this.tipo = tipo;
	}

	// Método getter y setter
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Métodos sobrescritos
	@Override
	public void MostrarDatos() {
		System.out.println("La bicicleta es de color " + getColor());
		System.out.println("El número de ruedas de las que consta es " + getRuedas());
		System.out.println("Su modelo es: " + getModelo());
		System.out.println("Tipo de bicicleta: " + getTipo());
		
	}

	@Override
	void Acelerar() {
		System.out.println("Acelerando la bici.");
	}

	@Override
	void Frenar() {
		System.out.println("Frenando la bici.");
	}
}
