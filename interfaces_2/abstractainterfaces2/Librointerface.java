package abstractainterfaces2;

//No hace falta el getter y setter; pero si hace falta los constructores y métodos abstractos.
 class Librointerface implements Productointerface {
	private String nombre;
	private String autor;
	private String descripcion;
	private double precio;

	public Librointerface(String nombre, String autor, String descripcion, double precio) {
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Autor: " + autor);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
	}
	@Override
	public void SuCompra() {
		System.out.println("Ha comprado un libro, gracias!!");	
	}
	@Override
	public void Gracias() {
		System.out.println("Gracias por su compra, vuelve pronto!!!");	
	}
	
}
