package ejercicio_10;

class Administrativo extends Jefe_Contabilidad{

	// Método constructor
	public Administrativo(String nombre, String apellidos, String rango, double salario, String horario, int experiencia,
			String titulo, int horas_extras, double imp_hext) {
		super(nombre, apellidos, rango, salario, horario, experiencia, titulo, horas_extras, imp_hext);

	}

	// Sobreescritura de toString()
	@Override
	public String toString() {
		return super.toString() + "\n El empleado que ocupa este cargo tiene una experiencia de " + getExperiencia()
				+ " años en el sector. Además de poseer el título que le acredita " + getTitulo() + " para el puesto."
				+ "\nLas horas extras totales que ha tenido que realizar en el mes, son " + getHoras_extras()
				+ " horas. A cada una de esas horas le corresponde un importe de " + getImp_hext() + " euros.";

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
