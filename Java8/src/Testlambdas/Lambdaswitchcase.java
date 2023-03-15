package Testlambdas;

public class Lambdaswitchcase {
	
	public static double calculate(String operator, double x, double y) {
		
		return switch (operator) {
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" -> {
			if(y==0) {
				throw new IllegalArgumentException("Can't divide");
				
			}
			yield x/y;
		}
		default -> throw new IllegalArgumentException("Unknown Operator");
		
		};
		
	}
	
	public static void main(String[] args)
	{
		Lambdaswitchcase l=new Lambdaswitchcase();
		System.out.println(l.calculate("+", 10, 20));
		System.out.println(l.calculate("-", 180, 20));
		System.out.println(l.calculate("*", 10, 20));
		System.out.println(l.calculate("/", 10, 0));
		System.out.println(l.calculate("&", 10, 20));
		
		
		
	}

	
}
