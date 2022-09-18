
public class BankAccount{

	int accountId;
	String accountHoldername;
	AccountType acountType;
	
	public BankAccount(int accountId, String accountHoldername, AccountType acountType) {
		super();
		this.accountId = accountId;
		this.accountHoldername = accountHoldername;
		this.acountType = acountType;
	}

	public void calculateTotalInterest(double amount, int years) throws DepositAmountException{
		double totalInterest = 0;
		
		if(amount < 0) {
			throw new DepositAmountException();
		}
		if(this.acountType.interestRate == 4) {
			totalInterest = amount * 4 * years;
			System.out.println("Total Interest = "+totalInterest);
		}else {
			totalInterest = amount * 8 * years;
			System.out.println("Total Interest = "+totalInterest);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount sim = new BankAccount(1, "sim", AccountType.current);
		
		try {
			sim.calculateTotalInterest(5000, 2);
		}
		catch(DepositAmountException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
	}

}
