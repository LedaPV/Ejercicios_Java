package banco;

class CuentaCorriente extends Cuenta_bancaria {

	// Declaramos los atributos especificos de la clase hija Cuenta Corriente
	private String tarjeta;
	private double limiteCreditoTarjeta;
	private double saldoPendientePago;

	// Método constructor
	public CuentaCorriente(int numCuenta, String titular, double saldo, String tarjeta, double limiteCreditoTarjeta,
			double saldoPendientePago) {
		super(numCuenta, titular, saldo);
		this.tarjeta = tarjeta;
		this.limiteCreditoTarjeta = limiteCreditoTarjeta;
		this.saldoPendientePago = saldoPendientePago;

	}

	// Método getter y setter
	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public double getLimiteCreditoTarjeta() {
		return limiteCreditoTarjeta;
	}

	public void setLimiteCreditoTarjeta(double limiteCreditoTarjeta) {
		this.limiteCreditoTarjeta = limiteCreditoTarjeta;
	}

	public double getSaldoPendientePago() {
		return saldoPendientePago;
	}

	public void setSaldoPendientePago(double saldoPendientePago) {
		this.saldoPendientePago = saldoPendientePago;
	}

	// Métodos adicionales
	public void Ingresar(double importe) {
		double saldo_actual = this.getSaldo();
		saldo_actual += importe;
		this.setSaldo(saldo_actual);
	}

	public void Retirar(double importe) {
		double saldo_actual = this.getSaldo();
		saldo_actual -= importe;
		this.setSaldo(saldo_actual);
	}

	// Método para mostrar los datos de la cuenta corriente
	@Override
	public void MostrarDatos() {
		System.out.println("CUENTA CORRIENTE");
		System.out.println("-----------------------------------");
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número de cuenta: " + this.getNumCuenta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Tarjeta: " + this.getTarjeta());
		System.out.println("Límite de crédito: " + this.getLimiteCreditoTarjeta());
		System.out.println("Saldo pendiente de pago: " + this.getSaldoPendientePago());
	}
}
