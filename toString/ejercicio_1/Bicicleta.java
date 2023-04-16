package ejercicio_1;

public class Bicicleta extends Vehiculo {
	private String tipo;


	public Bicicleta(String modelo, String color, String tipo) {
		super(modelo, color);
		this.tipo=tipo;
		// TODO Esbozo de constructor generado automáticamente
	}
	
	//En las hijas no es necesario porque estamos instanciando objetos o si de esta clase creara otra clase.
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " la bicicleta es de tipo: " + tipo;
	}
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Vuelva pronto!!");
	}

}
