package linkedHashMap;

import java.util.HashMap;

public class HashMapEjemplo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> emails = new HashMap<>();

        // agregar correos electrónicos al HashMap
        emails.put(1, "albertoruizprofesor@gmail.com");
        emails.put(2, "aruiz@digitechfp.com");
        emails.put(3, "superalbertron@gmail.com");

        // obtener un correo electrónico por su clave
        String email = emails.get(2);
        System.out.println("El correo electrónico de Alberto Ruiz es " + email);

        // recorrer todos los elementos del HashMap
        for (int key : emails.keySet()) {
            String value = emails.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}
