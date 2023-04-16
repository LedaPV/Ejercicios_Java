package herenciaOperacion;

//La clase multiplicación es hija de la clase padre Operacion.
public class Multiplicacion extends Operacion {

	// Añadimos el procedimiento.
	void operar() {
		resultado = valor1 * valor2;
	}

}
