package oopsday3.overloading;

public class TestMath {
	public static void main(String args[])
	{
		Math math=new Math();
		int result = math.add(10,20);
		System.out.println(result);
		result=math.add(10,20,30);
		System.out.println(result);
		
		double result2=math.add(10.5, 12.5);
		System.out.println(result2);
		
		result2=math.add(10L, 20L);
		System.out.println("Long "+result2);
		
	}

}
