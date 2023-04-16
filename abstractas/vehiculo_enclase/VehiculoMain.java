package vehiculo_enclase;

public class VehiculoMain {
	
	public static void main (String[] args) {
		Coche coche= new Coche("Seat", "amarillo","1200");
		Coche coche1= new Coche("Ferrari","rojo", "5000");
		Moto moto1= new Moto("Hardley-Davidson", "gris", "2500");
		Bicicleta bici= new Bicicleta("JBK", "verde", "trail");
		Patinete patinete= new Patinete("Xiaomi 360", "blanco", 1200.0);
		
		coche.MostrarDatos();
		coche.Gracias();
		
		coche1.MostrarDatos();
		coche1.Gracias();
		
		moto1.MostrarDatos();
		moto1.Gracias();
		
		bici.MostrarDatos();
		bici.Gracias();
		
		patinete.MostrarDatos();
		patinete.Gracias();
	}

}
