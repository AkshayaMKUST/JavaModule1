package oopsday2.atm;

public class BankofBaroda2 implements BankingIface2 {

	private Account[] accounts = new Account[5];
	private int accountindex;
	public BankofBaroda2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}
	
	

	public BankofBaroda2() {
	}



	public void addAccount(Account account)
	{
		if(this.accountindex<accounts.length)
			accounts[this.accountindex++]=account;
		else
			System.out.println("Operation not allowed");
	}
	
	public Account transactionAccount(Account account)
	{
		return account;
	}
	
	@Override
	public double withdraw(double amount, int acno) {
		double tempBal=0;
		
			for(int i=0;i<accounts.length;i++)
			{
				if(accounts[i].getAcno()==acno) 
				{
					tempBal=accounts[i].getBalance();
					tempBal -= amount;
					accounts[i].setBalance(tempBal);
					break;
				}
			}
			return tempBal;
	}

	@Override
	public double deposit(double amount, int acno) {
		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcno() == acno) {
				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double balanceEnquiry(int acno) {
		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcno() == acno) {
				tempBal = accounts[i].getBalance();
				break;
			}
		}
		return tempBal;
	}

}
