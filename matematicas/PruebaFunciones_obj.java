package matematicas;

import java.util.Scanner;
//Para que no salga error tengo que importar la clase, 
//si no, la fila 13 y 14 me dan error a la hora de importar métodos y crear un objeto de ellos.
import matematicas.geometría.Geometria_obj;
import matematicas.varias.Varias_obj;

public class PruebaFunciones_obj {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Geometria_obj geometria= new Geometria_obj();
		Varias_obj varias= new Varias_obj();
		
		//Prueba es Primo()
		System.out.print("Introduzca un número entero positivo: ");
		int n = sc.nextInt();
		if (varias.esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + "no es primo." );
		}
		
		//Prueba dígitos()
		System.out.print("Introduzca un número entero positivo: ");
		n = sc.nextInt();
		System.out.println(n + " tiene " + varias.digitos(n) + "dígitos.");
		
		//Prueba volumenCilindro()
		double r, h;
		System.out.println("Cálculo del volumen del cilindro");
		System.out.print("Introduzca el radio en metros: ");
		r =sc.nextInt();
		System.out.print("Introduzca la altura en metros: ");
		h =sc.nextInt();
		System.out.println("El volumen del cilindro es " + geometria.volumenCilindro(r, h) + "m3.");
		sc.close();
		
		//Prueba áreaTriángulo()
		double b, a;
		System.out.println("Cálculo del área de un triángulo");
		System.out.print("Introduzca la base del triángulo en cm: ");
		b =sc.nextInt();
		System.out.print("Introduzca la altura del mismo: ");
		a =sc.nextInt();
		System.out.println("El área del triángulo es " + geometria.areaTriangulo(b, a) + "cm.");
	}
}
