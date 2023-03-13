package oopsday2.atm;

public class BankTransaction2 {

	public static void main(String[] args) {
		
		Account a1= new Account(101,"John Doe", "savings", 5000);
		Account a2= new Account(102,"Jane Doe", "savings", 8000);
		Account a3= new Account(103,"Jack Doe", "savings", 6000);
		Account a4= new Account(104,"Jim Doe", "savings", 9000);
		Account a5= new Account(105,"Jenny Doe", "savings", 7000);
		
		BankofBaroda2 br= new BankofBaroda2();
		br.addAccount(a5);
		br.addAccount(a1);
		br.addAccount(a3);
		br.addAccount(a2);
		br.addAccount(a4);

		System.out.println("Balance of the Account = "+ br.balanceEnquiry(104));
		double result= br.deposit(1000, 104);
		System.out.println("Amount after depositing = "+result);
		result=br.withdraw(500, 104);
		System.out.println("Amount after withdrawal = "+result);
	}

}
