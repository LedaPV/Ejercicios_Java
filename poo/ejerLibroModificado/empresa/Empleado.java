/**
 * Ejercicio inventado. Enunciado:
 * Crea un programa sobre la jerarquía que existe en una empresa tecnológica, para ello 
 * utiliza el concepto de herencia, métodos  y elabora un ejercicio sobre programación 
 * orientada a objetos parecido a los que estamos desarrollando.
 */
package empresa;

public abstract class Empleado {
	// Declaramos las variables que van a heredar el resto.
	private String nombre;
	private String apellidos;
	private String rango;
	private double salario;

	// Método constructor
	public Empleado(String nombre, String apellidos, String rango, double salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rango = rango;
		this.salario = salario;
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
	
	public double CalcularSalario() {
		return this.salario;
	}

}
