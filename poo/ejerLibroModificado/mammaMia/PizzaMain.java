package mammaMia;

public class PizzaMain {

	public static void main(String[] args) {
		Pedido_1 p1 = new Pedido_1("familiar", "cuatro quesos", "en preparación.");
		Pedido_2 p2 = new Pedido_2("mediana", "margarita", "servida.");

		p1.MostrarDatos();
		p2.MostrarDatos();
	}

}
