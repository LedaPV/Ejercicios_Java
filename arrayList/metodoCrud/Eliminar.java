package metodoCrud;

import  java.util.ArrayList;

public class Eliminar {
	public static void main(String[] args) {
		ArrayList<String> asigna = new ArrayList<String>();
		
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");
		asigna.add("matemáticas");
		System.out.println("Nº de elementos: " + asigna.size());
		System.out.println(asigna);
		
		//Definimos una función lambda con un nombre que lo que hace es recorrer el arraylist
		//equalsIgnoreCase te reconoce mayúsculas y minúsculas
		asigna.removeIf(asignatura -> asignatura.equals("matemáticas"));
		
		//Muestra todos los datos
		System.out.println("Nº de elementos: " + asigna.size());
		System.out.println(asigna);
	}

}
