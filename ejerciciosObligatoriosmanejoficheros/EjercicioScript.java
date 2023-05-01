package ejerciciosObligatorios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**

 * 
 * @author Leda
 *
 */
public class EjercicioScript {

	public static void main(String[] args) {
		try {
			FileWriter script= new FileWriter("c:\\DIGITECH\\xx.EJERCICIOS\\Prueba\\Script.sh");
			BufferedWriter bw= new BufferedWriter(script);
			bw.write("git checkout -b leda");
			bw.write("git add creategit.sh");
			bw.write("git commit -m 'subido fichero'");
			bw.write("git push origin leda");
			System.out.println("Script creado");
			bw.close();
			
		}catch (IOException e){
			e.printStackTrace();
			
		}

	}

}
