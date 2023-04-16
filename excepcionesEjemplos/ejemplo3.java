package excepcionesEjemplos;

public class ejemplo3 {

	public static void main(String[] args) {

		try {
			// LLamamos al método dividir
			int resultado = dividir(10, 0);
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: división entre cero.");
		}
	}

	public static int dividir(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
