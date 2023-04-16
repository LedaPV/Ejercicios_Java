package banco;

public class CuentaAhorros2 extends Cuenta_bancaria {

	public CuentaAhorros2(int numCuenta, String titular) {
		super(numCuenta, titular);
	}

	public CuentaAhorros2(int numCuenta, String titular, double saldo) {
		super(numCuenta, titular, saldo);
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Cuenta de ahorros 2, titular: " + this.getTitular() + ", saldo: " + this.ConsultarSaldo());

	}
}
