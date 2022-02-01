package cl.desafiolatam.archivo;

import java.io.BufferedReader;
import cl.desafiolatam.exceptions.ArchivoException;
import cl.desafiolatam.exceptions.ServiceException;

public interface Leer {
	
	public BufferedReader leerArchivo(String path, String nombreArchivo) throws ArchivoException;
	public void closeBufferReader() throws ArchivoException, ServiceException;
	
}
