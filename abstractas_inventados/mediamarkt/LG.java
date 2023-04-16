package mediamarkt;

class LG extends Televisor {

	// Método constructor
	public LG(String modelo, int pulgadas, String tipo_pantalla, String calidad_img, String procesador) {
		super(modelo, pulgadas, tipo_pantalla, calidad_img, procesador);
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El modelo de televisor LG es: " + getModelo() + " con " + getPulgadas()
				+ " pulgadas y con una pantalla" + getCalidad_img() + ", además de un procesador " + getProcesador());
	}

}
