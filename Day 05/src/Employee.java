
public class Employee implements Cloneable{

	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	//String representation of object
	@Override
	public String toString() {
		return this.empId+" "+this.empName;
	}

	@Override
	// int representation of object
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
		// return this.empId*500;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		if(this.empId == e.empId)
			return true;
		return false;
	}

	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		Employee e = null;
//		e.empId = this.empId;
//		e.empName = this.empName;
//		return e;
//	}

	@Override
	// Destructor 
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(101, "John Doe");
		Employee e2 = new Employee(102, "John Doe");
		
		if(e1.equals(e2)) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
		
		System.out.println(e1+" "+e1.hashCode());
		System.out.println(e2+" "+e2.hashCode());
		
		Employee e3 = (Employee) e2.clone();
		e2.empName = "William";
		System.out.println(e2);
		System.out.println(e3);
	}
	
}
