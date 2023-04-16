/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array11 {
	public static void main(String[] args) {
		int[][] array1 = {{2, 5, 23, 15, 4}, {36, 1, 87, 0, 12}};
		int[][] array2 = array1.clone();
		array1[1][1] = 44;
		System.out.println(Arrays.deepToString(array1)); // Imprime "[[2, 5, 23, 15, 4], [36, 44, 87,0, 12]]"
		System.out.println(Arrays.deepToString(array2)); // Imprime "[[2, 5, 23, 15, 4], [36, 44, 87,0, 12]]"
	}

}
