package empresa;

public class Manager extends Empleado {
	// Atributos exclusivos del Manager.
	private int num_client_new;
	private double comision;

	// Método constructor
	public Manager(String nombre, String apellidos, String rango, double salario, int num_client_new, double comision) {
		super(nombre, apellidos, rango, salario);
		this.num_client_new = num_client_new;
		this.comision = comision;
	}

	// Métodos getter y setter
	public int getNum_client_new() {
		return num_client_new;
	}

	public void setNum_client_new(int num_client_new) {
		this.num_client_new = num_client_new;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	// Sobrescritura de salario.
	// El salario del mánager se calculará en función a su capacidad de captación de
	// nuevos clientes, la cual le proporciona una pequeña comisión por cada uno de ellos.
	@Override
	public double CalcularSalario() {
		return super.CalcularSalario() + (this.num_client_new * this.comision);
	}

}
