
public class DepositAmountException extends Exception{

	
	String message;
	
	DepositAmountException(){
		message = "Deposit Amount Exception Occurred";
	}
	
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "Amount entered for calculating total interest is not positive";
	}

}
