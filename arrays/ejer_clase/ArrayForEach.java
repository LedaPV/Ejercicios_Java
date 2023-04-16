/**Recorrido de Arrays con For al estilo ForEach.
 */
package ejer_clase;
import java.util.Scanner;
public class ArrayForEach {

	public static void main(String[] args) {
		double[] nota=new double[8]; // Se declara el array de una dimensión y se reserva un espacio de 8 valores decimales.
		int fin= nota.length; // Declaramos una variable que puede recorrer todas las notas hasta la final.
		Scanner sc= new Scanner(System.in);// Importamos el método y la clase escaner para que nos lea las notas.
		
		System.out.println("Para calcular la nota media necesito saber la nota de cada uno de tu exámenes.");
		for (int i = 0; i<fin; i++){ //Aplicamos un for ascendente para que se introduzcan las notas del examen, que es la i.
			System.out.print ("Nota del examen nº " + (i+1) + ":");
			nota[i] = sc.nextDouble(); //De esta manera, la computadora lee cada una de las notas.
		}
		System.out.println("Tus notas son: ");
		
		double suma = 0; //Inicializamos una nueva variable que acoja la suma de todas.
		for(double n : nota){
			System.out.print(n + " / ");
			suma += n;
		}
		
		System.out.println("\nLa media es " + suma / 8);
		
		for (int i = fin-2; i< fin; i++){ //Ciclo for que nos indique las dos notas finales.
			System.out.println("Las últimas notas del examen son: " + nota[i]);
		}

	}

}
