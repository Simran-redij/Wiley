import java.io.*;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] array = new int[10];
			array[10] = 30/2;
			File f = new File("abc.text");
			FileInputStream fis = new FileInputStream(f);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | IOException e) {
			//System.out.println(e.getMessage());
			if(e instanceof NullPointerException) {
				System.out.println("Null pointer exception occured");
			}
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Number of elements in the array are not sufficient");
			}
			if(e instanceof ArithmeticException) {
				System.out.println("Arithmetic exception occured");
			}
			if(e instanceof IOException) {
				System.out.println("Io");
			}
		}
	}

	

		
}


