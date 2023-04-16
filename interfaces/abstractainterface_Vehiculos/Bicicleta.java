package abstractainterface_Vehiculos;

class Bicicleta implements Vehiculo {
	private String modelo;
	private String color;
	private String tipo;

	public Bicicleta(String modelo, String color, String tipo) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es " + modelo);
		System.out.println("El color es " + color);
		System.out.println("El tipo es " + tipo);
	}

	@Override
	public void Gracias() {
		System.out.println("Gracias por su compra!!");
		System.out.println("Vuelva pronto!!");
	}

}
