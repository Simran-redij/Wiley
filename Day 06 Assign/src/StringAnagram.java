import java.util.*;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1 = sc.next();
		System.out.println("Enter 2nd string : ");
		String str2 = sc.next();
		int flag = 0;
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		if(s1.length != s2.length) {
			System.out.println("Strings are not anagram :(");
		}
		else {
		
			Arrays.sort(s1);
			Arrays.sort(s2);
		
			for(int i=0; i<s1.length; i++) {
				if(s1[i] != s2[i]) {
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("Strings are Anagram :)");
			}else {
				System.out.println("Strings are not Anagram :(");
			}
		
		}
		
	}

}
