package animales;

class Serpiente extends Animal {
	// Nuevos atributos de la clase hija Serpiente
	protected String esvenenosa;

	// Método constructor
	public Serpiente(String nombre, int edad, String sexo, String tipo, String esvenenosa) {
		super(nombre, edad, sexo, tipo);
		this.esvenenosa = esvenenosa;
	}

	// Método getter y setter
	public String getEsvenenosa() {
		return esvenenosa;
	}

	public void setEsvenenosa(String esvenenosa) {
		this.esvenenosa = esvenenosa;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Este serpiente se llama " + getNombre() + ", tiene una edad de " + getEdad() + " años y es "
				+ getSexo() + ". Las serpientes son " + getTipo() + " y pueden ser " + getEsvenenosa());

	}

}
