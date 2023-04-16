package animales;

public class Main {

	public static void main(String[] args) {
		Mamifero lobo = new Mamifero ("Lobo", "Gris");
		Ave aguila = new Ave ("Águila", "Negro y Blanco");
		Peces globo = new Peces ("Globo", 3);
		
		System.out.println("---Datos del lobo: ");
		lobo.MostrarDatos();
		System.out.println();
		
		System.out.println("---Datos del águila: ");
		aguila.MostrarDatos();
		System.out.println();
		
		System.out.println("---Datos del pez: ");
		globo.MostrarDatos();
		System.out.println();

	}

}
