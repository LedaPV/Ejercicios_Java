package ejercicio_2;

public class Profesor1 extends Persona1 {

	// Declaramos los atributos de la clase hija Profesor1
	private double salario;
	private String mes;
	private String asignatura;

	// Método constructor
	public Profesor1(String nombre, String apellido, int dni, double salario, String mes, String asignatura) {
		super(nombre, apellido, dni);
		this.salario = salario;
		this.mes = mes;
		this.asignatura = asignatura; 

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
	

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return super.toString() + " con salario " + salario + ", en el mes" + mes + "\nE imparte la asignatura " + asignatura;
		
	}
	@Override
	public void Calendario() {
		super.Calendario();
		System.out.println("Estamos en 2023.");
	}

}
