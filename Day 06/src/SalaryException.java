
// User Defined Exception

public class SalaryException extends Exception {
	
	String message;
	
	SalaryException(int amount){
		message = "Salary Exception Occurred";
	}
	
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "SalaryException is not according to norm";
	}

}
