package ejercicio_5;

class LG implements Televisor {

	private String modelo;
	private int pulgadas;
	private String tipo_pantalla;
	private String calidad_img;
	private String procesador;

	// Método constructor
	public LG(String modelo, int pulgadas, String tipo_pantalla, String calidad_img, String procesador) {
		super();
		this.modelo = modelo;
		this.pulgadas = pulgadas;
		this.tipo_pantalla = tipo_pantalla;
		this.calidad_img = calidad_img;
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return super.toString() + "El modelo de televisor LG es: " + modelo + " y tiene " + pulgadas + "pulgadas."
				+ "\nSu pantalla es: " + tipo_pantalla + ",con una calidad de " + calidad_img
				+ " y cuenta con un procesador " + procesador;
	}

}
