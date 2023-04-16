package arraylistabstractinterface;

public class PortailImp extends ProductoInformatico implements Portatil {
	private int tamañoPantalla;

// Método constructor
	public PortailImp(String nombre, double precio, int tamañoPantalla) {
		super(nombre, precio);
		this.tamañoPantalla = tamañoPantalla;

	}
// Método getter y setter

	public int getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}

	// Métodos
	public String getDescripcion() {
		return "Portatil " + getNombre() + " de " + tamañoPantalla + " " + "pulgadas y su precio " + getPrecio();
	}

	@Override
	public String toString() {
		return super.toString() +  "Los portatiles son ordenadores portables, que actualemnte ofrecen unas capacidades más que valorables \ncomparados con los PC de mesa, a pesar de que estos últimos facilitan un mayor rendimiento y calidad gráfica";
	}
	
	@Override
	public void agregarCarrito() {
		super.agregarCarrito();
		System.out.println("Recibirá" + "un descuento del " + "5% en su próxima" + " compra de portátil. ");
	}

}
