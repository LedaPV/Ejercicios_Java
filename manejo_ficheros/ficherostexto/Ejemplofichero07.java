package ficherostexto;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de uso de la clase File, con la mezcla de dos ficheros. Enunciado:
 * Crea un programa en Java que reciba tres argumentos desde la línea de
 * comandos: los nombres de dos ficheros origen y el nombre de un fichero
 * destino. El programa debe leer los dos ficheros origen y mezclar sus
 * contenidos en el fichero destino, de tal forma que en el fichero resultante
 * aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la
 * primera línea será del primer fichero, la segunda será del segundo fichero,
 * la tercera será la siguiente del primer fichero, etc. Además, el programa
 * debe mostrar por pantalla un mensaje indicando que el archivo destino ha sido
 * creado satisfactoriamente o, en caso de producirse algún error de
 * lectura/escritura, un mensaje de error con la descripción del problema.
 * Recuerda que trabajaremos en la carpeta prueba. El fichero1, debe tener el
 * texto “Hola” y el fichero2 el texto “mundo”.
 * 
 * @author Leda
 *
 */

public class Ejemplofichero07 {

	public static void main(String[] args) {
		// Primero creamos dos ficheros de texto en nuestra carpeta de
		// Ejercicios/Prueba,
		// donde cada uno de ellos contenga las palabras "Hola" y "mundo"
		// respectivamente
		// en los archivos fichero1 y fichero2.
		// Comenzamos utilizando un try/catch para que el programa lea esa información y
		// cree un nuevo archivo donde las mezcle, "mezcla.txt".

		try {
			// Para leer la informacion de los ficheros utilizaremos BufferedReader.
			BufferedReader lec_fi1 = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\fichero1.txt"));
			BufferedReader lec_fi2 = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\fichero2.txt"));

			// A continuación vamos a crear el archivo que contenga los datos totales de
			// ambos.
			BufferedWriter mix = new BufferedWriter(new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\mezcla.txt"));

			// Definimos dos variables como una cadena vacía de caracteres para utilizarlas
			// en las lecturas de los archivos. De alguna manera las inicializamos.
			// Estas dos varibles nos servirán para almacenar temporalmente la información
			// de lectura de cada linea procedente de los ficheros 1 y 2.
			String linea1 = "";
			String linea2 = "";

			// Ahora utilizamos un bucle while para verificar si linea1 o linea2 no son
			// nulas, lo que significa que todavía hay líneas en los archivos que no han
			// sido leídas y
			// por tanto el programa debe seguir leyendo esa información.
			// Funciona de la siguiente manera: si la linea1 no es nula, debe escribirse en
			// mezcla.txt con un salto de línea que permita que se haga el mismo proceso con
			// la linea2.
			while ((linea1 != null) || (linea2 != null)) {
				linea1 = lec_fi1.readLine();// Lectura del fichero1.
				linea2 = lec_fi2.readLine();// Lectura del fichero2.
				if (linea1 != null) { // Que se escriba en mezcla si no es nula.
					mix.write(linea1 + "\n");
				}
				if (linea2 != null) { // Que se escriba en mezcla si no es nula.
					mix.write(linea2 + "\n");
				}
			}
			// Cerramos los objetos.
			lec_fi1.close();
			lec_fi2.close();
			mix.close();

			// Mensajes de respuesta.
			System.out.println("El archivo mezcla.txt se ha creado correctamente");
		} catch (IOException e) {
			System.out.println("Error de lectura o escritura:" + e.getMessage());
		}
	}
}
