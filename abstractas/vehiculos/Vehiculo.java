package vehiculos;

abstract class Vehiculo {

	// Declaramos los atributos de la clase padre Vehículo
	private String color;
	private int ruedas;
	private String modelo;

	// Método constructor
	public Vehiculo(String color, int ruedas, String modelo) {
		this.color = color;
		this.ruedas = ruedas;
		this.modelo = modelo;
	}

	// Método getter y setter de los atributos de Vehículo
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Métodos
	public abstract void MostrarDatos();

	abstract void Acelerar();

	abstract void Frenar();

}
