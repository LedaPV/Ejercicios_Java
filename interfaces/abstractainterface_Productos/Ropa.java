package abstractainterface_Productos;

public class Ropa extends Producto {
	private String color;
	private String talla;

	//El método y el constructor.
	public Ropa(String nombre, String descripcion, double precio,String color, String talla) {
		super(nombre, descripcion, precio);
		this.color=color;
		this.talla=talla;
	}

	@Override
	public void MostrarInformacion() {
		super.MostrarInformacion();
		System.out.println("El color es: " + color); 
		System.out.println("La talla es: " + talla); 
	}
	@Override
	// no se coloca super porque es una clase abstracta y no esta definida, no tiene nada.
	public void SuCompra() {
		System.out.println("Ha comprado un artículo de vestir, gracias!!!");
	}

	public void Gracias() {
		// TODO Esbozo de método generado automáticamente
		
	}	

}

