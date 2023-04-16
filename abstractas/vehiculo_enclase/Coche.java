package vehiculo_enclase;

public class Coche extends Vehiculo {

	public Coche(String modelo, String color, String motor) {
		super(modelo, color, motor);
		// TODO Esbozo de constructor generado automáticamente
	}
	
	@Override
	public void MostrarDatos() { //abstracto
		System.out.println("El modelo es " + getModelo() + "; el color es " + getColor() + "; el motor es "+ getMotor());
	}
	@Override
	public void Gracias() { //no abstracto
		super.Gracias(); // esto se utiliza para aprovechar lo hecho en el padre
		System.out.println("Vuelva pronto!!");
	}
	
}
