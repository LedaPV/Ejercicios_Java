package herenciaOperacion;

// El extends significa que depende de la clase Operacion, siendo esta última la clase padre y Suma 
// la hija
public class Suma extends Operacion {

	// En primer lugar detallamos un procedimiento.
	void operar() {
		resultado = valor1 + valor2;
	}
}
