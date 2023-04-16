package abstractainterfaces2;

 class Electrodomesticointerface implements Productointerface {
	private String nombre;
	private String descripcion;
	private double precio;
	private String marca;
	
	public Electrodomesticointerface(String nombre, String descripcion, double precio, String marca) {
	}
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
		System.out.println("Marca: " + marca);
	}
	@Override
	public void SuCompra() {
		System.out.println("Ha comprado un electrodoméstico, gracias!!");
	}
	@Override
	public void Gracias() {
		System.out.println("Gracias por su compra, vuelve pronto!!!");	
	}
}
