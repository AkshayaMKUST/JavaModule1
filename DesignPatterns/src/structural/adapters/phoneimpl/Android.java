package structural.adapters.phoneimpl;

import structural.adapters.phoneifaces.MicroUSBPhone;

public class Android implements MicroUSBPhone {
	private boolean connector;

	@Override
	public void useUSB() {
		connector = true;
		System.out.println("MicroUSB Connected");

	}

	@Override
	public void recharge() {
		if (connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge Finished");
		} else
			System.out.println("Connect MIcroUSB for Android");

	}

}
