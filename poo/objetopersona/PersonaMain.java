package objetopersona;

import java.util.Objects;

import objetopersona.Persona;

public class PersonaMain {
	
	public static void main(String[] args) {
		Persona person = new Persona();

		person.setEdad(25);
		person.setNombre("Alberto");

		String MostrarNombre = person.getNombre();
		int MostrarEdad = person.getEdad();

		System.out.println("Su nombres es " + MostrarNombre + " su edad es " + MostrarEdad);

	}

}
