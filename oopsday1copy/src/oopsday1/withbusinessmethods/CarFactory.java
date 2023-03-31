package oopsday1.withbusinessmethods;

public class CarFactory {

	public static void main(String[] args) {
		
		Car jag = new Car("Yellow",300000, "Toyota", "Innova"); //this will make object method ready

		jag.start();
		jag.changegear(1);
		jag.stop();
		
		
		Car bmw = new Car("Brown", 7500000, "BMW", "Sports SUV");
		
		bmw.start();
		bmw.changegear(2);
		bmw.stop();
		
		
		
//		System.out.println(jag);
////		jag.setColor("Red");
////		jag.setPrice(3000000);
////		jag.setBrand("Jaguar");
////		jag.setModel("Premium Sedan");
//		
//		System.out.println(jag.hashCode());
//		System.out.println(Integer.toHexString(jag.hashCode()));
//		System.out.println(jag);
////	System.out.println(jag.getPrice());
//		System.out.println(jag.getBrand());
//		System.out.println(jag.getModel());
		


	}

}
