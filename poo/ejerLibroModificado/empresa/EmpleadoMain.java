package empresa;

public class EmpleadoMain {
	public static void main(String[] args) {
		// Creamos los objetos de cada clase
		Arquitecto_software arq = new Arquitecto_software("Leda", "Pérez Vargas", "tipo A", 3500.0, 1022.50);
		Programador pro = new Programador("Carmen", "Cánovas Sagasta", "Programador senior", 2000.0, 4,
				"Java y Phyton");
		Manager man = new Manager("Paco", "Guitierrez Salinas", "Mánager junior", 1500.00, 2, 0.20);

		// Mostramos los datos tratados
		System.out.println("-------------------Empleado 1: Arquitecto de Sofware.");
		System.out.println("Nombre: " + arq.getNombre());
		System.out.println("Apellido: " + arq.getApellidos());
		System.out.println("Cargo: " + arq.getRango());
		System.out.println("Salario: " + arq.CalcularSalario());

		System.out.println();
		System.out.println("-------------------Empleado 2: Programador.");
		System.out.println("Nombre: " + pro.getNombre());
		System.out.println("Apellido: " + pro.getApellidos());
		System.out.println("Cargo: " + pro.getRango());
		System.out.println("Salario: " + pro.CalcularSalario());
		System.out.println("Domonio de lenguajes: " + pro.getLenguaje());

		System.out.println();
		System.out.println("-------------------Empleado 3: Mánager.");
		System.out.println("Nombre: " + man.getNombre());
		System.out.println("Apellido: " + man.getApellidos());
		System.out.println("Cargo: " + man.getRango());
		System.out.println("Salario: " + man.CalcularSalario());

	}

}
