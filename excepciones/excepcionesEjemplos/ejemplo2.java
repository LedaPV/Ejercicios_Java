package excepcionesEjemplos;

public class ejemplo2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };

		try {
			// intentamos acceder a un elemento fuera del tamaño del array
			int valor = array[3];
			System.out.println("El valor es: " + valor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Índice fuera de rango");
		}

		try {
			// Intentamos convertir euna cadena no númerica en un entero
			String cadena = "hola";
			int valor = Integer.parseInt(cadena);
			System.out.println("El valor es: " + valor);
		} catch (NumberFormatException e) {
			System.out.println("Error: la cadena no es número. ");
		}

		try {
			// Intentamos dividir entre cero
			int a = 10;
			int b = 0;
			int resultado = a / b;
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: división entre 0");
		}
	}

}
