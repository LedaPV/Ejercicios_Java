/**
 * 
 */
package ejer_clase;

import java.util.Collections;
import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		String[] names = { "Eva", "Laura", "Alberto" };
		Arrays.sort(names);
		Collections.reverse(Arrays.asList(names));
		System.out.println(Arrays.toString(names)); // Imprime "[Eva, Laura, Alberto]"
	}
}