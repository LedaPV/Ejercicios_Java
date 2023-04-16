package arraylistabstractinterface;

public abstract class ProductoInformatico {
	protected String nombre;
	protected double precio;

	// Método constructor
	public ProductoInformatico(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	// Método getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Métodos
	public abstract String getDescripcion();

	public void agregarCarrito() {
		System.out.println("Gracias por agregar" + getNombre() + "a su carrito.");
	}

}
