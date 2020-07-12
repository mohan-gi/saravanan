package Array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
public static void main(String[] args) {
	java.util.Map<Integer, String>emp = new HashMap<Integer, String>();
	emp.put(10, "value1");
	emp.put(20, "value1");
	emp.put(30, "value3");
	
	
	Set<Entry<Integer,String>> e = emp.entrySet();
	for (Entry<Integer, String> x : e) {
		System.out.println(x.getKey());
		System.out.println(x.getValue());
	}
}
}
