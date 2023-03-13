package oopsday3.math;

public class Math1 implements MathIface {

	private int num;
	
	
	public Math1() {
		
	}

	public Math1(int num) {
		super();
		this.num = num;
	}
	

	@Override
	public int factorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	@Override
	public int PrimeOrNOt(int n) {
		int f=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				f=1;
				break;
			}
				
		}
		return f;
	}

	@Override
	public int OddOrEven(int n) {
		int f=0;
		if(n%2==0) {
			f=1;
		
		}
		return f;
	}

	@Override
	public int Sum(int n1,int n2) {
		
		int result=n1+n2;
		return result;
	}

	@Override
	public int Multiply(int n1, int n2) {
		
		int result=n1*n2;
		return result;
	}

	@Override
	public int Division(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	@Override
	public int Subtraction(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public int Modulus(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1%n2;
	}

	@Override
	public int Square(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}

	@Override
	public int Cube(int n) {
		
		return n*n*n;
	}
	
	

}
