package cl.desafiolatam.service.impl;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.modelo.Producto;
import cl.desafiolatam.service.ProductoServicio;

public class ProductoServicioDummyImpl implements ProductoServicio {

	@Override
	public List<Producto> obtenerProductos() {
	
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		List<Producto> listaProductos = new ArrayList<Producto>();

		p1.setArticulo("Polera");
		p1.setCodigo("01");
		p1.setColor("Rojo");
		p1.setDescripcion("Polera Roja");
		p1.setMarca("Lider");
		p1.setPrecio("10000");
		p1.setTalla("M");

		p2.setArticulo("Polera");
		p2.setCodigo("02");
		p2.setColor("Verde");
		p2.setDescripcion("Polera Verde");
		p2.setMarca("Lider");
		p2.setPrecio("1000");
		p2.setTalla("M");

		listaProductos.add(p1);
		listaProductos.add(p2);

		return listaProductos;
	}

	@Override
	public void agregarProducto(Producto producto) {
	

	}

}
