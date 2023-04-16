package ejercicio_1;

public abstract class Vehiculo {
	private String modelo;
	private String color;
	
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
	
	
	public String toString() {
		return "El color es: " + color  + ", y el modelo es" + modelo;
	}
	
	public void Gracias() {
		System.out.println ("Gracias por su compra");
	}

}
