package oopsday3.atm.menu;

public class Account {

	private int acno;
	private String name;
	private String actType;
	private double balance;
	
	
	public Account() {
		
	}


	public Account(int acno, String name, String actType, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.actType = actType;
		this.balance = balance;
	}


	public int getAcno() {
		return acno;
	}


	public void setAcno(int acno) {
		this.acno = acno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getActType() {
		return actType;
	}


	public void setActType(String actType) {
		this.actType = actType;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}