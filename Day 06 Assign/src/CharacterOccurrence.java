import java.util.Scanner;

public class CharacterOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Character is not present in the given string");
		}else {
		System.out.println("Character count = "+count);
		}
	}

}
