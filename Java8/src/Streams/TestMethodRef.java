package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula {
	public void m1();
}

class Some {
	public static void m2() {
		System.out.println("from m2");
	}
}

public class TestMethodRef {

	public static void main(String[] args) {

		Formula f = Some::m2; // ": :" operator is called method refernce in JAVA 8
		f.m1();

		f = Other::new;
		
		List<String> list=Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);
		List<Integer> intList = Arrays.asList(1,4,24,456);
		Optional<Integer> num= intList.stream().reduce(Math :: max);
		System.out.println(num.get());
		
	}

}

class Other {
	Other() {
		System.out.println("from other constructors");
	}
}
