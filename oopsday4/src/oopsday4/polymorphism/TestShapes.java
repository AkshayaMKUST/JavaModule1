package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		Shape s=new Rectangle(40,20);
		System.out.println(s.area());
		
		s=new Circle(5);
		System.out.println(s.area());
		
		s=new Square(5);
		System.out.println(s.area());

	}

}
