package encapsulamientoinventado;

public class MainCochesArray {

	public static void main(String[] args) {

		// A continuación, creamos arrays de los objetos.
		Coches[] coches = new Coches[4];
		String[] marca = { "Fiat", "Renault", "Opel", "Jeep" };
		String[] modelo = { "Panda", "Twingo", "Astra", "Renegade" };
		int[] caballos = { 120, 100, 140, 160 };

		// Creación de los objetos
		for (int i = 0; i < marca.length; i++) {
			coches[i] = new Coches();
		}
		// Introducimos los valores de los arrays
		for (int i = 0; i < modelo.length; i++) {
			coches[i].setMarca(marca[i]);
			coches[i].setModelo(modelo[i]);
			coches[i].setCaballos(caballos[i]);
		}
		// Mostrar por pantalla los datos
		for (int i = 0; i < marca.length; i++) {
			System.out.println("La marca es " + coches[i].getMarca() + " y su modelo es el nuevo "
					+ coches[i].getModelo() + ", que cuenta con " + coches[i].getCaballos() + " caballos.");
		}

	}

}
