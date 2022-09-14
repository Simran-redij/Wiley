
// User Defined Exception

public class SalaryExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			calculateGrossSalary(5000);
		}
		catch(SalaryException se) {
			System.out.println(se);
			System.out.println(se.getMessage());
		}

	}
	
	public static void calculateGrossSalary(int basicSalary) throws SalaryException{
		if(basicSalary < 8000)
			throw new SalaryException(basicSalary);
	}

}
