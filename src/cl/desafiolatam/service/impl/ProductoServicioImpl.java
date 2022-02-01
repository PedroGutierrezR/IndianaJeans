package cl.desafiolatam.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.archivo.Leer;
import cl.desafiolatam.archivo.impl.LeerTXT;
import cl.desafiolatam.exceptions.ArchivoException;
import cl.desafiolatam.exceptions.ServiceException;
import cl.desafiolatam.modelo.Producto;
import cl.desafiolatam.service.ProductoServicio;

public class ProductoServicioImpl implements ProductoServicio {

	// Aquí está el método y retorna el ArrayList
	@Override
	public List<Producto> obtenerProductos() throws ArchivoException, ServiceException{

		Leer leer = new LeerTXT();
		Producto producto = null;
		List<Producto> listaProductos = new ArrayList<Producto>();
		
		// Leer archivo
		try {
			BufferedReader brProductos = leer.leerArchivo("src/", "productosTienda1.txt");
			String data = brProductos.readLine();
			String dataField[];
			leer.closeBufferReader();// lo puse acá para hacer fallar el buffer
			while (data != null) {
				dataField = data.split(";");
				producto = new Producto();
				producto.setCodigo(dataField[0]);
				producto.setArticulo(dataField[1]);
				producto.setMarca(dataField[2]);
				producto.setColor(dataField[3]);
				producto.setDescripcion(dataField[4]);
				producto.setTalla(dataField[5]);
				producto.setPrecioCompra(dataField[6]);
				producto.setPrecio(dataField[7]);
				listaProductos.add(producto);
				data = brProductos.readLine();
			}
		} catch (ArchivoException e) {
			throw new ArchivoException();
		} catch (IOException e) {// ¿qué maneja esto?
			throw new ServiceException();
		}  finally {
			try {
				leer.closeBufferReader();
			} catch (ServiceException e) {
				throw new ServiceException();
			}
		}

		return listaProductos;
	}

	// Agregar Producto
	@Override
	public void agregarProducto(Producto producto) {
		
		
		
	}

}
