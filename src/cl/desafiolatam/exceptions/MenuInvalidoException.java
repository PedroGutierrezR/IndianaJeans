package cl.desafiolatam.exceptions;

public class MenuInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -736363148632448739L;

	public MenuInvalidoException() {
		super();
		
	}

	public MenuInvalidoException(String message) {
		super(message);
		
	}

	@Override
	public String getMessage() {
		return "La opci�n del men� ingresada no es v�lida";
	}
	
	
}
