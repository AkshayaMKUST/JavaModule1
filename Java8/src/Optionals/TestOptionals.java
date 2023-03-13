package Optionals;

import java.util.Optional;

public class TestOptionals {
	public static void main(String[] args) {
		
		String str=null;
		String str2="hello";
		//Optional<String> optional= Optional.of(str);
//		System.out.println(optional.get()); //gives null pointer exception when we use Optional.of
		
		Optional<String> optional2=Optional.ofNullable(str2); // gives nullpointer exception
		//System.out.println(optional2.get());
		if(optional2.isPresent())
			System.out.println("Value is present"+optional2.get()); // when str2 is passed if condition will be executed
		else
			System.out.println("is null"+optional2.get()); // when str is passed else condition will be executed and will result in an "no such element exception"
			System.out.println("is null"+optional2.orElse("str not initialized"));
	}
}
