/**Enunciado:
 * Elije cualquier ejercicio realizado tanto en clase como obligatorios y
 * adáptalo con métodos y un array.Siguendo este modelo.
 */
package obligatorios;

import java.util.Scanner;
public class NotaObjeto {

	public static void main(String[] args) {
		NotaObjeto notamedia = new NotaObjeto(); // creamos el objeto notamedia
		
		Scanner scanner = new Scanner(System.in); 
		String[] asignaturas = {"Programacion", "Base de Datos", "Sistemas"}; //asignaturas array
		int[] notas = new int[asignaturas.length]; //array de las notas
		
		for (int i = 0; i < asignaturas.length; i++) { 
			System.out.print("Introduce las notas de " + asignaturas[i] + ": ");
			notas[i] = scanner.nextInt();
		}
		int media = notamedia.notasuma(notas); 
		
		// se crea una variable que es igul al return del metodo notasuma, 
		// se utiliza como argumento notas, que es una matriz, recuerda 
		// que en el metodo hemos creado un argumento noto que es un array
		System.out.println("La media es: " + media); 
		scanner.close();
	}
	
	public int notasuma(int[] noto) { //no es static ya que hay que instanciarlo 
		int suma = 0; 
		for (int n : noto) { 
			suma += n; 
			} 
		return suma / noto.length;
	}
}
