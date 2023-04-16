package ejercicio_6;

//No hace falta el getter y setter; pero si hace falta los constructores y métodos abstractos.
class Librointerface implements Productointerface {
	private String nombre;
	private String autor;
	private String descripcion;
	private double precio;

	public Librointerface(String nombre, String autor, String descripcion, double precio) {
	}

	@Override
	public String toString() {
		return super.toString() + "Nombre: " + nombre + "\nAutor: " + autor + "\nDescripción: " + descripcion
				+ "\nPrecio: " + precio + "\nHa comprado un electrodoméstico, gracias!!!"
				+ "\n¡Gracias por su compra!, vuelva pronto!!!";
	}

}
