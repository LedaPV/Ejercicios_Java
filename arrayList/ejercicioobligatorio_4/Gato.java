package ejercicioobligatorio_4;

public class Gato {
	private String nombre;
	private String color;
	private String tipo;
	private int edad;

	public Gato(String nombre, String color, String tipo, int edad) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Método toString
	public String toString() {
		return "Nombre: " + nombre + ", Color: " + color + ", Raza: " + tipo + ", Edad: " + edad + " años.";
	}

}
