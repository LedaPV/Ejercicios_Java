package animales;

class Loro extends Animal {

	// Nuevo atributo de la clase hija Loro
	protected String vuela;
	protected String coloralas;

	// Método constructor
	public Loro(String nombre, int edad, String sexo, String tipo, String vuela, String coloralas) {
		super(nombre, edad, sexo, tipo);
		this.vuela = vuela;
		this.coloralas = coloralas;
	}

	// Método getter y setter
	public String getVuela() {
		return vuela;
	}

	public void setVuela(String vuela) {
		this.vuela = vuela;
	}

	public String getColoralas() {
		return coloralas;
	}

	public void setColoralas(String coloralas) {
		this.coloralas = coloralas;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Este loro se llama " + getNombre() + ", tiene una edad de " + getEdad() + " años y es "
				+ getSexo() + ". Los loros son " + getTipo() + " y pueden " + getVuela() + " con sus alas de color "
				+ getColoralas());
	}

}
