/**Enunciado:
 * Crea un ejercicio que me pida el usuario y el password, controla con un método 
 * que el password, sea de un mínimo de 8 caracteres, y otro para el password que 
 * no sea igual al usuario.
 */
package obligatorios;

import java.util.Scanner;

public class Usuarioypassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese su nombre de usuario: ");
		String usuario = sc.nextLine();

		System.out.print("Ingrese su contraseña: ");
		String password = sc.nextLine();

		if (validarLongitud(password) && validarCoincidencia(usuario, password)) {
			System.out.println("La contraseña es válida.");
		} else {
			System.out.println("La contraseña no es válida.");
		}
		sc.close();
	}

	public static boolean validarLongitud(String password) {
		return password.length() >= 8;
	}

	public static boolean validarCoincidencia(String usuario, String password) {
		return !usuario.equals(password);
	}
}
