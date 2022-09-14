
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1, value2;
		int add, sub, div, mul;
		
		value1 = 10;
		value2 = 0;
		
		add = value1 + value2;
		System.out.println("Addition = "+add);
		
		sub = value1 - value2;
		System.out.println("Subtraction = "+sub);
		
		try {
		div = value1 / value2;
		System.out.println("Division = "+div);
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
			// OR
			System.out.println(ae.getMessage());
			// OR
			System.err.append("Error occured");
		}
		
		mul = value1 * value2;
		System.out.println("Multiplication = "+mul);
	}

}
