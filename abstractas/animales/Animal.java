package animales;

abstract class Animal {
	// Declaramos los atributos de la clase padre.
	private String nombre;
	
	// Método constructor
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	// Método getter y setter del atributo "nombre"
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Método para poder mostrar los datos
	public abstract void MostrarDatos();
}
