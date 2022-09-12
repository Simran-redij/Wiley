
public class Date {

	int dd;
	int mm;
	int yy;
	
	// Constructor :
	Date(int dd, int mm, int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	// DisplayDate Method :
	public void displayDate() {
		System.out.println(this.dd+"/"+this.mm+"/"+this.yy);
	}
	
	// CheckDate Method :
	public boolean checkDate() {
		if(noOfDigits(this.yy) == 4 && (days(mm)==true)) {
		
			return true;
		}
		return false;
	}
	
	
	public int noOfDigits(int n) {
		int count = 0;
		while(n != 0) {
			n = n / 10;
			count++;
		}
		
		return count;
	}
	
	public boolean days(int mm) {
		switch(mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(this.dd<=31)
				return true;
			return false;
			
		case 2:
			if(dd<=29)
				return true;
			return false;
		
		case 4:
		case 6:
		case 9:
		case 11:
			if(dd<=30)
				return true;
			return false;
		default:
				return false;
				
				
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date(12, 03, 2020);
		boolean result = date.checkDate();
		if(result == true)
		{
			System.out.println("Your date is valid...!!!");
			date.displayDate();
		}
		else {
			System.out.println("Enter a valid date :(");
		}
	}

}
