package arraylistabstractinterface;

public class MovilImp extends ProductoInformatico implements Movil {
	private int tamañoPantalla;
	private String operador;

	// Método constructor
	public MovilImp(String nombre, double precio, int tamañoPantalla, String operador) {
		super(nombre, precio);
		this.tamañoPantalla = tamañoPantalla;
		this.operador = operador;
	}

	// Método getter y setter
	public int getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	// Métodos
	public String getDescripcion() {
		return "Móvil " + getNombre() + " de " + tamañoPantalla + " pulgadas, operador: " + ", precio" + getPrecio();
	}

	@Override
	public String toString() {
		return super.toString()
				+ "Los móviles son aquellos dispositivos portables que nos permiten realizar una gran infinidad de tareas, \npero debemos tener en cuenta que no muestran las capacidades de una computadora";
	}

	@Override
	public void agregarCarrito() {
		super.agregarCarrito();
		System.out.println("Recibirá un protector de pantalla gratis " + "con su compra de móvil.");
	}

}
