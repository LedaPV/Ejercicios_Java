/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array12 {
	public static void main(String[] args) {
			String[] array1 = {"Alberto", "Eva", "Laura"};
			String[] array2 = new String[array1.length + 1];
			for (int i = 0; i < array1.length; i++) {
			if (i == 0) {
			array2[i] = "Juan";
			}
			array2[i + 1] = array1[i];
			}
			System.out.println(Arrays.toString(array2)); // Imprime "[Juan, Alberto, Eva, Laura]"

	}

}
