package com.ust.debugging;

public class TestCode {
	  
	  int a;
	  boolean b=true;

	  void m1(){
	    System.out.println("from m1"+this.a++);
	  }
	  void m2(){
	    this.b=false;
	    System.out.println("1"+this.a++);
	    System.out.println("2");
	    System.out.println("3");
	    this.m1();
	    this.b=true;
	    System.out.println("4"+this.a++);
	    System.out.println("5");
	    System.out.println("6"+this.a--);

	  }
	  
	  int factorial(int n) {
		  int fact=1;
		  for(int i=1;i<=n;i++) {
			  fact=fact*i;
		  }
		  return fact;
	  }
	  
	  int subtract(int n) {
		  return n-1;
	  }
	  
	  public static void main(String[] args) {
		TestCode t=new TestCode();
		t.m2();
		System.out.println(t.factorial(5));
	}

}
