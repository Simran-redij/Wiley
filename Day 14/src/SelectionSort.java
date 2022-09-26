
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp=0;
		int min=0;
	
		System.out.println("Enter array elements : ");
		
		for(int i=0; i<=n-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Selection Sorting in process...");
		
		for(int i=0; i<=n-1; i++) {  //Number of passes
			
			min = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		
		}
		
		System.out.println("Sorted array is : ");
		for(int i=0; i<=n-1; i++) {
			System.out.println(arr[i]);
		}
	}

}
