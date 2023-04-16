package ejercicio_9;

public class CuentaAhorros1 extends Cuenta_bancaria {

	public CuentaAhorros1(int numCuenta, String titular) {
		super(numCuenta, titular);
	}

	public CuentaAhorros1(int numCuenta, String titular, double saldo) {
		super(numCuenta, titular, saldo);
	}

	public String toString() {
		return "Cuenta de ahorros 1, titular: " + this.getTitular() + ", saldo: " + this.ConsultarSaldo();
	}
}
