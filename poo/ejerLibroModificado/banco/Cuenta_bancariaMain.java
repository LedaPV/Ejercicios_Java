package banco;

public class Cuenta_bancariaMain {
	public static void main(String[] args) {
		Cuenta_bancaria cuenta1 = new CuentaAhorros1(1, "Pedro");
		Cuenta_bancaria cuenta2 = new CuentaAhorros2(2, "María", 500);

		// Realizamos operaciones con los métodos descritos
		System.out.println("--Estado inicial de las cuentas------------------------------");
		mostrarDatos(cuenta1);
		mostrarDatos(cuenta2);

		System.out.println("--Operaciones con las cuentas--------------------------------");
		cuenta1.Depositar(200);
		cuenta2.Retirar(100);

		System.out.println("--Estado final de las cuentas--------------------------------");

		mostrarDatos(cuenta1);
		mostrarDatos(cuenta2);
	}

	// Método para mostrar los datos de una cuenta
	public static void mostrarDatos(Cuenta_bancaria cuenta) {
		System.out.println("Cuenta " + cuenta.getNumCuenta() + ", titular: " + cuenta.getTitular() + ", saldo: "
				+ cuenta.ConsultarSaldo());
	}
}