package animales_variacion;

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
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Familia: " + getFamilia());
		System.out.println("¿Es vertebrado o invertebrado?: " + getVertebrado_invertebrado());
		System.out.println("Número de aletas: " + getNum_aletas());
		
	}

}
