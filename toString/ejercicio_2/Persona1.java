package ejercicio_2;

public abstract class Persona1 {

	// Atributos de la clase padre
	private String nombre;
	private String apellido;
	private int dni;

	// Método constructor
	public Persona1(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	// Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}


	public String toString() {
		return "La persona con nombre " + nombre + apellido + " y con DNI: " + dni;
	}

	public void Calendario() {
		System.out.println("El calendario del curso es 2022/2023.");
	}
}
