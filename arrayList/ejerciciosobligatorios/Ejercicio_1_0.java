package ejerciciosobligatorios;

import java.util.ArrayList;
public class Ejercicio_1_0 {
	public static void main (String[] args) {
		ArrayList<String> asigna= new ArrayList<String>();
		
		System.out.println("Nº de elementos: " + asigna.size());
		
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Bases de datos");
		System.out.println("Nº de elementos: " + asigna.size());
		asigna.add("Sistemas");
		asigna.add("Lenguaje de marcas");
		asigna.add("Formación y orientación laboral");
		System.out.println("Nº de elementos: " + asigna.size());
		System.out.println("El elemento que hay en la posición 0: " + asigna.get(0));
		System.out.println("El elemento que hay en la posición 3: " + asigna.get(1));
		System.out.println("El elemento que hay en la posición 3: " + asigna.get(3));
		System.out.println("El elemento que hay en la posición 3: " + asigna.get(5));
		
	}

}
