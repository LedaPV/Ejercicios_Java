package abstractainterfaces;

public class Libro extends Producto {
	
	//Libro tiene que tener una clase suya, private, que es autor.
	private String autor;
	
	//El método y el constructor.
	public Libro(String nombre, String descripcion, double precio, String autor) {
		super(nombre, descripcion, precio);
		this.autor=autor;
	}

	@Override
	public void MonstrarInformacion() {
		System.out.println("El nombre es: " + getNombre()); //Nos hace falta el método get, porque la variable es heredada de la clase abstracta producto.
		System.out.println("La descripción es: " + getDescripcion());
		System.out.println("El precio es: " + getPrecio());
		System.out.println("El autor es: " + autor); //No nos hace falta el método get porque autor esta dentro de esta clase.
	}
	

	

	
	
	
}
