package linkedHashMap;

import java.util.HashMap;

public class HashMapEjemplo1 {
    public static void main(String[] args) {
        HashMap<String, String> emails = new HashMap<>();

        // agregar correos electrónicos al HashMap
        emails.put("Alberto Ruiz", "albertoruizprofesor@gmail.com");
        emails.put("Alberto digitechfp", "aruiz@digitechfp.com");
        emails.put("Alberto Cobarde pecador", "superalbertron@gmail.com");

        // obtener un correo electrónico por su clave
        String email = emails.get("Alberto Ruiz");
        System.out.println("El correo electrónico de Alberto Ruiz es " + email);

        // recorrer todos los elementos del HashMap
        for (String key : emails.keySet()) {
            String value = emails.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}