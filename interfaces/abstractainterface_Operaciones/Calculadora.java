package abstractainterface_Operaciones;

public class Calculadora implements Operaciones {
	@Override
	public double sumar(double a, double b) {
		return a + b;
	}

	@Override
	public double restar(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplicar(double a, double b) {
		return a * b;
	}

	@Override
	public double dividir(double a, double b) {
		return a / b;
	}

	@Override
	public double potencia(double a, double b) {
		return Math.pow(a, b);
	}

	@Override
	public double raizA(double a) {
		return Math.sqrt(a);
	}

	@Override
	public double raizB(double b) {
		return Math.sqrt(b);
	}
}
