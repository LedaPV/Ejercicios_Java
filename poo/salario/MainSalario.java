package salario;

public class MainSalario {
	public static void main(String[] args) {

		// Creamos un objeto de un array
		Salario sal = new Salario("Alberto", 1200, 300);

		// Invocamos a los métodos y los relacionamos con el nuevo
		// objeto sal.
		String nombre = sal.getNombre();
		double salario = sal.getSalario();
		double incremento = sal.getIncremento();
		double suma = salario + incremento;

		System.out.println("El empleado es " + nombre);
		System.out.println("El salario es " + salario);
		System.out.println("El incremento es " + incremento);
		System.out.println("El total a ingresar es " + suma);
	}

}
