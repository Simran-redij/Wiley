
public class Employee implements Cloneable{

	int empId;
	String empName;
	
	
	public Employee() {
		super();
	}

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

	//Copy constructor 
//	public Employee(Employee e) {
//		
//	}
//	
//	public static Employee create() {
//		
//	}
	
//  @Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		Employee e = new Employee();
//		e.empId = this.empId;
//		e.empName = this.empName;
//		System.out.println(e);
//		//return e;
//		return super.clone();
//	}

	@Override
	// Destructor 
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	

	
	
}
