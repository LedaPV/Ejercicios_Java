package claseFile;

import java.io.File;
import java.util.Scanner;


/**
 * Ejercicio de clase.
 * 
 * @author Leda
 *
 */

public class Generar3carpetas {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcion;
        String ruta="C:\\prueba\\";

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("A - Crear carpeta");
            System.out.println("B - Borrar carpeta");
            System.out.println("C - Salir");

            opcion = scanner.nextLine();

            switch (opcion) {

                case "A":

                    System.out.println("Introduzca el nombre de la carpeta:");
                    String nombreCarpeta = scanner.nextLine();
                    File carpeta = new File(ruta+nombreCarpeta);
                    if (!carpeta.exists()) {

                    	carpeta.mkdirs(); // crea la carpeta si no existe
                        System.out.println("La carpeta " + nombreCarpeta + " se ha creado correctamente.");

                    } else {

                        System.out.println("La carpeta " + nombreCarpeta + " ya existe.");
                    }
                    break;

                case "B":

                    System.out.println("Introduzca el nombre de la carpeta que desea borrar:");
                    String nombreCarpetaBorrar = scanner.nextLine();
                    File carpetaBorrar = new File(ruta+nombreCarpetaBorrar);
                    if (carpetaBorrar.exists()) {
                        carpetaBorrar.delete();
                        System.out.println("La carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente.");
                        
                    } else {
                        System.out.println("La carpeta " + nombreCarpetaBorrar + " no existe.");
                    }
                    break;

                case "C":

                    System.out.println("Saliendo...");
                    break;
                    
                default:
                
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (!opcion.equals("C"));
        scanner.close();

    }

}

