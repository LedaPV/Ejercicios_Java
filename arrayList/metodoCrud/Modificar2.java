package metodoCrud;

import java.util.ArrayList;

public class Modificar2 {
	public static void main(String[] args) {
		String buscar ="matemáticas";
		
		ArrayList<String> asigna = new ArrayList<String>();
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");
		asigna.add("Word");
		System.out.println(asigna);
		
		
		int position=asigna.indexOf(buscar);
		
		//busca un dato
		
		if(asigna.contains(buscar)==true) {
			asigna.set(position, "Marcas");
			
		}else {
			System.out.println( "La asignatura " + buscar + " NO ESTÁ EN LA LISTA"
					); if (asigna.isEmpty()==true)
					{
						System.out.println("No hay datos");
					}else {
						System.out.println("Hay otras asignaturas");
					}
		}
		System.out.println(asigna);
	}
}
