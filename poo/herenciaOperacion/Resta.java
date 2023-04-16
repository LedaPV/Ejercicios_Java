package herenciaOperacion;

//La clase Resta es hija/depende de la clase Operación. 
public class Resta extends Operacion {

	// Añadimos un procedimiento.
	void operar() {
		resultado = valor1 - valor2;
	}
}
