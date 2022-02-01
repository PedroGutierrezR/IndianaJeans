package cl.desafiolatam.service;

import java.util.List;

import cl.desafiolatam.exceptions.ArchivoException;
import cl.desafiolatam.exceptions.ServiceException;
import cl.desafiolatam.modelo.Producto;

public interface ProductoServicio {
	
	public List<Producto> obtenerProductos() throws ArchivoException, ServiceException;
	public void agregarProducto(Producto producto);
	
}
