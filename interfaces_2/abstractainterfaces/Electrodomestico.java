package abstractainterfaces;

public class Electrodomestico extends Producto{
private String marca;

	//El método y el constructor.
	public Electrodomestico(String nombre, String descripcion, double precio, String autor) {
		super(nombre, descripcion, precio);
		this.marca=marca;
	}

	@Override
	public void MonstrarInformacion() {
		System.out.println("El nombre es: " + getNombre()); 
		System.out.println("La descripción es: " + getDescripcion());
		System.out.println("El precio es: " + getPrecio());
		System.out.println("La marca es: " + marca); 
	}

}
