
public class Employee {

	int empId;
	String empName;
	String empDept;
	double empBasicSalary;
	double empGrossSalary;
	
	
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}
	
	public double calculateGrossSalary() {
		double HRA = (12 * this.empBasicSalary)/100;
		double DA = (8 * this.empBasicSalary)/100;
		
		this.empGrossSalary = this.empBasicSalary + HRA + DA;
		return this.empGrossSalary;
	}

//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		if(this.empName == e.empName && this.empId == e.empId) {
			return true;
		}
		return false;
	}
	
	

}
