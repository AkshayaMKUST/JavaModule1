package factory;

public class UseVehicle {
	public static void main(String[] args) {
		
		VehicleIface creta= VehicleFactory.newInstance("Creta");
		creta.start();
		VehicleIface xcross= VehicleFactory.newInstance("Xcross");
		xcross.honk();
		VehicleIface seltos= VehicleFactory.newInstance("Seltos");
		seltos.move();
	}

}
