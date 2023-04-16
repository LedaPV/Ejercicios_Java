package animales_variacion;

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
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Familia: " + getFamilia());
		System.out.println("Tipo de plumaje: " + getTipoPlumaje());
		System.out.println("Color de plumaje: " + getColorPlumaje());
	}

}
