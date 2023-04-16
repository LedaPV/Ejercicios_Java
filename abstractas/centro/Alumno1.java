package centro;

public class Alumno1 extends Persona1 {

	// Declaramos los atributos que pertenecen a la clase hija Alumno1
	private double evaluacion;
	private double nota;

	// Método constructor
	public Alumno1(String nombre, String apellido, int dni, String asignatura, double evaluacion, double nota) {
		super(nombre, apellido, dni, asignatura);
		this.evaluacion = evaluacion;
		this.nota = nota;
	}

	// Método getter y setter
	public double getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(double evaluacion) {
		this.evaluacion = evaluacion;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El alumno " + getNombre() + " con apellido " + getApellido() + " y con DNI " + getDni());
		System.out.println("Está matriculado en la asignatura " + getAsignatura() + " cuya evaluación ha sido de "
				+ getEvaluacion() + " a la que le corresponde la nota de " + getNota());
	}

	@Override
	public void Calendario() {
		super.Calendario();
		System.out.println("Estamos en 2023.");
	}

}
