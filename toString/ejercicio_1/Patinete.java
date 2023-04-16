package ejercicio_1;

public class Patinete extends Vehiculo {
	private double bateria;

	public Patinete(String modelo, String color, double bateria) {
		super(modelo, color);
		this.bateria=bateria;
		// TODO Esbozo de constructor generado automáticamente
	}

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}
	@Override
	public String toString() {
		return super.toString() + " tiene una batería de " + bateria;
	}
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Vuelva pronto!!");
	}
	
}
