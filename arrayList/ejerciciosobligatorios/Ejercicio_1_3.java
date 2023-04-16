package ejerciciosobligatorios;

import java.util.ArrayList;

public class Ejercicio_1_3 {
	public static void main(String[] args) {

		ArrayList<String> asigna = new ArrayList<String>();
		asigna.add("Entorno");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas Informáticos");
		asigna.add("Lenguaje de marcas");
		asigna.add("Formación y orientación laboral");
		asigna.add("Qué agobio de tantas asignaturas!!!");

		// Muestra todos los datos
		for (String a : asigna) {
			System.out.println("-" + a);

		}
	}
}