package metodoCrud;

import java.util.ArrayList;

public class Modificar {
	public static void main(String[] args) {
		String buscar ="Word";
		
		ArrayList<String> asigna = new ArrayList<String>();
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");
		asigna.add("Word");
		System.out.println(asigna);
		
		
		int position=asigna.indexOf(buscar);
		System.out.println("La posición de Word es " + position);
		asigna.set(position, "Marcas"); //Machaca la palabra Word
		System.out.println(asigna);
	}


}
