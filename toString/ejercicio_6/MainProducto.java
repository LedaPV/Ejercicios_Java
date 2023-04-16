package ejercicio_6;

public class MainProducto {
	public static void main(String[] args) {
	Librointerface libro1= new Librointerface("El señor de los anillos", "Aventura","Tolkien", 20.00);
	Electrodomesticointerface electro= new Electrodomesticointerface("Refrigerador", "Refrigeración", 560.00, "LG");
	Ropainterface ropa= new Ropainterface("Camiseta","Vestuario informal", 20.00, "rojo", "XL");
	
	System.out.println(libro1);
	System.out.println(electro);
	System.out.println(ropa);
		}
}