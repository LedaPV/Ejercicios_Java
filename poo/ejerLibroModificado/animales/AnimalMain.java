package animales;

public class AnimalMain {

	public static void main(String[] args) {
		Delfin delfinito = new Delfin("Flipper", 2, "macho", "mamíferos", "acuático.");
		Loro lorito = new Loro("Paquita", 5, "hembra", "aves", "volar", "verde.");
		Serpiente mamba = new Serpiente("Atlas", 3, "macho", "reptiles", "venenosas.");
		System.out.println("-------------");
		delfinito.MostrarDatos();
		lorito.MostrarDatos();
		mamba.MostrarDatos();
		System.out.println("-------------");

	}

}
