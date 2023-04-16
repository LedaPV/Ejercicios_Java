package ejercicio_10;

class Jefe_Administracion extends Empleado {
	private double bonificacion;
	private int viajes;
	private double dietas;

	// Método constructor
	public Jefe_Administracion(String nombre, String apellidos, String rango, double salario, String horario,
			double bonificacion, int viajes, double dietas) {
		super(nombre, apellidos, rango, salario, horario);
		this.bonificacion = bonificacion;
		this.viajes = viajes;
		this.dietas = dietas;
	}

	// Método getter y setter de los atributos de la clase hija CEO
	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	public int getViajes() {
		return viajes;
	}

	public void setViajes(int viajes) {
		this.viajes = viajes;
	}

	public double getDietas() {
		return dietas;
	}

	public void setDietas(double dietas) {
		this.dietas = dietas;
	}

	// Sobrescritura del método toString
	@Override
	public String toString() {
		return super.toString()+ "\nA este cargo, le corresponde una bonificación por alcanzar los objetivos mensuales de "
				+ bonificacion + " euros."
				+ "\nAdemás por cada viaje que realice recibe una serie de dietas. En este mes ha realizado "
				+ viajes + " viajes; y por cada uno de ellos le corresponde un importe de " + dietas;

	}

	// Sobrescritura del método CalcularSalario.
	@Override
	public double CalcularSalario() {
		return super.CalcularSalario() + this.bonificacion + (this.viajes * this.dietas);
	}

}
