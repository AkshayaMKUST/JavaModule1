package oopsday1;

public class CarFactory {

	public static void main(String[] args) {
				
		Car jag = new Car();
		jag.color="Blue";
		jag.price=3000000;
		jag.brand="Mahindra";
		jag.model="Thar";
				
		System.out.println(jag.color);
		System.out.println(jag.price);
		System.out.println(jag.brand);
		System.out.println(jag.model);
		
		Car bmw = new Car();
		bmw.color="Blue";
		bmw.price=7500000;
		bmw.brand="Mahindra";
		bmw.model="Thar";
		
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);

		

		}

	}


