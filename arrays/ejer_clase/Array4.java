/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array4 {
	public static void main(String[] args) {
		String[] names = {"Eva", "Laura", "Alberto"};
		Arrays.sort(names);
		String[] sortedNames = Arrays.copyOf(names, names.length);
		System.out.println(Arrays.toString(sortedNames)); // Imprime "[Alberto, Eva, Laura]"
	}
}
