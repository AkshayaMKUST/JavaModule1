package oopsday3.atm.exception;

public class NegativeAmountException extends Exception {

	public NegativeAmountException() {
		
	}
	public NegativeAmountException(String msg) {
		
		super(msg);
		
	}
	public String getMessage() {
		return super.getMessage();
	}
	
}
