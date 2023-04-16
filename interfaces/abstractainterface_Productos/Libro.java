package abstractainterface_Productos;

public class Libro extends Producto {
	
	//Libro tiene que tener una clase suya, private, que es autor.
	private String autor;
	
	//El método y el constructor.
	public Libro(String nombre, String descripcion, double precio, String autor) {
		super(nombre, descripcion, precio);
		this.autor=autor;
	}

	@Override
	public void MostrarInformacion() {
		super.MostrarInformacion();
		System.out.println("El autor es: " + autor); //No nos hace falta el método get porque autor esta dentro de esta clase.
	}
	@Override
	// no se coloca super porque es una clase abstracta y no esta definida, no tiene nada.
	public void SuCompra() {
		System.out.println("Ha comprado un libro, gracias!!!");
	}

	public void Gracias() {
		// TODO Esbozo de método generado automáticamente
		
	}	
}
