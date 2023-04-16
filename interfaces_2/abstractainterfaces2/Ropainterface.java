package abstractainterfaces2;

class Ropainterface implements Productointerface{
	private String nombre;
	private String descripcion;
	private double precio;
	private String color;
	private String talla;

	public Ropainterface(String nombre, String descripcion, double precio,String color, String talla) {
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
		System.out.println("El color es: " + color); 
		System.out.println("La talla es: " + talla); 
	}
	@Override
	// no se coloca super porque es una clase abstracta y no esta definida, no tiene nada.
	public void SuCompra() {
		System.out.println("Ha comprado un artículo de vestir, gracias!!!");
	}
	@Override
	public void Gracias() {
		System.out.println("Gracias por su compra, vuelve pronto!!!");	
	}

}
