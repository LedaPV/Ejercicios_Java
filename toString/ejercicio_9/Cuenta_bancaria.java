package ejercicio_9;

public abstract class Cuenta_bancaria {
	// Declaramos los atributos de la clase padre
	private int numCuenta;
	private String titular;
	private double saldo;

	// Método constructor
	public Cuenta_bancaria(int numCuenta, String titular, double saldo) {
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Sobrecarga de método constructor
	public Cuenta_bancaria(int numCuenta, String titular) {
		this.numCuenta = numCuenta;
		this.titular = titular;

	}

	// Método getter y setter
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Definición de los métodos a utilizar

	public void Depositar(double importe) {
		double saldo_actual = this.getSaldo();
		saldo_actual += importe;
		this.setSaldo(saldo_actual);
	}

	public void Retirar(double importe) {
		double saldo_actual = this.getSaldo();
		saldo_actual -= importe;
		this.setSaldo(saldo_actual);
	}

	public double ConsultarSaldo() {
		return saldo;
	}

}
