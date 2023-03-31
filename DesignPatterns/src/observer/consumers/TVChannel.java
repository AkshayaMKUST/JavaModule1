package observer.consumers;

import observer.iface.WeatherObserverIface;

public class TVChannel implements WeatherObserverIface {
	
	public void doUpdate(int temperature) {
		
		System.out.println("TVChannels are updating temperature as " + temperature);


	}

}
