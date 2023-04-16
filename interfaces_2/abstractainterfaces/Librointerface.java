package abstractainterfaces;
//No hace falta el getter y setter; pero si hace falta los constructores y métodos abstractos.
class Librointerface implements Productointerface {
	private String nombre;
	private String autor;
	private String descripcion;
	private double precio;
	public Librointerface(String nombre, String autor, String descripcion, double precio) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Autor: " + autor);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
	}
	

	
	
	
}
