package vehiculos;

class Moto extends Vehiculo {

	// Declaramos los atributos de la clase hija Moto
	private String tipo_conduccion;

	// Método constructor
	public Moto(String color, int ruedas, String modelo, String tipo_conduccion) {
		super(color, ruedas, modelo);
		this.tipo_conduccion = tipo_conduccion;
	}

	// Método getter y setter
	public String getTipo_conduccion() {
		return tipo_conduccion;
	}

	public void setTipo_conduccion(String tipo_conduccion) {
		this.tipo_conduccion = tipo_conduccion;
	}

	// Método sobreescritos
	@Override
	public void MostrarDatos() {
		System.out.println("La moto es de color " + getColor());
		System.out.println("El número de ruedas de las que consta son " + getRuedas());
		System.out.println("El modelo es: " + getModelo());
		System.out.println("Tipo de conduccion: " + getTipo_conduccion());
		
	}

	@Override
	void Acelerar() {
		System.out.println("Acelerando la moto.");
	}

	@Override
	void Frenar() {
		System.out.println("Frenando la moto.");
	}

}
