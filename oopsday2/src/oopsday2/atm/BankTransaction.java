package oopsday2.atm;

public class BankTransaction {

	public static void main(String[] args) {
		
		BankingIface b = new BankofBaroda();
		
		double balance=b.deposit(500);
		System.out.println("Balance After Deposit = "+balance);
		balance=b.withdraw(250);
		System.out.println("Remaining Balance After Withdrawal = "+balance);

	}

}
