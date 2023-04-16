package ejercicioobligatorio_8;

public class GatoComparar implements Comparable<GatoComparar> {

	// Declaramos los atributos de gato
	private String nombre;
	private String color;
	private String raza;

	// Método constructor
	public GatoComparar(String nombre, String color, String raza) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}

	// Método getter y setter
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// Método toString
	public String toString() {
		return "Nombre: " + nombre + "\nColor: " + color + "\nRaza: " + raza;
	}

	// Método compareTo para ordenar los datos de los gatos en función de su nombre
	
	public int compareTo(GatoComparar gatito) {
		return this.nombre.compareTo(gatito.nombre);
	}

	
	public boolean equals(Object obj) {
		if (obj instanceof GatoComparar) {
			GatoComparar gatito = (GatoComparar) obj;
			return this.nombre.equals(gatito.nombre);
		}
		return false;
	}
}