package ejerciciosObligatorios;
import java.io.File;
public class EjercicioObligatorio3 {

	public static void main(String[] args) {
			// Se crean dos variables para contener la ruta y la carpeta y que el código sea
			// más efectivo.
			String ruta = "c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\";
			String nombrecarpeta = "clientes";
			// Se crea un objeto
			File fichero = new File(ruta + nombrecarpeta);
			if (fichero.exists() == true) {
				fichero.delete();
				System.out.println("El fichero se ha borrado correctamente.");
			} else {
				System.out.println("El fichero "+ nombrecarpeta + "no existe.");
			}

		}

	}
