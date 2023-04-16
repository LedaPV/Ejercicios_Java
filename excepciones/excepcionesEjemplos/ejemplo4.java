package excepcionesEjemplos;

public class ejemplo4 {

	public static void main(String[] args) {

		try {
			verificarEdad(67);
		} catch (EdadInvalidaException e) {
			System.out.println("Ocurrió una excepción, " + e.getMessage());
		}
	}

	public static void verificarEdad(int edad) throws EdadInvalidaException {
		if (edad < 18) {
			throw new EdadInvalidaException("La edad mínima para realizar esta acción es de 18 años");
		}

		else if (edad > 65) {
			throw new EdadInvalidaException("Jubilese caballero");
		}
		System.out.println("La edad es válida, se puede realizar la acción");
	}
}
	
	class EdadInvalidaException extends Exception {
		public EdadInvalidaException(String mensaje) {
			super(mensaje);
		}
}
