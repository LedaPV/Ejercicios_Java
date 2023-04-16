package tiendaElectrodomésticos;

public class Samsung extends Televisor {

	// Método constructor
	public Samsung(String modelo, int pulgadas, String tipo_pantalla, String calidad_img, String procesador) {
		super(modelo, pulgadas, tipo_pantalla, calidad_img, procesador);
	}

	public void MostrarDatos() {
		System.out.println("El modelo de televisor Samsung es: " + getModelo() + " con " + getPulgadas()
				+ " pulgadas y con una pantalla" + getCalidad_img() + ", además de un procesador " + getProcesador());
	}
}
