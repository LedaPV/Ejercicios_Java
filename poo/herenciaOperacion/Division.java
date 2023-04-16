package herenciaOperacion;

//La clase División es hija de la clase padre Operación.
public class Division extends Operacion {

	// Añadimos el procedimiento.
	void operar() {
		resultado = valor1 / valor2;
	}

}
