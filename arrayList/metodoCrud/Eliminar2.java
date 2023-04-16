package metodoCrud;
import java.util.ArrayList;
import java.util.Arrays;
public class Eliminar2 {
	public static void main (String[] args) {
		//Creamos el arraylist y con arrays.aslist añadimos los valores)
		
		ArrayList<String> asigna =new ArrayList<String>(
				Arrays.asList("Entorno", "Programación", "Bases de datos", "Sistemas", "Matemáticas"));
		System.out.println("Nº de elementos: " +asigna.size());
		System.out.println(asigna);
		//Usando Arrays.asList evitamos usar add por ejemplo, y creamos
		// un array con los valores que hemos insertado.
		ArrayList<String> elementosAeliminar= new ArrayList<String>(
				Arrays.asList("Matemáticas", "Sistemas", "Entorno"));
		asigna.removeAll(elementosAeliminar);
		
		System.out.println("Nº de elementos en la lista original después del borrado: " + asigna.size());
		System.out.println(asigna);
				
	}
	

}
