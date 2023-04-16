package ejercicio_8;

public class Programador extends Empleado {
	// Atributo único de la clase programador
	private int experiencia;
	private String lenguaje;

	// Método constructor
	public Programador(String nombre, String apellidos, String rango, double salario, int experiencia,
			String lenguaje) {
		super(nombre, apellidos, rango, salario);
		this.experiencia = experiencia;
		this.lenguaje = lenguaje;
	}

	// Método getter y setter
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	// Sobrescritura del método toString
	@Override
	public String toString() {
		return super.toString() + "\nTiene una experiencia de " + experiencia
				+ " años en el sector. Que le han permitido dominar los siguientes lenguajes de programación: "
				+ lenguaje;
	}

	// Sobrescritura de salario
	// El salario se calculará dependiendo de la experiencia del programador,
	// es decir, el número de años que lleve en la empresa. Para ello
	// necesitamos obtener el aumento de sueldo correspondiente a lo dicho
	// anteriormente que se calculario multiplicando el salario base por 0."años de
	// experiencia".
	@Override
	public double CalcularSalario() {
		return super.CalcularSalario() + (super.CalcularSalario() * (this.experiencia * 0.1));
	}

}
