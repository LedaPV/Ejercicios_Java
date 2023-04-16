package ejercicio_9;

public class Cuenta_bancariaMain {
	public static void main(String[] args) {
		Cuenta_bancaria cuenta1 = new CuentaAhorros1(1, "Pedro");
		Cuenta_bancaria cuenta2 = new CuentaAhorros2(2, "María", 500);

		// Realizamos operaciones con los métodos descritos
		System.out.println("--Estado inicial de las cuentas------------------------------");
		System.out.println(cuenta1);
		System.out.println(cuenta2);

		// --Operaciones con las cuentas--------------------------------//
		cuenta1.Depositar(200);
		cuenta2.Retirar(100);

		System.out.println("--Estado final de las cuentas--------------------------------");
		System.out.println(cuenta1);
		System.out.println(cuenta2);
	}

}