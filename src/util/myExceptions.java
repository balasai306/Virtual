package util;

public class myExceptions extends Exception{
/**
	 * @param message
	 */
	private String message;
	public myExceptions(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	

	

}
