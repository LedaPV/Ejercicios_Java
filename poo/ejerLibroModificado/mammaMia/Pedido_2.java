package mammaMia;

public class Pedido_2 extends Pizza {

	public Pedido_2(String tamaño, String tipo, String estado) {
		super(tamaño, tipo, estado);
	}

	@Override
	public void MostrarDatos() {
		System.out.println(
				"El pedido 2 es una pizza " + getTamaño() + ", de tipo " + getTipo() + " y que está " + getEstado());
	}
}
