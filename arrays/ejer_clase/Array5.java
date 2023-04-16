/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array5 {
	public static void main(String[] args) {
		String[] names = {"Eva", "Laura", "Alberto"};
		Arrays.sort(names);
		//Arrays.reverse(names);----> no funciona.
		String[] sortedNames = Arrays.copyOf(names, names.length);
		System.out.println(Arrays.toString(sortedNames)); // Imprime "[Laura, Eva, Alberto]"
	}
}

