package cl.desafiolatam.exceptions;

public class ArchivoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArchivoException() {
		super();

	}

	public ArchivoException(String message) {
		super(message);
	
	}

	@Override
	public String getMessage() {
		
		return super.getMessage();
	}

	@Override
	public synchronized Throwable getCause() {
		
		return super.getCause();
	}

	@Override
	public String toString() {
		
		return super.toString();
	}


	public String getNoEncuentraArchivo() {
		return "No se encuentra archivo";
	}
	
}

