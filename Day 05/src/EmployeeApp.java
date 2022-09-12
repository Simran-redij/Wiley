
public class EmployeeApp implements Cloneable{

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
		
		//Employee e3 = (Employee) e2.clone(); // solution : Employee class should extend EmployeeApp class and implement Cloneable interface but this is not sensible hence we can use copy constructor or static method to create clone of a object
		e2.empName = "William";
		System.out.println(e2);
		//System.out.println(e3);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
