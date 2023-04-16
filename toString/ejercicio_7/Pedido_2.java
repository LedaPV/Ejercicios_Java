package ejercicio_7;

public class Pedido_2 extends Pizza {

	public Pedido_2(String tamaño, String tipo, String estado) {
		super(tamaño, tipo, estado);
	}

	@Override
	public String toString() {
		return "El pedido 2 es una pizza " + super.toString();
	}
}
