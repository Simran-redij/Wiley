
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
		System.out.println(this.dd);
		System.out.println(this.mm);
		System.out.println(this.yy);
	}
	
	// CheckDate Method :
	public boolean checkDate() {
		if(this.dd>=1 && this.dd<=31 && this.mm>=1 && this.mm<=12 && noOfDigits(this.yy) == 4) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date(12, 03, 2020);
		boolean result = date.checkDate();
		if(result == true)
		{
			date.displayDate();
		}
		else {
			System.out.println("Enter a valid date");
		}
	}

}
