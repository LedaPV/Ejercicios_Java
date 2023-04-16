package ejercicio_6;

class Ropainterface implements Productointerface {
	private String nombre;
	private String descripcion;
	private double precio;
	private String color;
	private String talla;

	public Ropainterface(String nombre, String descripcion, double precio, String color, String talla) {
	}

	@Override
	public String toString() {
		return super.toString() + "Nombre: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: " + precio
				+ "\nEl color es: " + color + "\nLa talla es: " + talla
				+ "\nHa comprado un electrodoméstico, gracias!!!" + "\n¡Gracias por su compra!, vuelva pronto!!!";
	}

}
