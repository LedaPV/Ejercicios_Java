/**
 * Modificación del Ejercicio 3 del Libro "Aprende Java con ejercicios" : Crea las
 * clases Animal, Delfín, Loro y Serpiente. Crea objetos, los métodos que veas
 * necesarios y refedínelos si así lo consideras.
 */
package animales;

public abstract class Animal {
	// Introducimos las variables comunes al resto.
	protected String nombre;
	private int edad;
	private String sexo;
	private String tipo;

	// Generamos un método constructor
	public Animal(String nombre, int edad, String sexo, String tipo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.tipo = tipo;
	}

	// Métodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Método para mostrar la información.
	abstract public void MostrarDatos();
}
