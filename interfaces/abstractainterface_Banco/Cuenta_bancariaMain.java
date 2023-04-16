package abstractainterface_Banco;

public class Cuenta_bancariaMain {
	public static void main(String[] args) {

		// Cuenta corriente
		CuentaCorriente cuentaCorriente = new CuentaCorriente(12346789, "María Pineda", 1000.00, "Visa MasterCard",
				4000.00, 0);
		cuentaCorriente.MostrarDatos();

		// Cuenta de Ahorros
		CuentaAhorros cuentaAhorros = new CuentaAhorros(9876543, "Paco Soria y José Soria", 6422.50, "Si");
		System.out.println();
		cuentaAhorros.MostrarDatos();

	}
}