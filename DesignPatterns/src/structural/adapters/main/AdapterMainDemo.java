package structural.adapters.main;

import structural.adapters.phoneifaces.LighteningPhone;
import structural.adapters.phoneifaces.MicroUSBPhone;
import structural.adapters.phoneimpl.Android;
import structural.adapters.phoneimpl.Iphone;
import structural.adapters.wrap.LighteningToMicroUSBAdapter;

public class AdapterMainDemo {

	public static void rechargeMicroUsbPhone(MicroUSBPhone phone) {
		phone.useUSB();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LighteningPhone phone) {
		phone.useLightening();
		phone.recharge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUSBPhone;
		System.out.println(result);
		

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

				
		System.out.println("Recharging iPhone with MicroUsb");
	    rechargeMicroUsbPhone(new LighteningToMicroUSBAdapter(iPhone));// call goes to  line#11
	}
}
