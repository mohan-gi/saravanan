package Array;

import java.util.LinkedHashMap;
import java.util.Map;import String.string;

public class CountOfWord {

	public static void main(String[] args) {

		String s= "java language is the easy java language";
		String []split=s.split(" ");
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		
		for (String x : split) {
			if (map.containsKey(x)) {
				Integer it = map.get(x);
			    it++;
			    map.put(x, it);
			}else {
				map.put(x, 1);
			}
		}
		System.out.println(map);
	}

}
