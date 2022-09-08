import java.util.ArrayList;

public class Fibonacci {
	
	// A function to print the fibonacci numbers within given range
	public static void printFibonacci(int low, int high) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr = calcFib(high);
		
		for(int i=low; i<=high; i++) {
			if(arr.contains(i)) {
				System.out.println(i);
			}
		}
	}

	// A function to calculate all fibonacci numbers till highest range 
	public static ArrayList<Integer> calcFib(int x) {
		ArrayList<Integer> fib = new ArrayList<>();
		if(x == 1) {
			fib.add(0);
			return fib;
		}
		else if(x == 2) {
			fib.add(0);
			fib.add(1);
			return fib;
		}
		else {
			fib.add(0);
			fib.add(1);
			int a = 0;
			int b = 1;
			
			for(int i=3; i<=x; i++) {
				int c = a + b;
				fib.add(c);
				a = b;
				b = c;
			}
			return fib;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFibonacci(0, 144);
		
	}

}
