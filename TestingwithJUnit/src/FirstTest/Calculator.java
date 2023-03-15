package FirstTest;

public class Calculator {

	
	public int power(int b,int e) {
		
		int product=1;

		if(b==0||e==0) {
			return 0;
		}
		else {
			for(int i=1;i<=e;i++) {
				product*=b;
			}
			return product;
			
		}
	}
		
	public int factorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
		
	public int fibonacci(int n) {
		int a=0;
		int b=1;
		int f=0;
		for(int i=2;i<n;i++) {
			f=a+b;
			a=b;
			b=f;
		}
		return f;
	}
		
	

}
