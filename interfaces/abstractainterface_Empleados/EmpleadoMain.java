package abstractainterface_Empleados;

public class EmpleadoMain {
	public static void main(String[] args) {

		Jefe_Administracion admin = new Jefe_Administracion("Eustaquio", "Rodríguez Alcoi", "Jefe de administración",
				3500.0, "8.30-15.30", 330.45, 4, 60.0);
		Jefe_Contabilidad con = new Jefe_Contabilidad("Domingo", "Salas Olmo", "Jefe de contabilidad", "Grado A.D.E", 5,
				3, 60.00, 2300.00, "8.30-16.00");
		Administrativo[] ad = {
				new Administrativo("Matías", "García Moreno", "Administrativo", "F.P", 0, 7, 40.00, 1500.0,
						"8.30-16.00"),
				new Administrativo("Mateo", "Baquero Fuentes", "Administrativo", "F.P", 0, 7, 40.00, 1500.0,
						"8.30-16.00")

		};

		// Mostramos los datos tratados
		System.out.println();
		System.out.println("\t\tEMPLEADOS");
		System.out.println();
		System.out.println("///////////////////Empleado 1");
		admin.MostrarDatos();
		System.out.println("---");
		System.out.println("Su salario final es de: " + admin.CalcularSalario() + " euros");
		System.out.println();

		System.out.println("///////////////////Empleado 2");
		con.MostrarDatos();
		System.out.println("---");
		System.out.println("Su salario final es de: " + con.CalcularSalario() + " euros");
		System.out.println();

		System.out.println("//////////////////Empleados 3 y 4");
		for (Administrativo ad1 : ad) {
			System.out.println();
			ad1.MostrarDatos();
			System.out.println("---");
			System.out.println("Su salario final es de: " + ad1.CalcularSalario() + " euros");
			ad1.CalcularSalario();
		}

	}
}