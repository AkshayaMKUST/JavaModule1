package oopsday2;

public class CarFactory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CarIface car= new CarIface();
		
		
		// CarIface car;	//not referring to any object
		
		CarIface car= new Car(5000,500,0,false); //Interface is only going to appear on the left side
		car.start();
		car.honk();
		car.move();
		car.stop();
		
		
	}

}
