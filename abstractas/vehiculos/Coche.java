package vehiculos;

class Coche extends Vehiculo {

	// Declaramos los atributos que pertenecen a la clase hija Coche
	private int cilindrada;

	// Método constructor
	public Coche(String color, int ruedas, String modelo, int cilindrada) {
		super(color, ruedas, modelo);
		this.cilindrada = cilindrada;
	}

	// Método getter y setter para los nuevos atributos de la clase hija Vehículo
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	// Métodos sobrescritos
	@Override
	public void MostrarDatos() {
		System.out.println("El coche es de color " + getColor());
		System.out.println("El número de ruedas de las que consta es " + getRuedas());
		System.out.println("El modelo es: " + getModelo());
		System.out.println("Su cilindrada es de " + getCilindrada());
		
	}

	@Override
	void Acelerar() {
		System.out.println("Acelerando el coche.");
	}

	@Override
	void Frenar() {
		System.out.println("Frenando el coche.");
	}

}
