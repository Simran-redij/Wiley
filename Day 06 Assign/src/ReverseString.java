
// Write a program to reverse a String

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Simran";
		System.out.println("Reversed string is...");
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
