package linkedHashMap;

import java.util.HashMap;

public class HashMapEjemplo3 {
	public static void main(String[] args) {

		HashMap<String, String> emails = new HashMap<>();

		// Agregar correos electrónicos alHashMap
		emails.put("Juan Perez", "juan.perez@example.com");
		emails.put("Maria Rodriguez", "maria.rodriguez@example.com");
		emails.put("Pedro Gomez", "pedro.gomez@example.com");

		// Obtener un correo electrónico por su clave
		String email = emails.get("Maria Rodriguez");
		System.out.println("El correo electrónico de Maria Rodriguez es " + email);

		// Recorrer todos los elementos de HashMap
		for (String key : emails.keySet()) {

			String value = emails.get(key);
			System.out.println(key + " -> " + value);
		}
	}
}
