package centro;

public class Trabajador1 extends Profesor1 {

	// Declaramos los atributos de la clase hija Trabajador1, cuya clase padre es
	// Profesor1
	private String cargo;

	// Método constructor
	public Trabajador1(String nombre, String apellido, int dni, String asignatura, String cargo, double salario,
			String mes) {
		super(nombre, apellido, dni, null, salario, mes);
		this.cargo = cargo;
	}

	// Método getter y setter
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// Métodos void
	@Override
	public void MostrarDatos() {
		System.out
				.println("El trabajador " + getNombre() + " con apellido " + getApellido() + " y con DNI " + getDni());
		System.out.println("Ocupa el cargo de " + getCargo() + ", con un salario de " + getSalario()
				+ " euros en el mes de " + getMes());
	}

	@Override
	public void Calendario() {
		super.Calendario();
	}

}
