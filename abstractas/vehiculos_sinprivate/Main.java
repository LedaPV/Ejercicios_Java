package vehiculos_sinprivate;

public class Main {

	public static void main(String[] args) {
		Coche renault = new Coche();
		renault.color = "rojo";
		renault.ruedas = 4;
		renault.modelo = "Renault Clio";
		renault.cilindrada = 1600;
		renault.Acelerar();
		renault.Frenar();

		Bicicleta mountainBike = new Bicicleta();
		mountainBike.color = "verde";
		mountainBike.ruedas = 2;
		mountainBike.modelo = "Mountain Bike";
		mountainBike.tipo = "montaña";
		mountainBike.Acelerar();
		mountainBike.Frenar();

		Moto harley = new Moto();
		harley.color = "negra";
		harley.ruedas = 2;
		harley.modelo = "Harley Davidson, Street Fighter 975";
		harley.posicion_conduccion = "conducción deportiva";
		harley.Acelerar();
		harley.Frenar();

	}

}
