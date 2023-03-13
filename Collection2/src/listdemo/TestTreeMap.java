package listdemo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> countrycurr = new TreeMap<>();
		countrycurr.put("IND", "Rupee");
		countrycurr.put("USA", "$");
		countrycurr.put("UK", "pound");
		countrycurr.put("SD", "Dirhm");
		
		/*
		 * System.out.println(countrycurr); System.out.println(countrycurr.get("IND"));
		 * 
		 * countrycurr.put("IND", "Rupees"); System.out.println(countrycurr.size());
		 * System.out.println(countrycurr.containsKey("UK"));
		 * System.out.println(countrycurr.containsValue("$"));
		 */
	
		//HashMap has 3 views
		//1. Key view
		
		Set<String> keys = countrycurr.keySet();
		for(String key : keys) {
			
			System.out.println(key);
		}
		
		//2. Value view
		
		Collection<String> values = countrycurr.values();
		for(String value : values) {
			
			System.out.println(value);
		}
		
		//3. Key Values together - entryset
		
		Set<Entry<String,String>> entries = countrycurr.entrySet();
		for(Entry<String, String> entry : entries) {
			
			System.out.println(entry);
		}
		
	}
	

}
