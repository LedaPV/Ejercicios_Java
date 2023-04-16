package ficherostexto;

import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

/**
 * En esta actividad se te solicita crear un programa Java llamado
 * "EjemploFichero01" que utilice la clase "BufferedReader" para leer un archivo
 * de texto llamado "malaga.txt". Este archivo se encuentra en la ruta
 * "c:\\DIGITECH\\xx.EJERCICIOS\\Prueba" y contiene varias líneas de texto.
 * 
 * @author Leda
 */
public class Ejemplofichero01 {

	public static void main(String[] args) {

		try {
			// Creamos un objeto de BufferedReader y le damos la ruta donde está el archivo
			// de texto//
			BufferedReader br = new BufferedReader(
					new FileReader("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\malaga.txt.txt"));
			// Creamos una variable linea, con la que jugaremos para que muestre la
			// información y la lea//
			String linea = ""; // En el momento que no haya ninguna línea se para.
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
			// Qué hacer si no se encuentra el fichero//
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero malaga.txt");
			// Qué hacer si hay un error en la lectura del fichero//
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero malaga.txt" + e.getMessage());
		}
	}
}
