package vehiculo_enclase;

public class Bicicleta extends Vehiculo {
	private String tipo;

	public Bicicleta(String modelo, String color, String tipo) {
		super(modelo, color, tipo);
		this.tipo=tipo;
		// TODO Esbozo de constructor generado automáticamente
	}
	
	//En las hijas no es necesario porque estamos instanciadno objetos o si de esta clse creara otra clase.
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void MostrarDatos() {
		System.out.println(
				"El modelo es " + getModelo() + "; el color es " + getColor() + "; el tipo de bici es " + getTipo());
	}
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Vuelva pronto!!");
	}

}
