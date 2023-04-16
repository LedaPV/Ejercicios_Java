package empleados;

class Administrativo extends Jefe_Contabilidad {

	// Método constructor
	public Administrativo(String nombre, String apellidos, String rango, double salario, String horario, int experiencia,
			String titulo, int horas_extras, double imp_hext) {
		super(nombre, apellidos, rango, salario, horario, experiencia, titulo, horas_extras, imp_hext);

	}

	// Sobreescritura de MostrarDatos()
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println("Puesto en la empresa: " + getRango());
		System.out.println("Salario base: " + getSalario() + " euros");
		System.out.println("Turno de trabajo: " + getHorario() + " horas");
		System.out.println("Años de experiencia en el sector: " + getExperiencia());
		System.out.println("Título/ Acreditación: " + getTitulo());
		System.out.println("Horas extras en el mes: " + getHoras_extras());
		System.out.println("Importe de las horas extras: " + getImp_hext() + " euros");
	}

	// Sobrescritura de CalcularSalario()
	// El salario se calculará de aquel importe pactado en el contrato, además de
	// las
	// horas extras que deqique el empleado a su puesto de trabajo

	@Override
	public double CalcularSalario() {
		return super.CalcularSalario() + (this.horas_extras * this.imp_hext);
	}

}
