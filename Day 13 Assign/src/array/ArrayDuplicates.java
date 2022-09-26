package array;

import java.util.Scanner;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array : ");
		int n = sc.nextInt();
		System.out.println("Enter actual array elements : ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("This array contains duplicates and that element is "+arr[i]);
					flag = 1;
					break;
				}
			}
		}
		
		if(flag == 0) {
			System.out.println("This array does not contain duplicate elements");
		}
		
	}
}
