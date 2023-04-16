package abstractainterface_Empleados;

class Jefe_Administracion implements Empleado {
	private String nombre;
	private String apellidos;
	private String rango;
	private double salario;
	private String horario;
	private double bonificacion;
	private int viajes;
	private double dietas;

	// Método constructor
	public Jefe_Administracion(String nombre, String apellidos, String rango, double salario, String horario,
			double bonificacion, int viajes, double dietas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rango = rango;
		this.salario = salario;
		this.horario = horario;
		this.bonificacion = bonificacion;
		this.viajes = viajes;
		this.dietas = dietas;
	}

	
	// Sobrescritura del método MostrarDatos
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Puesto en la empresa: " + rango);
		System.out.println("Salario base: " + salario + " euros");
		System.out.println("Turno de trabajo: " + horario + " horas");
		System.out.println("Bonificación por alcanzar objetivos mensuales: " + bonificacion + " euros");
		System.out.println("Viajes al mes: " + viajes);
		System.out.println("Dietas: " + dietas + " euros");
	}

	// Sobrescritura del método CalcularSalario.
	@Override
	public double CalcularSalario() {
		return this.salario + this.bonificacion + (this.viajes * this.dietas);
	}

}
