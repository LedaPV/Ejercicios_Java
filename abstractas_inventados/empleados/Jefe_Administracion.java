package empleados;

class Jefe_Administracion extends Empleado {
	private double bonificacion;
	private int viajes;
	private double dietas;

	// Método constructor
	public Jefe_Administracion(String nombre, String apellidos, String rango, double salario, String horario, double bonificacion,
			int viajes, double dietas) {
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

	// Sobrescritura del método MostrarDatos
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println("Puesto en la empresa: " + getRango());
		System.out.println("Salario base: " + getSalario() + " euros");
		System.out.println("Turno de trabajo: " + getHorario() + " horas");
		System.out.println("Bonificación por alcanzar objetivos mensuales: " + getBonificacion() + " euros");
		System.out.println("Viajes al mes: " + getViajes());
		System.out.println("Dietas: " + getDietas() + " euros");
	}

	// Sobrescritura del método CalcularSalario.
	@Override
	public double CalcularSalario() {
		return super.CalcularSalario() + this.bonificacion + (this.viajes * this.dietas);
	}

}
