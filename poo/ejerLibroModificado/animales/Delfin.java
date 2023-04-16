package animales;

class Delfin extends Animal {

	// Nuevo atributo de la clase hija Delfín.
	protected String ecosistema;

	// Método constructor
	public Delfin(String nombre, int edad, String sexo, String tipo, String ecosistema) {
		super(nombre, edad, sexo, tipo);
		this.ecosistema = ecosistema;
	}

	// Método getter y setter
	public String getEcosistema() {
		return ecosistema;
	}

	public void setEcosistema(String ecosistema) {
		this.ecosistema = ecosistema;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Este delfín se llama " + getNombre() + ", tiene una edad de " + getEdad() + " años y es "
				+ getSexo() + ". Los defines son " + getTipo() + " y viven en un ecosistema " + getEcosistema());
	}

}
