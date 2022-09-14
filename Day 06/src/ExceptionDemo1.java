
// Generic Exception

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		catch(Exception e) {
			if(e instanceof NullPointerException) {
				System.out.println("Null pointer exception occured");
			}
			if(e instanceof ArithmeticException) {
				System.out.println("Arithmetic exception occured");
			}
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Number of elements in the array are not sufficient");
			}
		}
	}
}
