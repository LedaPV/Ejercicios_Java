package encapsulamientoinventado;

class Coches {
	//Declaramos los atributos
	private String marca;
	private String modelo;
	private int caballos;
		
	//Método getter y setter de los anteriores atributos.
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
}
