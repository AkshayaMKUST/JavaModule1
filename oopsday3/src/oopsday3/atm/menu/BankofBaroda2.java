package oopsday3.atm.menu;

import oopsday3.atm.exception.*;

public class BankofBaroda2 implements BankingIface2 {

	private Account[] accounts = new Account[5];
	private int accountindex;

	public BankofBaroda2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	public BankofBaroda2() {
	}

	public void addAccount(Account account) {
		if (this.accountindex < accounts.length)
			accounts[this.accountindex++] = account;
		else
			System.out.println("Operation not allowed");
	}

	public Account transactionAccount(Account account) {
		return account;
	}

	@Override
	public double withdraw(double amount, int acno) throws InsufficientFundsException {
		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcno() == acno) {
				if(accounts[i].getBalance()<amount) {
					throw new InsufficientFundsException("Not enough balance");
				}
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double deposit(double amount, int acno) throws NegativeAmountException {
		double tempBal = 0;
		if(amount<0) {
			throw new NegativeAmountException("Negative Amount "+amount+"cannot be deposited"); }
		else {
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
	
	public void displayaccount(int acno) {
		for(int i=0;i<accounts.length;i++) {
			if (accounts[i].getAcno() == acno) {
				System.out.println("Account Number : "+accounts[i].getAcno());
				System.out.println("Account Holder Name : "+accounts[i].getName());
				System.out.println("Account Type : "+accounts[i].getActType());
				System.out.println("Balance : "+accounts[i].getBalance());
			}
			
		}
	}

}
