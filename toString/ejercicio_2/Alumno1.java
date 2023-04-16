package ejercicio_2;

public class Alumno1 extends Persona1 {

	// Declaramos los atributos que pertenecen a la clase hija Alumno1
	private double evaluacion;
	private double nota;
	private String asignatura;

	// Método constructor
	public Alumno1(String nombre, String apellido, int dni, double evaluacion, double nota, String asignatura) {
		super(nombre, apellido, dni);
		this.evaluacion = evaluacion;
		this.nota = nota;
		this.asignatura= asignatura;
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

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	@Override
	public String toString() {
		return super.toString() + " con una evaluación de " + evaluacion + ", cuya nota es" + nota + ", en la asignatura de " + asignatura;
		
	}

	@Override
	public void Calendario() {
		super.Calendario();
		System.out.println("Estamos en 2023.");
	}

}
