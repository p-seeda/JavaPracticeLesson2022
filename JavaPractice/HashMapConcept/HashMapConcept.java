package HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {

		//HashMap<String, Integer> empMap = new HashMap<String, Integer>(); //HashMap
		//Map<String, Integer> empMap = new HashMap<String, Integer>();   // Map
		//Map<String, Integer> empMap = new LinkedHashMap<String, Integer>();  //LinkedHashMap
		Map<String, Integer> empMap = new TreeMap<String, Integer>();  //LinkedHashMap
		// define the value
		empMap.put("Tim", 100);
		empMap.put("Lena", 200);
		empMap.put("Maya", 300);
		empMap.put("Leela", 400);
		empMap.put("Sekar", 500);
		empMap.put("Niya", 600);
		empMap.put("a", 900);
		empMap.put("A", 800);
		empMap.put("Anita", 40);
		empMap.put("1Aa", 600);
		empMap.put("*zena", 600);





		empMap.forEach((k,v) -> System.out.println(k+":"+v));
		// capture the value
//		System.out.println(empMap.get("Tim"));
//		System.out.println(empMap.get("Maya"));
//		
		

	}

}
