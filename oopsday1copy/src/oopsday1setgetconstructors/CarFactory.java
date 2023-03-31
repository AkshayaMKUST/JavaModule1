package oopsday1setgetconstructors;

public class CarFactory {

	public static void main(String[] args) {
		
		Car jag = new Car("Yellow",300000, "Toyota", "Innova"); //this will make object method ready
		System.out.println(jag);
//		jag.setColor("Red");
//		jag.setPrice(3000000);
//		jag.setBrand("Jaguar");
//		jag.setModel("Premium Sedan");
//		
		System.out.println(jag.hashCode());
		System.out.println(Integer.toHexString(jag.hashCode()));
		System.out.println(jag);
//		System.out.println(jag.getPrice());
//		System.out.println(jag.getBrand());
//		System.out.println(jag.getModel());
		


	}

}
