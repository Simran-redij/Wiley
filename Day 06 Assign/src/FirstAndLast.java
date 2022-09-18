import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.next();
		
		if(str.length() <= 5) {
			System.out.println("Enter a greater string");
		}
		else {
			char first = str.charAt(0);
			char last = str.charAt(str.length()-1);
			if(first == last) {
				System.out.println("First & Last characters of string are same");
			}else {
				System.out.println("First & Last characters of string are not same");
			}
		}
	}

}
