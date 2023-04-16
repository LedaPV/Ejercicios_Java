package abstractacentro;

public class InstitutoMain {
	public static void main (String[] args) {
		Profesor profe= new Profesor ("Alberto", "Ruiz", 12345, "Programación", 1800.95);
		Alumno alu= new Alumno("Leda","Pérez", 54321, "Bases de datos",7);
		System.out.println("profesor---------------------");
		profe.MostrarDatos();
		profe.MostraSalario();
		profe.Calendario();
		
		System.out.println("alumo------------------------");
		alu.MostrarDatos();
		alu.Calendario();
		
	}

}
