package oopsday1.setget;


public class CarFactory {

	public static void main(String[] args) {
		
		Car jag = new Car();
		
		jag.setColor("Red");
		jag.setPrice(3000000);
		jag.setBrand("Jaguar");
		jag.setModel("Premium Sedan");
		

//		
		System.out.println(jag.getColor());
		System.out.println(jag.getPrice());
		System.out.println(jag.getBrand());
		System.out.println(jag.getModel());
		
		Car bmw = new Car();
		bmw.setColor("Blue");
		bmw.setPrice(7500000);
		bmw.setBrand("Mahindra");
		bmw.setModel("Thar");
		
		System.out.println(bmw.getColor());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());

	}

}
