package abstractainterface_Productos;

public class MainProducto {
	public static void main(String[] args) {
	Libro libro1= new Libro("El señor de los anillos", "Aventura", 20.00, "Tolkien");
	Electrodomestico electro= new Electrodomestico("Refrigerador", "Refrigeración", 560.00, "LG");
	Ropa ropa= new Ropa("Camiseta","Vestuario informal", 20.00, "rojo", "XL");
	
	libro1.MostrarInformacion();
	libro1.SuCompra();
	libro1.Gracias();
	System.out.println();
	electro.MostrarInformacion();
	electro.SuCompra();
	electro.Gracias();
	System.out.println();
	ropa.MostrarInformacion();
	ropa.SuCompra();
	ropa.Gracias();
		}
}