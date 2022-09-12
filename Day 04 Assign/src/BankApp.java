
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*NOTE* : Opening balance should always be positive.");
		System.out.println();
		BankAccount sim = new BankAccount(1, "Sim", Math.abs(1000), "Savings");
		BankAccount arihant = new BankAccount(2, "Arihant", Math.abs(2000), "Savings");
		BankAccount srushti = new BankAccount(3, "Srushti", Math.abs(3000), "Current Account");
		
//		sim.depositAmount(1500);
//		sim.withdrawAmount(500);
//		System.out.println(sim.getCurrentBalance());
//		arihant.depositAmount(700);
//		srushti.depositAmount(5000);
//		BankAccount.displayTotalBalance();
//		arihant.displayAccountDetails();
		
//		sim.withdrawAmount(3500);
//		sim.withdrawAmount(200);
//		System.out.println(sim.getCurrentBalance());
		
		srushti.depositAmount(4000);
		arihant.depositAmount(3000);
		sim.depositAmount(10000);
		BankAccount.displayTotalBalance();
		arihant.withdrawAmount(4600);
		System.out.println(arihant.getCurrentBalance());
		srushti.withdrawAmount(6500);
		System.out.println(srushti.getCurrentBalance());
		BankAccount.displayTotalBalance();
		sim.displayAccountDetails();
		arihant.displayAccountDetails();
		
	}

}
