package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Kerala", "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Madhya Pradesh");
	
	
	Supplier<String> supplier = () -> {
		
		return new String("Hola!");
		
	};
	System.out.println(supplier.get());

	}
	
}
