package javarecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.FileInputStream;

public class TestStudent {

	public static void main(String[] args) {
		
		HashMap map= new HashMap();

		List<Integer> johnGrades = new ArrayList<>();
		johnGrades.add(80);
		johnGrades.add(90);
		johnGrades.add(70);
		StudentRecord john = new StudentRecord("John", 123, johnGrades);

		List<Integer> sarahGrades = new ArrayList<>();
		sarahGrades.add(50);
		sarahGrades.add(55);
		sarahGrades.add(62);
		StudentRecord sarah = new StudentRecord("Sarah", 456, sarahGrades);

		System.out.println(john.getAverageGrade()); // prints "80.0"
		System.out.println(sarah.hasPassingGrade()); // prints "true"

	}

}


