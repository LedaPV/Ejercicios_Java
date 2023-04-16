package abstractainterfaces;

public class MainProducto {
	public static void main(String[]args) {
	Producto libro= new Libro("El señor de los anillos", "Aventura", 20.00, "Tolkien");
	
	Producto electrodomestico= new Electrodomestico("Refrigerador", "Refrigeración", 560.00, "LG");
	
	libro.MonstrarInformacion();
	System.out.println();
	electrodomestico.MonstrarInformacion();
	
}
}