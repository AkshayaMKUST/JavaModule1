package com.ust.debugging;

public class TestCode2 {
	
	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int result;
		int a1[]= {2,5,7,8,5};
		int b1[]= {23,43,53,21,81};
		int x1[]= {18,19,20,21,22};
		for(int i=0;i<a1.length;i++) {
			a=a1[i];
			b=b1[i];
			x=x1[i];
			result=((a*x*x)+(b*x*x)+(2*a*b));
			System.out.println(result);
			
		}
	}
	

}
