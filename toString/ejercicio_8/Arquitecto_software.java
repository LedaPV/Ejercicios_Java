package ejercicio_8;

public class Arquitecto_software extends Empleado {
	private double bonificacion;

	// Método constructor
	public Arquitecto_software(String nombre, String apellidos, String rango, double salario, double bonificacion) {
		super(nombre, apellidos, rango, salario);
		this.bonificacion = bonificacion;
	}

	// Método getter y setter de bonificación
	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	// Sobreescritura del método toString
	@Override
	public String toString() {
		return super.toString() + "\nPosee una bonificación de " + bonificacion + " euros.";
	}

	// Sobrescritura del método CalcularSalario.
	@Override
	public double CalcularSalario() {
		return super.CalcularSalario() + this.bonificacion;
	}

}
