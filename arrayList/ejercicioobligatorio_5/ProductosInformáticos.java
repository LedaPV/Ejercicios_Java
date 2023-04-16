package ejercicioobligatorio_5;
/**
 * Realiza el mismo ejercicio, pero con productos informáticos, los argumentos
 * serán nombre, descripción, proveedor.
 */
public class ProductosInformáticos {
	private String nombre;
	private String descripción;
	private String proveedor;

	// Método constructor
	public ProductosInformáticos(String nombre, String descripción, String proveedor) {
		super();
		this.nombre = nombre;
		this.descripción = descripción;
		this.proveedor = proveedor;
	}

	// Método getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	// Método toString
	public String toString() {
		return "Nombre: " + nombre + "\nDescripción: " + descripción + "\nProveedor: " + proveedor;
	}
}
