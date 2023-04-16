package objetopersona;

public class PersonaMainArray {
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// crear una array de objetos

		Persona[] people = new Persona[5];
		String[] nombres = { "Alberto", "Ana", "Eva", "Laura", "Pablo" };

		int[] edades = { 25, 35, 23, 28, 21 };
		// creación de los objetos
		for (int i = 0; i < edades.length; i++) {
			people[i] = new Persona();

		}

		// introducir en los atributos set de Edad y Nombre, los valores de los arrays
		for (int i = 0; i < edades.length; i++) {
			people[i].setEdad(edades[i]);
			people[i].setNombre(nombres[i]);

		}

		// muestra por pantalla los datos del array
		for (int i = 0; i < edades.length; i++) {
			System.out.println("la edad es " + people[i].getEdad() + " de la persona " + people[i].getNombre());

		}

	}

}
