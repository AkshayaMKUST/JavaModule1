package FunctionalInterface;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Kerala", "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Madhya Pradesh");
		
		Predicate<String> p=(str)->{
			return str.length()>6;
		};
		
		for(String str : strings)
			System.out.println(p.test(str));
		desiredlength(strings,p);
		
	}
	
	public static void desiredlength(List<String> strings,Predicate<String> p) {
		
		for(String str : strings)
			System.out.println(p.test(str));
	}
}
