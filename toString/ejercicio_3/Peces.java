package ejercicio_3;

class Peces extends Animal{
	
	//Declaramos los atributos de la clase hija Peces
	private String vertebrado_invertebrado;
	private int num_aletas;
	
	//Método constructor
	public Peces(String nombre, String familia, String vertebrado_invertebrado, int num_aletas) {
		super(nombre, familia);
		this.vertebrado_invertebrado = vertebrado_invertebrado;
		this.num_aletas = num_aletas;
	}

	// Método getter y setter 
	public String getVertebrado_invertebrado() {
		return vertebrado_invertebrado;
	}

	public void setVertebrado_invertebrado(String vertebrado_invertebrado) {
		this.vertebrado_invertebrado = vertebrado_invertebrado;
	}

	public int getNum_aletas() {
		return num_aletas;
	}

	public void setNum_aletas(int num_aletas) {
		this.num_aletas = num_aletas;
	}

	//Método MostrarDatos()
	@Override
	public String toString() {
	return super.toString() + "¿Es vertebrado/invertebrado?" + vertebrado_invertebrado + " , numero de aletas: " + num_aletas;
		
	}

}
