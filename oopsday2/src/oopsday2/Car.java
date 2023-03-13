package oopsday2;

public class Car implements CarIface {

	private double fuel;
	private double battery;
	private double meters;
	private boolean enginestatus;
	
	public Car() {
		
	}
	
	
	
	public Car(double fuel, double battery, double meters, boolean enginestatus) {
	
		this.fuel = fuel;
		this.battery = battery;
		this.meters = meters;
		this.enginestatus = enginestatus;
	}



	public double getFuel() {
		return fuel;
	}



	public void setFuel(double fuel) {
		this.fuel = fuel;
	}



	public double getBattery() {
		return battery;
	}



	public void setBattery(double battery) {
		this.battery = battery;
	}



	public double getMeters() {
		return meters;
	}



	public void setMeters(double meters) {
		this.meters = meters;
	}



	public boolean isEnginestatus() {
		return enginestatus;
	}



	public void setEnginestatus(boolean enginestatus) {
		this.enginestatus = enginestatus;
	}



	@Override
	public void start() {
		
		if(enginestatus == false && fuel>1000 && battery>100)
		{
			System.out.println("Car is starting..");
			enginestatus=true;
		}

	}

	@Override
	public void honk() {

		System.out.println("Pa pa pam...");

	}

	@Override
	public void move() {
		
		if(enginestatus) {
			
			for(int i=0;i<50;i++) {
				
				System.out.println("Car is moving");
				fuel=fuel-10;
				battery=battery-2;
				meters++;
				
				
			}
		}
	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		
		System.out.println("Car is stopping..");
		this.enginestatus=false;

	}
	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", meters=" + meters + ", enginestatus=" + enginestatus
				+ "]";
	}


}
