/**
 * 
 */
package ejer_clase;

import java.util.Arrays;
public class Array1 {
	public static void main(String[] args) {
		int index=0;
		String[] datos = {"Alberto", "Ana", "Eva"};
		index = Arrays.asList(datos).indexOf("Ana");
		if (index>=0) {
		System.out.println("encontrado el indices es " +index);
		} else {
		System.out.println("no encontrado ");
		}

	}

}
