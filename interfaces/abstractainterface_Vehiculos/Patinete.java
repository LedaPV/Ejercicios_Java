package abstractainterface_Vehiculos;

class Patinete implements Vehiculo {

	private String modelo;
	private String color;
	private double bateria;

	public Patinete(String modelo, String color, double bateria) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.bateria = bateria;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es " + modelo);
		System.out.println("El color es " + color);
		System.out.println("La batería es de " + bateria);
	}

	@Override
	public void Gracias() {
		System.out.println("Gracias por su compra!!");
		System.out.println("Vuelva pronto!!");
	}

}
