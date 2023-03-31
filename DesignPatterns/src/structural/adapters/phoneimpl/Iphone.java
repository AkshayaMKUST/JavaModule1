package structural.adapters.phoneimpl;

import structural.adapters.phoneifaces.LighteningPhone;

public class Iphone implements LighteningPhone {
	private boolean connector;
	@Override
	public void recharge() {
		if (connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge Finished");
		} else
			System.out.println("Connect Lightening phone for Iphone");

	}

	@Override
	public void useLightening() {
		connector = true;
		System.out.println("Lightening phone Connected");

	}

}
