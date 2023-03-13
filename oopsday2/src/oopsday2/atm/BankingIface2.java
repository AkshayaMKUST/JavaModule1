package oopsday2.atm;

public interface BankingIface2 {
	
	public double withdraw(double amount, int accno);
	public double deposit(double amount, int accno);
	public double balanceEnquiry(int acno);
}
