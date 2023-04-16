package animales;

class Peces extends Animal{
	
	//Declaramos los atributos de la clase hija Peces
	private int num_aletas;
	
	//Método constructor
	public Peces(String nombre, int num_aletas) {
		super(nombre);
		this.num_aletas= num_aletas;
	}
	
	//Método getter y setter del atributo "num_aletas"
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
		System.out.println("Número de aletas: " + getNum_aletas());
	}

}
