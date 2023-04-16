package salario;

public class SalarioSobrecarga {

	// Argumentos.
	private String nombre;
	private double salario;
	private double incremento;

	/////////////////////////////////////////////// MÉTODO CONSTRUCTOR

	public SalarioSobrecarga(String nombre, double salario, double incremento) {
		this.nombre = nombre;
		this.salario = salario;
		this.incremento = incremento;
	}

	/////////////////////////////////////////////// SOBRECARGA DE CONSTRUCTOR

	public SalarioSobrecarga(String nombre, double salario) {
		this.incremento = incremento;
		this.nombre = nombre;
		this.salario = salario;
	}
	/////////////////////////////////////////////// MÉTODO GET Y SET

	// Método get y set de nombre.
	public String getNombre() { // Te devuelve
		return nombre;
	}

	public void setNombre(String nombre) { // Para introducir valores
		this.nombre = nombre;
	}

	// Método get y set de salario.
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Método get y set de incremento.
	public double getIncremento() {
		return incremento;
	}

	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}

}
