package matematicas.geometría;

public class Geometria_obj {
	
	//Calcula el volumen de un cilindro.
	//Tanto el radio como la altura se deben proporcionar en las mismas
	//unidades para que el resultado sea congruente.
	
	
	//@param r radio del cilindro.
	//@param h altura del cilindro.
	//@return volumen del cilindro.
	
	public double volumenCilindro(double r, double h) {
		return Math.PI *r *r *h;
	}
		
	//Calcula la longitud de una circunferencia a partir del radio.
	
	//@param r radio de la circunferencia
	//@return longitud de la circunferencia
	
	public double longitudCircunferencia(double r) {
		return 2 * Math.PI * r;
	}
	
	//Calcula el área de un triángulo a partir de su base y su altura.
	
	//@param b base del triángulo.
	//@param a altura del triángulo.
	
	public double areaTriangulo(double b, double a) {
		return (b*a)/2;
	}
}

