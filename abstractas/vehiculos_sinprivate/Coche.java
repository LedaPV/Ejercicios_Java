package vehiculos_sinprivate;

class Coche extends Vehiculo {

	// Declaramos los atributos que pertenecen a la clase hija Coche
	int cilindrada;

	// Métodos sobrescritos
	@Override
	void Acelerar() {
		System.out.println("Acelerando el coche.");
	}

	@Override
	void Frenar() {
		System.out.println("Frenando el coche.");
	}

}
