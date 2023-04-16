package ejercicio_10;

class Jefe_Contabilidad extends Empleado {

	// Atributos de la clase Jefe Contabilidad
	// Los atributos horas_ extras e imp_hext,
	// deben ser protected en vez de private si
	// más adelante pretendo utilizar esta clase
	// como padre de otra.
	private int experiencia;
	private String titulo;
	protected int horas_extras;
	protected double imp_hext;

	// Método constructor
	public Jefe_Contabilidad(String nombre, String apellidos, String rango, double salario, String horario,
			int experiencia, String titulo, int horas_extras, double imp_hext) {
		super(nombre, apellidos, rango, salario, horario);
		this.experiencia = experiencia;
		this.titulo = titulo;
		this.horas_extras = horas_extras;
		this.imp_hext = imp_hext;
	}

	// Método getter y setter de los atributos de Jefe de Contabilidad
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras_extras() {
		return horas_extras;
	}

	public void setHoras_extras(int horas_extras) {
		this.horas_extras = horas_extras;
	}

	public double getImp_hext() {
		return imp_hext;
	}

	public void setImp_hext(double imp_hext) {
		this.imp_hext = imp_hext;
	}

	// Sobreescritura de toString()
	@Override
	public String toString() {
		return super.toString() + "\n El empleado que ocupa este cargo tiene una experiencia de " + experiencia
				+ " años en el sector. Además de poseer el título que le acredita " + titulo + " para el puesto."
				+ "\nLas horas extras totales que ha tenido que realizar en el mes, son " + horas_extras
				+ " horas. A cada una de esas horas le corresponde un importe de " + imp_hext + " euros.";

	}

	// Sobrescritura de CalcularSalario()
	// El salario se calculará dependiendo de la experiencia del empleado y
	// las horas extras que dedique a su trabajo. Para ello necesitamos obtener
	// el aumento de sueldo correspondiente a lo dicho anteriormente que se
	// calcularia
	// multiplicando el salario base por 0."años de experiencia" + (horas extras* su
	// importe).
	@Override
	public double CalcularSalario() {
		return super.CalcularSalario()
				+ (super.CalcularSalario() * (this.experiencia * 0.1) + (this.horas_extras * this.imp_hext));
	}

}
