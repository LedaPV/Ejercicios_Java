/**
 * Modificación del Ejercicio 5 del libro "Aprende Java con ejercicios":
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada 
 * una de ellas se necesita saber el tamaño -mediana o familiar-, el tipo
 * -margarita, cuatro estaciones o cuatro quesos- y su estado -pedida o 
 * servida-. Crea un programa que muestre la información contenida en un 
 * restaurante.
 */
package ejercicio_7;

public abstract class Pizza {
	// Declaramos los atributos con los que vamos a trabajar.
	private String tamaño;
	private String tipo;
	private String estado;

	// Método constructor
	public Pizza(String tamaño, String tipo, String estado) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = estado;
	}

	// Métodos getter y setter
	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// Método para mostrar la información.
	public String toString() {
		return tamaño + ", de tipo " + tipo + ", y que está " + estado;
	}

}
