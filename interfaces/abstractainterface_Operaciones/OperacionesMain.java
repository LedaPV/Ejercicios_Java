package abstractainterface_Operaciones;

public class OperacionesMain {

	public static void main(String[] args) {

		Calculadora calculator = new Calculadora();
		System.out.println();
		System.out.println("-------------------------------CALCULADORA (5,3)");
		System.out.println("La suma es: " + calculator.sumar(5, 3));
		System.out.println("La resta es: " + calculator.restar(5, 3));
		System.out.println("La multiplicación es: " + calculator.multiplicar(5, 3));
		System.out.println("La división es: " + calculator.dividir(5, 3));
		System.out.println("La potencia es: " + calculator.potencia(5, 3));
		System.out.println("La raíz del primer número es: " + calculator.raizA(5));
		System.out.println("La raíz del segundo número es: " + calculator.raizB(3));

	}

}
