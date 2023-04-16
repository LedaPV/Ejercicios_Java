package banco;

public class Cuenta_bancariaMain {
	public static void main(String[] args) {

		// Cuenta corriente
		CuentaCorriente cuentaCorriente = new CuentaCorriente(12346789, "María Pineda", 1000.00, "Visa MasterCard",
				4000.00, 0);
		cuentaCorriente.MostrarDatos();

			// Ingresar dinero
			cuentaCorriente.Ingresar(80.50);
			System.out.println("Se ha ingresado 80.50 euros en la cuenta corriente.");
	
			// Retirar dinero
			cuentaCorriente.Retirar(50);
			System.out.println("Se ha retirado 50 euros de la cuenta corriente.");
	
			// Mostrar saldo actual
			System.out.println("El saldo actual es: " + cuentaCorriente.ConsultarSaldo() + " euros.");

		// Cuenta de Ahorros
		CuentaAhorros cuentaAhorros = new CuentaAhorros(987654321, "Paco Soria y José Soria.", 6422.50, "Si");
		System.out.println();
		cuentaAhorros.MostrarDatos();

			// Calcular intereses
			double intereses = cuentaAhorros.calcularIntereses(0.04);
			System.out.println("Los intereses generados son: " + intereses + " euros.");
	
			// Mostrar saldo actual
			System.out.println("El saldo actual es: " + (cuentaAhorros.ConsultarSaldo() + intereses) + " euros.");

	}
}