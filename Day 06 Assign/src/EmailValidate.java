import java.util.Scanner;

public class EmailValidate extends Throwable{

	public static void checkMail(String str) throws EmailException {
		if(str.endsWith("@gmail.com") == true && str.charAt(str.length()-11) != '@') {
			System.out.println("Valid email :)");
		}
		else {
			throw new EmailException();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email : ");
		String str = sc.next();
		
		
		try {
			checkMail(str);
		}
		catch(EmailException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}
