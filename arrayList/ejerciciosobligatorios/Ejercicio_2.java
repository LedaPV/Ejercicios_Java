package ejerciciosobligatorios;
/**
 * Siguiendo el modelo anterior crea un Arraylist con nombres de alumnos:
 * Alberto, Juan, Pablo, en donde añadamos un alumno que se llama Pedro y lo
 * eliminemos y otro que se llama Ana y le cambiemos el nombre por Laura.
 */
import java.util.ArrayList;

public class Ejercicio_2 {
	public static void main (String[] args) {
		ArrayList<String> alumnos= new ArrayList<String>();
		
		// ArrayList de alumnos.
		System.out.println("");
		System.out.println("---------------Lista de alumnos.");
		alumnos.add("Alberto");
		alumnos.add("Juan");
		alumnos.add("Pablo");
		System.out.println("Nº de alumnos: " + alumnos.size());
		System.out.println(alumnos);
		alumnos.add("Pedro");
		alumnos.add("Ana");
		System.out.println("Nº de alumnos: " + alumnos.size());
		System.out.println(alumnos);
		
		// Eliminamos a Pedro
		System.out.println("");
		System.out.println("---------------Eliminamos al pobre Pedro.");
		alumnos.removeIf(listalumnos -> listalumnos.equals("Pedro"));
		System.out.println(alumnos);
		
		// Cambiamos Ana por Laura
		System.out.println("");
		System.out.println("---------------Cambiamos el nombre de Ana por el de Laura.");
		String buscar ="Ana";
		int position=alumnos.indexOf(buscar);
		alumnos.set(position, "Laura"); //Machaca la palabra Ana
		System.out.println(alumnos);
	}

}

