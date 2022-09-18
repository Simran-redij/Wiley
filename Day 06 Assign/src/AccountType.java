
public enum AccountType {

	current(4), savings(8);
	
	int interestRate;
	
	AccountType(int interestRate){
		this.interestRate = interestRate;
	}
	
	public int getInterestRate(){
		return this.interestRate;
	}
}
