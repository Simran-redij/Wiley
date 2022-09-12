
public class WrapperDemo {
	
	public static void main(String args[]) {

	int x = 10;
	Integer i1 = new Integer(x); // BOXING : primitive -> object 
	
	Integer i2 = new Integer(25);
	int y = i2.intValue(); // UNBOXING : object -> primitive
	
	WrapperDemo obj = new WrapperDemo();
	obj.checkValue(y);
	
	}
	
	public static void checkValue(Object y) { // we can also write (Number y), (Integer y) or (int y)
		System.out.println("Inside check value method");
	}
	
}
