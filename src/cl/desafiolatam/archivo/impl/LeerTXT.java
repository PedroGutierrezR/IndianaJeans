package cl.desafiolatam.archivo.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import cl.desafiolatam.archivo.Leer;
import cl.desafiolatam.exceptions.ArchivoException;
import cl.desafiolatam.exceptions.ServiceException;

public class LeerTXT extends Lector implements Leer{
	
	private String path;
	private String nombreArchivo;
	
	@Override
	protected void lectura() throws ArchivoException {
	
		File archivo = null;
		FileReader fr = null;
		
		try {
			archivo = new File(this.path + this.nombreArchivo);
			fr = new FileReader(archivo);
			this.br = new BufferedReader(fr);	
		} catch (Exception e) {
			
			throw new ArchivoException();
			
		} 
		
	}
	
	@Override
	public BufferedReader leerArchivo(String path, String nombreArchivo) throws ArchivoException  {
	
		this.path = path;
		this.nombreArchivo = nombreArchivo;
		this.lectura();
		return this.br;

	}


	@Override
	public void closeBufferReader() throws ArchivoException, ServiceException {
	
		super.closeBuffer();
	}
	
	

}
