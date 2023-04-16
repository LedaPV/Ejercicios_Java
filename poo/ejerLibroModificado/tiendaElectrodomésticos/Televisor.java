/**
 * Ejercicio simple de un Televisor, donde se pone en práctica el concepto 
 * básico de la programación orientada a objetos.
 * Tienda, que vende dos tipos de televisores, mostrar las características
 * técnicas.
 */
package tiendaElectrodomésticos;

public abstract class Televisor {
	// Declaramos los atributos del televisor
	private String modelo;
	private int pulgadas;
	private String tipo_pantalla;
	private String calidad_img;
	private String procesador;

	// Método constructor
	public Televisor(String modelo, int pulgadas, String tipo_pantalla, String calidad_img, String procesador) {
		this.modelo = modelo;
		this.pulgadas = pulgadas;
		this.tipo_pantalla = tipo_pantalla;
		this.calidad_img = calidad_img;
		this.procesador = procesador;
	}

	// Método getter y setter
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getTipo_pantalla() {
		return tipo_pantalla;
	}

	public void setTipo_pantalla(String tipo_pantalla) {
		this.tipo_pantalla = tipo_pantalla;
	}

	public String getCalidad_img() {
		return calidad_img;
	}

	public void setCalidad_img(String calidad_img) {
		this.calidad_img = calidad_img;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	// Método MostrarDatos
	public void MostrarDatos() {

	}
}
