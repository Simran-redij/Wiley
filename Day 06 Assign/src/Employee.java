
public class Employee{

	int empId;
	String empName;
	EmployeeAddress tempAddress;
	EmployeeAddress permAddress;
	
	public Employee(int empId, String empName, EmployeeAddress tempAddress, EmployeeAddress permAddress) {
		this.empId = empId;
		this.empName = empName;
		this.tempAddress = tempAddress;
		this.permAddress = permAddress;
	}
	

	public void display() {
		System.out.println("Employee id : "+this.empId);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Temporary Address of Employee : "+this.tempAddress);
		System.out.println("Permanent Address of Employee : "+this.permAddress);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeAddress simPermAddress = new EmployeeAddress(6, "Pan Pacific Heights", "Beverly hills", "Los Angeles");
		EmployeeAddress simTempAddress = new EmployeeAddress(803, "Celestial City", "Hill road", "Ravet");
		
		Employee sim = new Employee(1, "Simran", simTempAddress, simPermAddress);
		
		sim.display();
	}

}
