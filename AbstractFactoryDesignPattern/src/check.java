import java.util.*;
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double bill = 0;
		
		if(n <= 100) {
			bill = n * 0.5;
		}
		
		else if(n>=101 && n<=150) {
			bill = (100 * 0.5) + ((n-100) * 0.75);
		}
		
		if(n>150) {
			bill = (100 * 0.5) + (50 * 0.75) + ((n-150)*1);
		}
		
		System.out.println("Bill = "+bill);
	}

}
