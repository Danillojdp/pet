package exception;

public class RaceNotFoundException extends Exception{
	
	public String getMessage() {
		return "Race not found or not registered, search with a different name";
		}

}
