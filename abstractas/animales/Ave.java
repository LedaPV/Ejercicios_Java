package animales;

class Ave extends Animal {
	
	//Declaramos los atributos de la clase hija Ave
	private String tipoPlumaje;

	//Método constructor
	public Ave(String nombre, String tipoPlumaje) {
		super(nombre);
		this.tipoPlumaje=tipoPlumaje;
	}
	
	//Método getter y setter del atributo "tipoPlumaje"
	public String getTipoPlumaje() {
		return tipoPlumaje;
	}

	public void setTipoPlumaje(String tipoPlumaje) {
		this.tipoPlumaje = tipoPlumaje;
	}
	
	//Método MostrarDatos()
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Tipo de plumaje: " + getTipoPlumaje());
	}

}
