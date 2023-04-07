package listdemo;
import java.util.Iterator;
import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>(); //making a generic collection of string type
		//colors.add(new Object());
		//colors.add(new Double("10.10")); // it cannot accept double , only string
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		
		String str = colors.get(3);
		System.out.println(str);

	}

}
