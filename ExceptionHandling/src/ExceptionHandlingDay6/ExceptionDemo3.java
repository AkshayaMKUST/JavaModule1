package ExceptionHandlingDay6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Program task begins");
		try {
			System.out.println("Entered Try..");
			int c=10/0;
			System.out.println("From Try After Exception..");
			
		}catch(Exception e) {
//			System.out.println("From Catch..");
		}
//		catch(ArithmeticException e) {   //error exception already handled
//			e.printStackTrace();
//		}
		finally {
			System.out.println("From Finally..");
		}
		System.out.println("Program Completed Task");
	}

}
