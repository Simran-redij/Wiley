
public class BankAccount {
	
	int accountId;
	String accountHolderName;
	double openingBalance;
	private double currentBalance;
	static double totalBalance;
	String accountType;
	AccountType actType;
	
	BankAccount(int accountId, String accountHolderName, double openingBalance, String accountType){
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		
		if(accountType == "Savings" && openingBalance >= 500) {
			AccountType actType = AccountType.savings;
			this.openingBalance = openingBalance;
			this.currentBalance = openingBalance;
			totalBalance = totalBalance + openingBalance;
		}
		else if(accountType == "Current Account" && openingBalance >= 1000){
			AccountType actType = AccountType.currentAccount;
			this.openingBalance = openingBalance;
			this.currentBalance = openingBalance;
			totalBalance = totalBalance + openingBalance;
		}
		else {
			System.out.println("Sorry, "+this.accountHolderName+"'s account cannot be created, try again later :(");
			System.out.println("----------------------------------------------");
		}
	}
	
	public void depositAmount(double amount) {
		this.currentBalance = this.currentBalance + amount;
		totalBalance = totalBalance + amount;
		System.out.println(this.accountHolderName+"'s Current balance = "+this.currentBalance);
		System.out.println("----------------------------------------------");
	}
	
	public void withdrawAmount(double amount) {
		if(this.accountType == "Savings") {
		if(amount > this.currentBalance || this.currentBalance-amount <= 500) {
			System.out.println("Insufficient balance :(");
			System.out.println("----------------------------------------------");
		}
		else if(this.currentBalance - amount >= 500) {
			System.out.println(this.accountHolderName+" is withdrawing amount Rs."+amount);
			this.currentBalance = this.currentBalance - amount;
			totalBalance = totalBalance - amount;
			System.out.println("Current balance = "+this.currentBalance);
			System.out.println("----------------------------------------------");
		}
		}
		
		if(this.accountType == "Current Account") {
			if(amount > this.currentBalance || this.currentBalance-amount <= 1000) {
				System.out.println("Insufficient balance :(");
				System.out.println("----------------------------------------------");
			}
			else if(this.currentBalance - amount >= 1000) {
				System.out.println(this.accountHolderName+" is withdrawing amount Rs."+amount);
				this.currentBalance = this.currentBalance - amount;
				totalBalance = totalBalance - amount;
				System.out.println("Current balance = "+this.currentBalance);
				System.out.println("----------------------------------------------");
			}
			}
	}
	
	public double getCurrentBalance() {
		return this.currentBalance;
	}
	
	public static void displayTotalBalance() {
		System.out.println("Total balance = "+totalBalance);
		System.out.println("----------------------------------------------");
	}
	
	public void displayAccountDetails() {
		System.out.println("Account holder name = "+this.accountHolderName);
		System.out.println("Account id = "+this.accountId);
		System.out.println("Account Type = "+this.accountType);
		System.out.println("Opening Balance = "+this.openingBalance);
		System.out.println("Current Balance = "+this.currentBalance);
		System.out.println("----------------------------------------------");
	}

	
}
