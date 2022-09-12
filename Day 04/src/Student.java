
// has-a-kind of relationship OR Containment

public class Student {
	
	int StudentRollNo;
	String StudentName;
	Date dtOfAdmission;
	
	public Student(int StudentRollNo, String StudentName, Date dtOfAdmission){
		this.StudentRollNo = StudentRollNo;
		this.StudentName = StudentName;
		this.dtOfAdmission = dtOfAdmission;
		
	}
	
	public void displayStudent() {
		System.out.println(StudentRollNo+" "+StudentName+" "+dtOfAdmission.displayDate());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date(27,9,2020);
		if(date1.checkDate() == true) {
			Student student1 = new Student(101, "Sim", date1);
			System.out.println("Student enrolled");
			student1.displayStudent();
		}
		else {
			System.out.println("Invalid date format student can't be enrolled :(");
		
		}
	}

}
