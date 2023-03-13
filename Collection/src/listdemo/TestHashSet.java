package listdemo;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		HashSet <String> bookSet = new HashSet<>();
		bookSet.add(" Java in a NutShell ");
		bookSet.add(" Java Complete Reference ");
		bookSet.add(" Java in 21 days ");
		bookSet.add(" Java for Dummys ");
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in a nutshell"));
		
		bookSet.add(" Java in 21 days ");
		bookSet.add(null); //hashset allows null only one time
		bookSet.add(null);
		System.out.println(bookSet.size());
		
		for(String book : bookSet) {
			System.out.println(book);
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
