import java.util.*;

public class MagicIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array : ");
		int n = sc.nextInt();
		System.out.println("Enter actual array elements : ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		findMagic(arr, n, 0);
	}

	public static void findMagic(int[] arr, int n, int i) {
		
		if(i == n) {
			System.out.println("Sorry, magic index not found :(");
			return;
		}
		
		if(arr[i] == i) {
			System.out.println("Magic index found and it is : "+i);
			return;
		}
		
		findMagic(arr, n, i+1);
	}
}
