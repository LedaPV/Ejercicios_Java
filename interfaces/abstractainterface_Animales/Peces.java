package abstractainterface_Animales;

class Peces implements Animal{
	
	//Declaramos los atributos de la clase hija Peces
	private String nombre;
	private String familia;
	private String vertebrado_invertebrado;
	private int num_aletas;
	
	//Método constructor
	public Peces(String nombre, String familia, String vertebrado_invertebrado, int num_aletas) {
		super();
		this.nombre = nombre;
		this.familia = familia;
		this.vertebrado_invertebrado = vertebrado_invertebrado;
		this.num_aletas = num_aletas;
	}

	//Método MostrarDatos()
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Familia: " + familia);
		System.out.println("¿Es vertebrado o invertebrado?: " + vertebrado_invertebrado);
		System.out.println("Número de aletas: " + num_aletas);
		
	}

}
