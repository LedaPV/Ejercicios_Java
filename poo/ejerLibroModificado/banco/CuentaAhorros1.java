package banco;

public class CuentaAhorros1 extends Cuenta_bancaria {

	public CuentaAhorros1(int numCuenta, String titular) {
		super(numCuenta, titular);
	}

	public CuentaAhorros1(int numCuenta, String titular, double saldo) {
		super(numCuenta, titular, saldo);
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Cuenta de ahorros 1, titular: " + this.getTitular() + ", saldo: " + this.ConsultarSaldo());
	}
}
