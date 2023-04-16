package ejercicio_1;

public class Coche extends Vehiculo {
	private String motor;

	public Coche(String modelo, String color, String motor) {
		super(modelo, color);
		this.motor =motor;
	}
	
	// Métodos getter y setter
	public String getMotor() {
		return motor;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return super.toString() + " el motor es de " + motor;
	}
	@Override
	public void Gracias() { //no abstracto
		super.Gracias(); // esto se utiliza para aprovechar lo hecho en el padre
		System.out.println("Vuelva pronto!!");
	}
	
}
