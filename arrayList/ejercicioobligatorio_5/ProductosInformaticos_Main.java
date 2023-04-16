package ejercicioobligatorio_5;

import java.util.ArrayList;

public class ProductosInformaticos_Main {
	public static void main(String[] args) {

		ArrayList<ProductosInformáticos> pi = new ArrayList<ProductosInformáticos>();
		System.out.println();
		pi.add(new ProductosInformáticos("Ipad Air 2022",
				"64 GB, Gris Espacial, WiFi, 10.9, Liquid Retina, Chip M1 con Neural Engine", "Apple"));
	
		pi.add(new ProductosInformáticos("Memoria USB 32 GB",
				"SanDisk Ultra Luxe, USB 3.1, 150 MB/s, Protección por Contraseña: SecureAccess®, Plata",
				"SanDisk Ultra Luxe"));
		
		pi.add(new ProductosInformáticos("Disco duro SSD externo 1 TB",
				"WD My Passport SSD, Portátil, lectura 1050 MB/s, USB 3.2, para Windows y Mac, Oro", "WD"));
		
		pi.add(new ProductosInformáticos("PC sobremesa",
				"Lenovo IdeaCentre 5 14ACN6, AMD Ryzen™ 5 5600G, 8GB RAM, 512GB SSD, Radeon™ Graphics, Windows 11 Home",
				"Lenovo"));
		
		pi.add(new ProductosInformáticos("All in one - HP 24-CB1007NS",
				"23.8\" Full HD, Intel® Core™ i5-1235U, 16GB RAM, 512GB SSD, Iris® Xᵉ, W11 H, Blanco", "HP"));

		System.out.println("Información de los productos:");
		System.out.println("----------------------------------------------------------------------");
		

		for (ProductosInformáticos pro_inf : pi) {
			System.out.println(pro_inf.toString());
			System.out.println("-----------------");
		}
		
	}
}
