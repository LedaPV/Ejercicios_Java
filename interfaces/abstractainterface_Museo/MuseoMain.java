package abstractainterface_Museo;

public class MuseoMain {

	public static void main(String[] args) {

		// Creación de objetos contenidos y agrupados en un array
		Pictoricas[] pinturas = {
				new Pictoricas("El nacimiento de Venus", "Sandro Botticelli", "Siglo XV", "Expuesto", "Renacimiento",
						"Mitología", "Temple", "Lienzo"),
				new Pictoricas("Guernica", "Picasso", "Siglo XX", "Expuesto", "Cubismo y surrealismo",
						"Memoria histórica", "Óleo", "Lienzo"),
				new Pictoricas("El jardín de las delicias", "El Bosco", "Siglo XVI", "Almacén", "Pintura flamenca",
						"Misticismo", "Óleo", "Tabla") };
		Escultoricas[] esculturas = {
				new Escultoricas("La piedad", "Miguel Ángel", "Siglo XV", "Expuesta", "Renacimiento", "Religión",
						"Talla", "Mármol"),
				new Escultoricas("Dios del cabo Artemisio", "Desconocido", "Siglo V a.C.", "Expuesta",
						"Mezcla entre Arcaísmo y Clasicismo", "Mitología", "Cera pérdida", "Bronce"),
				new Escultoricas("Virgen de Ger", "Desconocido", "Siglo XII", "Almacén", "Románico", "Religión",
						"Talla policromada", "Madera de álamo") };
		Fotograficas[] fotografias = {
				new Fotograficas("Muhammad Ali noquea a Sonny Liston", "Neil Leifer", "Año 1965", "Almacén",
						"Fotagrafía deportiva", "A color", "Documentación actualidad"),
				new Fotograficas("Niño hambriento y buitre", "Kevin Carter", "Año 1993", "Almacén", "Denuncia social",
						"A color", "Documentación reportaje") };

		// Ejecutar los métodos MostrarDatos()
		System.out.println();
		System.out.println("--------OBRAS DE ARTE-------");
		System.out.println();
		System.out.println("-------------------------------Pintura");
		for (Pictoricas pintura : pinturas) {
			pintura.MostrarDatos();
			System.out.println();
		}
		System.out.println();
		System.out.println("-------------------------------Escultura");
		for (Escultoricas escultura : esculturas) {
			escultura.MostrarDatos();
			System.out.println();
		}
		System.out.println();
		System.out.println("-------------------------------Fotografía");
		for (Fotograficas foto : fotografias) {
			foto.MostrarDatos();
			System.out.println();
		}

	}
}
