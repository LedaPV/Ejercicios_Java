/**
 * Ejercicio inventado. Enunciado:
 * Crea un programa sobre la jerarquía que existe en una empresa, para ello 
 * utiliza el concepto de herencia, métodos  y elabora un ejercicio sobre programación 
 * abstracta parecido a los que estamos desarrollando.
 */
package empleados;

abstract class Empleado {
	// Declaramos las variables de la clase padre empleado
	private String nombre;
	private String apellidos;
	private String rango;
	private double salario;
	private String horario;

	// Método constructor
	public Empleado(String nombre, String apellidos, String rango, double salario, String horario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rango = rango;
		this.salario = salario;
		this.horario= horario;
	}

	// Métodos getter y setter de los atributos.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	//Métodos abstractos de función
	public void MostrarDatos() {
	};
	public double CalcularSalario() {
		return this.salario;
	}
}
