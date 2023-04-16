/**
 * Ejercicio de encapsulamiento en Java: método getter y setter y método
 * constructor con argumentos.
 */
package salario;

public class Salario {
	
	//Argumentos.
	private String nombre;
	private double salario;
	private double incremento;
	
	/////////////////////////////////////////////// MÉTODO CONSTRUCTOR
	
	//El método constructor inicializa las variables: IMP.
	//Definimos el método constructor con los argumentos anteriores.
	//Debemos acordarnos que siempre deben tener el mismo nombre (el método y la clase).
	
	public Salario(String nombre, double salario, double incremento) {
		this.nombre= nombre;
		this.salario= salario;
		this.incremento = incremento;
	}
	
	/////////////////////////////////////////////// MÉTODO GET Y SET
	
	//Método get y set de nombre.
	public String getNombre() { //Te devuelve
		return nombre;
	}
	public void setNombre(String nombre) { //Para introducir valores
		this.nombre=nombre;
	}
	
	//Método get y set de salario.
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario=salario;
	}
	
	//Método get y set de incremento.
	public double getIncremento() {
		return incremento;
	}
	public void setIncremento(double incremento) {
		this.incremento=incremento;
	}
	
	/**
	 * Cuando en Java no se crea un método constructor va implícito.
	 * También existen superconstructores.
	 * Se pueden tener dos métodos constructores con el mismo nombre, 
	 * pero siempre deben tener diferentes argumentos.
	 * En Eclipse, en código fuente se realiza de forma automática el
	 * método constructor,
	 */
}
