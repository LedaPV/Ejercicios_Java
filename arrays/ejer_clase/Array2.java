/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array2 {
	public static void main(String[] args) {
		String[] names = {"Eva", "Laura", "Alberto"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names)); // Imprime "[Alberto, Eva, Laura]"
	}

}
