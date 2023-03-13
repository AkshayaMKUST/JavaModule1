package ExceptionHandlingDay6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		
		System.out.println("Program task begins..");

		/*
		 * try { Scanner sc=new Scanner(System.in); int a=sc.nextInt(); int
		 * b=sc.nextInt(); int c=a/b; System.out.println(c); }catch(ArithmeticException
		 * e) {
		 * 
		 * System.out.println("Cannot divide by zero"); }
		 */
		try
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			
			System.out.println("Cannot divide by zero");
		}catch(InputMismatchException e) {
			
			System.out.println("Invalid input format");
		}
		System.out.println("Program completed task.");

	}

}
