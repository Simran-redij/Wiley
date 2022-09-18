
public class GarbageDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long total = Runtime.getRuntime().freeMemory();
		System.out.println("Current free memory = "+total);
		
		// Allocate an array and ensure it is used by the program
		int[] array = new int[1000000];
		array[0] = 1;
		if(array[0] == 3) {
			return;
		}
		
		long total2 = Runtime.getRuntime().freeMemory();
		System.out.println("Free memory after array creation = "+total2);
		
		// Collect the garbage
		Runtime.getRuntime().gc();
		
		
		long total3 = Runtime.getRuntime().freeMemory();
		System.out.println("Free memory after GC = "+total3);
		
		// Display our memory sizes
		System.out.println("BEFORE : "+total);
		System.out.println("DURING : "+total2);
		System.out.println("AFTER : "+total3);
	}

}
