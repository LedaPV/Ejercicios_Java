package abstractainterface_Empleados;

class Administrativo implements Empleado {
	private String nombre;
	private String apellidos;
	private String rango;
	private String titulo;
	private int experiencia;
	protected int horas_extras;
	protected double imp_hext;
	private double salario;
	private String horario;

	// Método constructor
	public Administrativo(String nombre, String apellidos, String rango, String titulo, int experiencia,
			int horas_extras, double imp_hext, double salario, String horario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rango = rango;
		this.titulo = titulo;
		this.experiencia = experiencia;
		this.horas_extras = horas_extras;
		this.imp_hext = imp_hext;
		this.salario = salario;
		this.horario = horario;
	}

	// Sobreescritura de MostrarDatos()
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Puesto en la empresa: " + rango);
		System.out.println("Salario base: " + salario + " euros");
		System.out.println("Turno de trabajo: " + horario + " horas");
		System.out.println("Años de experiencia en el sector: " + experiencia);
		System.out.println("Título/ Acreditación: " + titulo);
		System.out.println("Horas extras en el mes: " + horas_extras);
		System.out.println("Importe de las horas extras: " + imp_hext + " euros");
	}

	// Sobrescritura de CalcularSalario()
	// El salario se calculará de aquel importe pactado en el contrato, además de
	// las
	// horas extras que deqique el empleado a su puesto de trabajo

	@Override
	public double CalcularSalario() {
		return this.salario + (this.horas_extras * this.imp_hext);
	}

}
