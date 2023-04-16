package centro;

public class Profesor1 extends Persona1 {

	// Declaramos los atributos de la clase hija Profesor1
	private double salario;
	private String mes;

	// Método constructor
	public Profesor1(String nombre, String apellido, int dni, String asignatura, double salario, String mes) {
		super(nombre, apellido, dni, asignatura);
		this.salario = salario;
		this.mes = mes;

	}

	// Método getter y setter
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
	public void MostrarDatos() {
		System.out.println("El profesor " + getNombre() + " con apellido " + getApellido() + " y con DNI " + getDni());
		System.out.println("Imparte la asignatura " + getAsignatura());
		System.out.println("Dicho profesor tiene un salario de " + getSalario() + " euros, en el mes de " + getMes());
	}

	@Override
	public void Calendario() {
		super.Calendario();
		System.out.println("Estamos en 2023.");
	}

}
