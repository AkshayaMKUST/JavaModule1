package factory;

public class Seltos implements VehicleIface {

	@Override
	public void start() {
		System.out.println("Started..."+getClass());
		
	}

	@Override
	public void stop() {
		System.out.println("Stopped..."+getClass());
		
	}

	@Override
	public void honk() {
		System.out.println("Pam Pam..."+getClass());
		
	}

	@Override
	public void move() {
		System.out.println("Movinggg..."+getClass());
		
	}
	
	

}
