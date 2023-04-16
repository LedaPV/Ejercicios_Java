package ejercicio_3;

class Ave extends Animal {

	// Declaramos los atributos de la clase hija Ave
	private String tipoPlumaje;
	private String colorPlumaje;

	// Método constructor
	public Ave(String nombre, String familia, String tipoPlumaje, String colorPlumaje) {
		super(nombre, familia);
		this.tipoPlumaje= tipoPlumaje;
		this.colorPlumaje= colorPlumaje;
	}

	// Método getter y setter
	public String getTipoPlumaje() {
		return tipoPlumaje;
	}

	public void setTipoPlumaje(String tipoPlumaje) {
		this.tipoPlumaje = tipoPlumaje;
	}

	public String getColorPlumaje() {
		return colorPlumaje;
	}

	public void setColorPlumaje(String colorPlumaje) {
		this.colorPlumaje = colorPlumaje;
	}

	// Método MostrarDatos()
	@Override
	public String toString() {
		return super.toString() + " con un tipo de plumaje de " + tipoPlumaje + ", con los colores que pueden ser de " + colorPlumaje;
	}

}
