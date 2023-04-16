package ejerciciosobligatorios;

import java.util.ArrayList;

public class Ejercicio_1_2 {
	public static void main(String[] args) {
		String buscar ="HTML";
		
		ArrayList<String> asigna = new ArrayList<String>();
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");
		asigna.add("Formación y orientación laboral");
		asigna.add("Lenguajes de marcas");
		asigna.add("HTML");
		System.out.println(asigna);
		
		
		int position=asigna.indexOf(buscar);
		System.out.println("La posición de HTML es " + position);
		asigna.set(position, "XML"); //Machaca la palabra Word
		System.out.println(asigna);
	}


}
