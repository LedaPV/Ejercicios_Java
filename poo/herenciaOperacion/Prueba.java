package herenciaOperacion;

//Aquí estará el ejecutor por eso aparece el public static void main.
public class Prueba {
	public static void main(String[] ar) {

		// Primero creamos el objeto Suma.
		Suma suma1 = new Suma();

		// Cargamos los valores que han sido leídos en Operación y operamos con
		// procedimiento
		// de la clase Suma.
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();

		// Devolvemos el resultado de la suma.
		System.out.print("El resutado de la suma es: ");
		suma1.mostrarResultado();

		// --------------------------------

		// Creamos el objeto Resta.
		Resta resta1 = new Resta();

		// Cargamos los valores que han sido leídos en Operación y operamos con el
		// procedimiento
		// de la clase Resta.
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();

		// Devolvemos el resultado de la Resta.
		System.out.print("El resutado de la resta es: ");
		resta1.mostrarResultado();

		// ---------------------------------

		// Creamos el objeto de Multiplicación.
		Multiplicacion multiplicacion1 = new Multiplicacion();

		// Cargamos los valores que han sido leídos en Operación y operamos con el
		// procedimiento
		// de la clase Multiplicación.
		multiplicacion1.cargar1();
		multiplicacion1.cargar2();
		multiplicacion1.operar();

		// Devolvemos el resultado de la Multiplicación.
		System.out.print("El resutado de la multiplicación es: ");
		multiplicacion1.mostrarResultado();

		// ------------------------------------

		// Creamos el objeto de División.
		Division division1 = new Division();

		// Cargamos los valores que han sido leídos en Operación y operamos con el
		// procedimiento
		// de la clase División.
		division1.cargar1();
		division1.cargar2();
		division1.operar();

		// Devolvemos el resultado de la División.
		System.out.print("El resutado de la división es: ");
		division1.mostrarResultado();

		// -------------------------------------

		// Creamos el objeto de Potencia.
		Potencia potencia1 = new Potencia();

		// Cargamos los valores que han sido leídos en Operación y operamos con el
		// procedimiento
		// de la clase Potencia.
		potencia1.cargar1();
		potencia1.cargar2();
		potencia1.operar();

		// Devolvemos el resultado de la Potencia.
		System.out.print("El resutado de la potencia es: ");
		potencia1.mostrarResultado();

		// ---------------------------------------

		// Creamos el objeto de Raíz cuadrada del valor 1.
		RaizV1 raiz1 = new RaizV1();

		// Cargamos los valores que han sido leídos en Operación y operamos con el
		// procedimiento
		// de la clase RaizV1.
		raiz1.cargar1();
		raiz1.cargar2();
		raiz1.operar();

		// Devolvemos el resultado de la RaizV1.
		System.out.print("El resutado de la raíz cuadrada correspondiente al primer valor es: ");
		raiz1.mostrarResultado();

		// ----------------------------------------

		// Creamos el objeto de Raíz cuadrada del valor 2.
		RaizV2 raiz2 = new RaizV2();

		// Cargamos los valores que han sido leídos en Operación y operamos con el
		// procedimiento
		// de la clase RaizV2.
		raiz2.cargar1();
		raiz2.cargar2();
		raiz2.operar();

		// Devolvemos el resultado de la RaizV2.
		System.out.print("El resutado de la raíz cuadrada correspondiente al segundo valor es: ");
		raiz2.mostrarResultado();

	}

}
