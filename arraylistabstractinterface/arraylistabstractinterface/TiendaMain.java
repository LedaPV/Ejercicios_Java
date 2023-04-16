package arraylistabstractinterface;

import java.util.ArrayList;

public class TiendaMain {

	private ArrayList<ProductoInformatico> productos;

	public TiendaMain() {
		productos = new ArrayList<ProductoInformatico>();
	}

	public void agregarProducto(ProductoInformatico producto) {
		productos.add(producto);
	}

	public void mostrarProductos() {
		for (ProductoInformatico producto : productos) {
			System.out.println(producto.getDescripcion());
			System.out.println(producto); // Método toString
			producto.agregarCarrito();
		}
	}

	public static void main(String[] args) {
		TiendaMain tienda = new TiendaMain();

		// Agregar dos portátiles
		PortailImp portatil1 = new PortailImp("Dell XPS 13", 13.4, 8);
		tienda.agregarProducto(portatil1);

		PortailImp portatil2 = new PortailImp("Lenovo ThinkPad X1 Carbon", 14, 16);
		tienda.agregarProducto(portatil2);

		// Agregar dos móviles
		MovilImp movil1 = new MovilImp("Samsung Galaxy S21", 6.2, 8, "Movistar");
		tienda.agregarProducto(movil1);

		MovilImp movil2 = new MovilImp("Xiaomi Spectrum 12", 8.2, 12, "Movistar");
		tienda.agregarProducto(movil2);

		// Agregar dos tablets
		TabletImp tablet1 = new TabletImp("Samsung Galaxy  Tab S7", 649.99, 12, true);
		tienda.agregarProducto(tablet1);

		TabletImp tablet2 = new TabletImp("Apple Tab S12", 1649.99, 14, true);
		tienda.agregarProducto(tablet2);

		// Agregar dos accesorios
		AccesoriosImp accesorio1 = new AccesoriosImp("Funda portatil 15 pulgadas", 25.30, "Mosiso", "cuero");
		tienda.agregarProducto(accesorio1);
		AccesoriosImp accesorio2 = new AccesoriosImp("Funda Samsung A51", 15.60, "Samsung", "plástico");
		tienda.agregarProducto(accesorio2);

		tienda.mostrarProductos();
	}
}
