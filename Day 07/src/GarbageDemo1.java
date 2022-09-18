
public class GarbageDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GarbageDemo1 s1 = new GarbageDemo1();
		GarbageDemo1 s2 = new GarbageDemo1();
		s1 = null;
		s2 = null;
		//System.gc(); //forcefully invoke GC
		//Runtime.getRuntime().gc();
		
		display();
	
	}
	
	public static void display() {
		String s3 = "something";
		s3 = null;
		System.gc();
	}
	
	public void finalize() {
		System.out.println("object garbage is collected");
	}

}
