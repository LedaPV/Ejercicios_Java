package ejercicio_1;

public class VehiculoMain {
	
	public static void main (String[] args) {
		Coche coche= new Coche("Seat", "amarillo","1200");
		Coche coche1= new Coche("Ferrari","rojo", "5000");
		Moto moto1= new Moto("Hardley-Davidson", "gris", "2500");
		Bicicleta bici= new Bicicleta("JBK", "verde", "trail");
		Patinete patinete= new Patinete("Xiaomi 360", "blanco", 1200.0);
		
		System.out.println (coche);
		coche.Gracias();
		
		System.out.println (coche1);
		coche1.Gracias();
		
		System.out.println (moto1);
		moto1.Gracias();
		
		System.out.println (bici);
		bici.Gracias();
		
		System.out.println (patinete);
		patinete.Gracias();
	}

}
