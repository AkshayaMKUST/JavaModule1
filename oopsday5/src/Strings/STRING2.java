package Strings;

public class STRING2 {

	public static void main(String[] args) {
		
		int i= 1234567;
		String str= i+"";
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		
		
		boolean result= str.equals(sb.toString());// we have to use toString since we cannot compare string str with String builder sb
		System.out.println(result);
		
		
		int n= 10;
		String s= new String("10");
		
		//from integer to string
		String s2= Integer.toString(n);
		
		

	}

}
