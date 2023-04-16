package ejercicio_6;

class Electrodomesticointerface implements Productointerface {
	private String nombre;
	private String descripcion;
	private double precio;
	private String marca;

	public Electrodomesticointerface(String nombre, String descripcion, double precio, String marca) {
	}

	@Override
	public String toString() {
		return super.toString() + "Nombre: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: " + precio
				+ "\nMarca: " + marca + "\nHa comprado un electrodoméstico, gracias!!!"
				+ "\n¡Gracias por su compra!, vuelva pronto!!!";
	}

}
