package ejercicio_1;

public class Moto extends Vehiculo {
	private String motor;

	public Moto(String modelo, String color, String motor) {
		super(modelo, color);
		this.motor= motor;
	}


	@Override
	public String toString() {
		return super.toString() + " el motor es de " + motor;
	}

	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Vuelva pronto!!");
	}

}
