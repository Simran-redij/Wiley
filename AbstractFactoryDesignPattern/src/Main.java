
public class Main {
	
	String name;
	String vendor;
	
	Main(){
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Main o = (Main)obj;
		o.name.compareToIgnoreCase(this.name);
		
		return(o.name.equalsIgnoreCase(this.name) && o.vendor.equalsIgnoreCase(this.vendor));
	}

	public Main(String vendor, String name) {
		//super();
		this.name = name;
		this.vendor = vendor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj1 = new Main("milk", "venkatesh");
		Main obj2 = new Main("milk", "Venkatesh");
		
		if(obj1.equals(obj2)) {
			System.out.println("Objects are equal");
		}else {
			System.out.println("Objects are not equal");
		}
	}

}
