package abstractainterfaces;

class Electrodomesticointerface implements Productointerface {
	private String nombre;
	private String descripcion;
	private double precio;
	private String marca;
	
	public Electrodomesticointerface(String nombre, String descripcion, double precio, String marca) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca= marca;
	}
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
		System.out.println("Marca: " + marca);
	}
	
}
