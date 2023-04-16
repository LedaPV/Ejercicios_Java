package vehiculo_enclase;

public class Moto extends Vehiculo{
	public Moto(String modelo, String color, String motor) {
		super(modelo, color, motor);
		// TODO Esbozo de constructor generado automáticamente
	}
	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es " + getModelo() + "; el color es " + getColor() + "; el motor es " +getMotor());
	}
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Vuelva pronto!!");
	}

}
