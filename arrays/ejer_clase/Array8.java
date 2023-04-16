/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array8 {
	public static void main(String[] args) {
		String[] array1 = {"Alberto", "Eva", "Laura"};
		String[] array2 = {"Laura", "Eva", "Alberto"};
		Arrays.sort(array1);
		Arrays.sort(array2);
		boolean areEqual = Arrays.equals(array1, array2);
		System.out.println(areEqual); // Imprime "true"

	}

}
