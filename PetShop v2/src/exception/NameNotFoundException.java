package exception;

public class NameNotFoundException extends Exception{
	
	public String getMessage() {
	return "Name not found or not registered, search with a different name";
	}
}
