/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array13 {
	public static void main(String[] args) {
		String[] array1 = {"Juan", "Alberto", "Eva", "Laura"};
		String[] array2 = new String[array1.length - 1];
		for (int i = 0, j = 0; i < array1.length; i++) {
		if (!array1[i].equals("Juan")) {
		array2[j] = array1[i];
		j++;
		}
		}
		System.out.println(Arrays.toString(array2)); // Imprime "[Alberto, Eva, Laura]"
	}
}
