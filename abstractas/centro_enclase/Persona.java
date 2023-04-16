package centro_enclase;

//nombre y asignatura
//mostrar datos abstracta
//calendario , no abstracta : el calendario del curso es 2022/2023
public abstract class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private String asignatura;

	// Método constructor
	public Persona(String nombre, String apellido, int dni, String asignatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.asignatura = asignatura;
	}

	// Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	abstract public void MostrarDatos();

	public void Calendario() {
		System.out.println("El calendario del curso es 2022/2023.");
	}

}
