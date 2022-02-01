package cl.desafiolatam.archivo.impl;

import java.io.BufferedReader;
import java.io.IOException;
import cl.desafiolatam.exceptions.ArchivoException;
import cl.desafiolatam.exceptions.ServiceException;

abstract public class Lector {
	
	protected BufferedReader br;

	abstract protected void lectura() throws ArchivoException;

	protected void closeBuffer() throws ArchivoException, ServiceException {
		if (this.br != null) {
			try {
				
				this.br.close();
				
			} catch (IOException e) {
				
				throw new ServiceException();
				
			}
		} 

	}
}
