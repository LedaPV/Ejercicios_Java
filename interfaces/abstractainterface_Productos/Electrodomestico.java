package abstractainterface_Productos;

public class Electrodomestico extends Producto{
private String marca;

	//El método y el constructor.
	public Electrodomestico(String nombre, String descripcion, double precio, String marca) {
		super(nombre, descripcion, precio);
		this.marca=marca;
	}

	@Override
	public void MostrarInformacion() {
		super.MostrarInformacion();
		System.out.println("La marca es: " + marca); 
	}
	@Override
	// no se coloca super porque es una clase abstracta y no esta definida, no tiene nada.
	public void SuCompra() {
		System.out.println("Ha comprado un electrodoméstico, gracias!!!");
	}

	public void Gracias() {
		// TODO Esbozo de método generado automáticamente
		
	}	

}
