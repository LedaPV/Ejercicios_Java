package vehiculos_sinprivate;

class Bicicleta extends Vehiculo {

	// Declaramos los atributos de la clase hija Bicicleta
	String tipo;

	// Métodos sobrescritos
	@Override
	void Acelerar() {
		System.out.println("Acelerando la bici.");
	}

	@Override
	void Frenar() {
		System.out.println("Frenando la bici.");
	}

}
