
public class EmailException extends EmailValidate{

	String message;
	
	EmailException(){
		message = "Email Exception Occurred";
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "Email is invalid";
	}
}
