package structural.adapters.wrap;

import structural.adapters.phoneifaces.LighteningPhone;
import structural.adapters.phoneifaces.MicroUSBPhone;

public class LighteningToMicroUSBAdapter implements MicroUSBPhone {

	    private final LighteningPhone lighteningPhone;

	    public LighteningToMicroUSBAdapter(LighteningPhone lighteningPhone) {
	        this.lighteningPhone = lighteningPhone;
	    }

	    @Override
	    public void useUSB() {
	        System.out.println("MicroUsb connected");
	        lighteningPhone.useLightening();
	    }

	    @Override
	    public void recharge() {
	        lighteningPhone.recharge();
	    }
	}
		// TODO Auto-generated method stub

