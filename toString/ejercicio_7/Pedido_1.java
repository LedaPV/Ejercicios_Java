package ejercicio_7;

public class Pedido_1 extends Pizza {

	public Pedido_1(String tamaño, String tipo, String estado) {
		super(tamaño, tipo, estado);
	}

	@Override
	public String toString() {
		return  "El pedido 1 es una pizza " + super.toString();
	}

}
