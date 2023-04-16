package mammaMia;

public class Pedido_1 extends Pizza {

	public Pedido_1(String tamaño, String tipo, String estado) {
		super(tamaño, tipo, estado);
	}

	@Override
	public void MostrarDatos() {
		System.out.println(
				"El pedido 1 es una pizza " + getTamaño() + ", de tipo " + getTipo() + " y que está " + getEstado());
	}

}
