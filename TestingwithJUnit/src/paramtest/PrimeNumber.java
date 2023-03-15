package paramtest;

public class PrimeNumber {
	
	public static boolean validate(int n) {
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) {
				flag=1;
				break;
			}
			
		}
		if(flag==0)
			return true;
		else
			return false;
	}

}
