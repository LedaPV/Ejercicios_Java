package vehiculo_enclase;

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
	public void MostrarDatos() {
		System.out.println(
				"El modelo es " + getModelo() + "; el color es " + getColor() + "; su batería es " + getBateria());
	}
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Vuelva pronto!!");
	}
	
}
