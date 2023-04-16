package herenciaOperacion;

//Extends: potencia clase hija de padre Operación.
public class Potencia extends Operacion {

	// Añadimos el procedimiento.
	void operar() {
		resultado = Math.pow(valor1, valor2);
	}

}
