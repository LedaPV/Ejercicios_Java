/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array10 {
	public static void main(String[] args) {
		String[] array1 = {"Alberto", "Eva", "Laura"};
		String[] array2 = array1.clone();
		System.out.println(Arrays.toString(array2)); // Imprime "[Alberto, Eva, Laura]"
	}

}
