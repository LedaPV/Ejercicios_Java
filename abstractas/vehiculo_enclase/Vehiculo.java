package vehiculo_enclase;

public abstract class Vehiculo {
	private String modelo;
	private String color;
	private String motor;
	
	public Vehiculo(String modelo, String color, String motor) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
	}
	
	public Vehiculo(String modelo, String color) {
		super();
		this.modelo = modelo;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	
	abstract public void MostrarDatos();
	
	public void Gracias() {
		System.out.println ("Gracias por su compra");
	}

}
