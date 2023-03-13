package oopsday4.statictest;

public class StaticDemo2 {
	
	static int a;
	public static void method()
	{
		System.out.println("From method"+a);
		//method2(); is non static
	}
	
	public void method2() {
		System.out.println(a);
		method();
	}
	public StaticDemo2() {
		
	}
	

}

