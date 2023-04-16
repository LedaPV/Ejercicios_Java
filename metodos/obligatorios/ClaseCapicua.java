/**Ejercicio 2: 
 * Número capicuo.
 */
package obligatorios;

public class ClaseCapicua {

	public static void main(String[] args) {
		int a = 55;
		System.out.println(esCapicua(a));
	}

	// Se crea el método que en el paso anterior invocamos.
	public static boolean esCapicua(int x) {
		boolean capicua = false;
		if (x % 10 == x / 10) {
			capicua = true;
		} else {
			capicua = false;
		}
		return capicua;
	}
}
