package ejercicio_2;

public class Trabajador1 extends Persona1 {

	// Declaramos los atributos de la clase hija Trabajador1, cuya clase padre es
	// Profesor1
	private String cargo;
	private double salario;
	private String mes;

	// Método constructor
	public Trabajador1(String nombre, String apellido, int dni, String cargo, double salario,
			String mes) {
		super(nombre, apellido, dni);
		this.cargo = cargo;
		this.salario = salario;
		this.mes= mes;
	}
	
	// Método getter y setter
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return super.toString() + " con cargo " + cargo + " y salario " + salario + " en el mes " + mes;
	}

	@Override
	public void Calendario() {
		super.Calendario();
	}

}
