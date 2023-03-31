package observer.consumers;

import observer.iface.WeatherObserverIface;

public class Newspapers implements WeatherObserverIface {

public void doUpdate(int temperature) {
		
		System.out.println("Newspapers are updating temperature as " + temperature);


	}
}
