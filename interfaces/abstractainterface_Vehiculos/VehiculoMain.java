package abstractainterface_Vehiculos;

public class VehiculoMain {
	public static void main(String[] args) {

		Coche coche= new Coche("Seat", "amarillo","1200");
		Coche coche1= new Coche("Ferrari","rojo", "5000");
		Moto moto1= new Moto("Hardley-Davidson", "gris", "2500");
		Bicicleta bici= new Bicicleta("JBK", "verde", "trail");
		Patinete patinete= new Patinete("Xiaomi 360", "blanco", 1200.0);
		
		System.out.println();
		System.out.println("-------------------COCHES");
		System.out.println();
		coche.MostrarDatos();
		coche.Gracias();
		
		System.out.println();
		coche1.MostrarDatos();
		coche1.Gracias();
		
		System.out.println();
		System.out.println("-------------------MOTO");
		moto1.MostrarDatos();
		moto1.Gracias();
		
		System.out.println();
		System.out.println("-------------------BICICLETA");
		bici.MostrarDatos();
		bici.Gracias();
		
		System.out.println();
		System.out.println("-------------------PATINETE");
		patinete.MostrarDatos();
		patinete.Gracias();
	}

}