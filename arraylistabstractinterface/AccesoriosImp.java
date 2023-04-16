package arraylistabstractinterface;

public class AccesoriosImp extends ProductoInformatico implements Accesorios {
	private String marca;
	private String tipo;

	// Método constructor
	public AccesoriosImp(String nombre, double precio, String marca, String tipo) {
		super(nombre, precio);
		this.marca = marca;
		this.tipo = tipo;

	}

	// Método getter y setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Métodos
	public String getDescripcion() {
		return "Accesorio " + getNombre() + ", tipo: " + tipo + ". Cuya marca es " + marca + ", precio" + getPrecio()+ " euros.";
	}

	@Override
	public String toString() {
		return super.toString() + "Los accesorios complementarán a los productos informáticos protegiéndolos y haciéndolos más portables.";
	}

	@Override
	public void agregarCarrito() {
		super.agregarCarrito();
		System.out.println("Recibirá de regalo una caja de pañuelos y un pestiño.");
	}
	
	

}
