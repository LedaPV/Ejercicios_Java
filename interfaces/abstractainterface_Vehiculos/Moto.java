package abstractainterface_Vehiculos;

class Moto implements Vehiculo {
	private String modelo;
	private String color;
	private String motor;

	public Moto(String modelo, String color, String motor) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es " + modelo);
		System.out.println("El color es " + color);
		System.out.println("El motor es " + motor);
	}

	@Override
	public void Gracias() {
		System.out.println("Gracias por su compra!!");
		System.out.println("Vuelva pronto!!");
	}

}
