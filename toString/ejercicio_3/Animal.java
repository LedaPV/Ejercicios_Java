package ejercicio_3;

abstract class Animal {
	// Declaramos los atributos de la clase padre.
	private String nombre;
	private String familia;
	
	// Método constructor
	public Animal(String nombre, String familia) {
		this.nombre = nombre;
		this.familia = familia;
	}
	
	// Método getter y setter del atributo 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFamilia() {
		return familia;
	}

	public void setEspecie(String familia) {
		this.familia = familia;
	}

	//Método para poder mostrar los datos
	public String toString() {
		return "Este animal con nombre " + nombre + " que pertenece a la familia " + familia;
	}
}
	
