package vehiculos_sinprivate;

class Moto extends Vehiculo {

	// Declaramos el atributo de la clase hija Moto
	String posicion_conduccion;

	// Métodos sobrescritos
	@Override
	void Acelerar() {
		System.out.println("Acelerando la moto.");
	}

	@Override
	void Frenar() {
		System.out.println("Frenando la moto.");
	}

}
