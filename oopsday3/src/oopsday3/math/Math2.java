package oopsday3.math;

public class Math2 {

	public static void main(String[] args) {
	
		MathIface m= new Math1();
		
			System.out.println("Factorial Of the number = "+(m.factorial(5)));
			
			
			int p=m.PrimeOrNOt(6);
			if(p==0) {
				System.out.println("The given number is not prime");
			}
			else
				System.out.println("The given number is prime");
			
			
			int oe=m.OddOrEven(9);
			if(oe==1) {
				System.out.println("Given number is an even number");
			}
			else
				System.out.println("Given number is an odd number");
			
			int sum=m.Sum(5,5);
			System.out.println("Sum of the numbers = "+sum);
			
			System.out.println("Subtraction s = "+(m.Subtraction(42,24)));
			
			int prod=m.Multiply(5,5);
			System.out.println("Product = "+prod);
			
			System.out.println("Division = "+(m.Division(30,2)));
			
			System.out.println("Modulus = "+(m.Modulus(30,20)));
			
			System.out.println("Square of the numbers = "+(m.Square(6)));
			
			System.out.println("Cube of the numbers = "+(m.Cube(9)));
	}
}