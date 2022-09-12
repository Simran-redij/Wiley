
public class EmployeeApp {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		Employee empArray[] = new Employee[5];
		empArray[0] = new Employee (1, "Sim", "CS", 200000);
		empArray[1] = new Employee (2, "Abc", "CS", 100000);
		empArray[2] = new Employee (1, "Sim", "EnTC", 400000);
		empArray[3] = new Employee (4, "Xyz", "Mechanical", 300000);
		empArray[4] = new Employee (5, "Ben", "Civil", 500000);
		sortEmployees(empArray);
		searchEmployee("CS", empArray);
		System.out.println(empArray[1].equals(empArray[3]));
		
	}

	public static void sortEmployees(Employee[] empArray) {
		Employee temp = new Employee();
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(empArray[i].empBasicSalary < empArray[j].empBasicSalary) {
					temp = empArray[i];
					empArray[i] = empArray[j];
					empArray[j] = temp;
				}
			}
		}
		System.out.println("Employees in ascending order of their salary are : ");
		for(Employee e : empArray) {
			System.out.println(e.empId+" "+e.empBasicSalary);
		}
		System.out.println("-----------------------------");
	}
	
	public static void searchEmployee(String empDept, Employee[] empArray) {
		int flag = 0;
		int count = 0;
		for(Employee e : empArray) {
			if(e.empDept == empDept) {
				flag = 1;
				count++;
			}
		}
		
		if(flag == 0) {
			System.out.println("Employee not found :(");
		}else {
			System.out.println(count+" employee found with department "+empDept);
		}
	}
	
}
