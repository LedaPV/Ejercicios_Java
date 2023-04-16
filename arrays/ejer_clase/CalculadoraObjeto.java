/**
 * 
 */
package ejer_clase;

public class CalculadoraObjeto {
	public  int sumar(int a, int b) {return a+b;}
	public  int multiplicar(int a, int b) {return a * b;}
	public  int restar(int a, int b) {return a - b;}
	public  int dividir(int a, int b) {return a / b;}
	public  double raiz_cuadrada(double a) {return Math.sqrt(a);}
	public  double raiz_cuadradab(double b) {return Math.sqrt(b);}
	public double potencia(double a, double b){return Math.pow(a,b);}
	
	// public int raiz (double a){ //
	//	double c=Math.sqrt(a); //
	// return (int) c;	//
	
	public static void main(String[] args) {
	//llamamos a la clase y creamos el objeto.
	CalculadoraObjeto calculator = new CalculadoraObjeto();
	int a = 10, b = 5;
	System.out.println("Suma: " + calculator.sumar(a, b));
	System.out.println("Resta: " + calculator.restar(a, b));
	System.out.println("Produto: " + calculator.multiplicar(a, b));
	System.out.println("Division: " + calculator.dividir(a, b));
	System.out.println("Raíz a: " + calculator.raiz_cuadrada(a));
	System.out.println("Raíz b: " + calculator.raiz_cuadradab(b));
	System.out.println("Potencia: " + calculator.potencia(a,b));
	}
	
	}
