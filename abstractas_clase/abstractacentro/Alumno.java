package abstractacentro;

public class Alumno extends Persona {

	private int nota;

	public Alumno(String nombre, String apellido, int dni, String asignatura, int nota) {
		super(nombre, apellido, dni, asignatura);
		this.nota = nota;
	}

	// Método getter y setter de nota.
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El alumno se llama " + getNombre() + " con apellido " + getApellido() + " y con DNI "
				+ getDni() + " y da la asignatura " + getAsignatura() + " con nota final " + getNota());
	}

	@Override
	public void Calendario() {
		super.Calendario();
		System.out.println("Estamos en 2023.");
	}

}
