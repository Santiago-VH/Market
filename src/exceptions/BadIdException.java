package exceptions;

public class BadIdException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BadIdException(int idType0) {
		super("The id type can't be TI");
	}

}
