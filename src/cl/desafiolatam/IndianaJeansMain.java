package cl.desafiolatam;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.exceptions.ArchivoException;
import cl.desafiolatam.exceptions.MenuInvalidoException;
import cl.desafiolatam.exceptions.ServiceException;
import cl.desafiolatam.modelo.Producto;
import cl.desafiolatam.service.ProductoServicio;
import cl.desafiolatam.service.impl.ProductoServicioImpl;

public class IndianaJeansMain {

	public static void main(String[] args) {

		Menu menu = Menu.getInstance();

		ProductoServicio productoServicio = new ProductoServicioImpl();
		List<Producto> listaProducto = new ArrayList<Producto>();
		
		int opcionMenuPrincipal = 0;
		
		do {
			try {
				opcionMenuPrincipal = menu.getOpcionMenuPrincipal();
				System.out.println("Opcion ingresada: " + opcionMenuPrincipal);
				
				switch (opcionMenuPrincipal) {
				case 1:
					listaProducto = productoServicio.obtenerProductos();
					for (int i = 0; i < listaProducto.size(); i++) {
						System.out.println(listaProducto.get(i).toString());
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				}
			} catch (MenuInvalidoException e) {
				System.out.println(e.getMessage());
			} catch (ArchivoException e) {
				System.out.println(e.getNoEncuentraArchivo());
			} catch (ServiceException e) {
				System.out.println(e.getNoCierraBuffer());
			} 
		} while (!(opcionMenuPrincipal == 4));

		System.out.println("Gracias por usar Indiana Jeans");
		
	}
}
