package MethodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list= new ArrayList<>();
		list.add("Sun");
		list.add("Moon");
		list.add("Earth");
		list.add("Venus");
		list.add("Mars");
		list.add("Jupiter");
		list.add("Saturn");
		
//		long count =	list.stream().filter((str)->str.length()>3||str.length()<10).count(); // values will be passed implicitly one by one.
//		System.out.println(count);
		
		Predicate<String> p =(String str)->{
			return (str.length()>3 || str.length()<10);
		};
		long count = list.stream().filter(p).count();
		System.out.println(count);
		
//		List<String> outlist = list.stream().map((str)->str.toUpperCase()).collect(Collectors.toList());
//		System.out.println(outlist);
		
		Function<String, String> f=(str)->{
			return str.toUpperCase();
		};
		
		List<String> funlist = list.stream().map(f).collect(Collectors.toList());
		System.out.println(funlist);
		
		Consumer<String> c=(str)->{
			System.out.println(str);
		};
		
		list.stream().forEach(c);
		
		//list.stream().forEach(System.out::println);
		
		list.stream().filter(p).map(f).forEach(c);
		
	}

}
