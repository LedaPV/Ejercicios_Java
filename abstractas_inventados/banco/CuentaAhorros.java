package banco;

class CuentaAhorros extends Cuenta_bancaria {
	
	//Declaramos los atributos de la Cuenta de Ahorros
	private String cuenta_conjunta;
	
	//Método constructor
	public CuentaAhorros(int numCuenta, String titular, double saldo, String cuenta_conjunta) {
		super(numCuenta, titular, saldo);
		this.cuenta_conjunta=cuenta_conjunta;
	}
	
	//Método getter y setter
	public String getCuenta_conjunta() {
		return cuenta_conjunta;
	}
	
	public void setCuenta_conjunta(String cuenta_conjunta) {
		this.cuenta_conjunta = cuenta_conjunta;
	}
	
	//Métodos adicionales
	public double calcularIntereses(double tasaInteres) {
        double saldo = getSaldo();
        double intereses = saldo * tasaInteres;
        return intereses;
    }
	
	//Métodos sobrescritos
	@Override
    public void MostrarDatos() {
        System.out.println("CUENTA DE AHORROS");
        System.out.println("-----------------------------------");
		System.out.println("Titular o tilulares: " + this.getTitular());
		System.out.println("Número de cuenta: " + this.getNumCuenta());
		System.out.println("Saldo: " + this.getSaldo());
    }

}