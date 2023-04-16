package banco;

abstract class Cuenta_bancaria {
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
	public void MostrarDatos() {
	}

	public double ConsultarSaldo() {
		return saldo;
	}

}
