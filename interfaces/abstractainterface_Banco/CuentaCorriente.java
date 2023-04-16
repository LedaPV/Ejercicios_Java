package abstractainterface_Banco;

class CuentaCorriente implements Cuenta_bancaria {

	// Declaramos los atributos especificos de la clase hija Cuenta Corriente
	private int numCuenta;
	private String titular;
	private double saldo;
	private String tarjeta;
	private double limiteCreditoTarjeta;
	private double saldoPendientePago;

	// Método constructor
	public CuentaCorriente(int numCuenta, String titular, double saldo, String tarjeta, double limiteCreditoTarjeta,
			double saldoPendientePago) {
		super();
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.tarjeta = tarjeta;
		this.limiteCreditoTarjeta = limiteCreditoTarjeta;
		this.saldoPendientePago = saldoPendientePago;
	}

	// Método para mostrar los datos de la cuenta corriente
	@Override
	public void MostrarDatos() {
		System.out.println("CUENTA CORRIENTE");
		System.out.println("-----------------------------------");
		System.out.println("Titular: " + titular);
		System.out.println("Número de cuenta: " + numCuenta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Tarjeta: " + tarjeta);
		System.out.println("Límite de crédito: " + limiteCreditoTarjeta);
		System.out.println("Saldo pendiente de pago: " + saldoPendientePago);
	}

}
