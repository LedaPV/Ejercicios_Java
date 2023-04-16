package ejercicio_8;

public class EmpleadoMain {
	public static void main(String[] args) {
		// Creamos los objetos de cada clase
		Arquitecto_software arq = new Arquitecto_software("Leda", "Pérez Vargas", "tipo A", 3500.0, 1022.50);
		Programador pro = new Programador("Carmen", "Cánovas Sagasta", "Programador senior", 2000.0, 4,
				"Java y Phyton");
		Manager man = new Manager("Paco", "Guitierrez Salinas", "Mánager junior", 1500.00, 2, 0.20);

		// Mostramos los datos tratados a través del método toString
		System.out.println(arq);

		System.out.println(pro);

		System.out.println(man);

	}

}
