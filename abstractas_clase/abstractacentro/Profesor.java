package abstractacentro;

public class Profesor extends Persona {

	private double salario;

	public Profesor(String nombre, String apellido, int dni, String asignatura, double salario) {
		super(nombre, apellido, dni, asignatura);
		// TODO Esbozo de constructor generado automáticamente
	}

	// Método getter y setter de salario
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	@Override
	public void MostrarDatos() {
		System.out.println("El profesor se llama " + getNombre() + " con apellido " + getApellido() + " y con DNI "
				+ getDni() + " e imparte la asignatura " + getAsignatura());
	}
	
	public void MostraSalario() {
		System.out.println("y tiene un salario de " + getSalario());
	}

	@Override
	public void Calendario() {
		super.Calendario();
		System.out.println("Estamos en 2023.");
	}

}
