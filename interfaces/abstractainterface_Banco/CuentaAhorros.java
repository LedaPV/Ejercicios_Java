package abstractainterface_Banco;

class CuentaAhorros implements Cuenta_bancaria {

	// Declaramos los atributos de la Cuenta de Ahorros
	private int numCuenta;
	private String titular;
	private double saldo;
	private String cuenta_conjunta;

	// Método constructor
	public CuentaAhorros(int numCuenta, String titular, double saldo, String cuenta_conjunta) {
		super();
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.cuenta_conjunta = cuenta_conjunta;
	}

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

	public String getCuenta_conjunta() {
		return cuenta_conjunta;
	}

	public void setCuenta_conjunta(String cuenta_conjunta) {
		this.cuenta_conjunta = cuenta_conjunta;
	}

	// Métodos sobrescritos
	@Override
	public void MostrarDatos() {
		System.out.println("CUENTA DE AHORROS");
		System.out.println("-----------------------------------");
		System.out.println("Titular o tilulares: " + titular);
		System.out.println("Número de cuenta: " + numCuenta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Cuenta conjunta: " + cuenta_conjunta);
	}

}