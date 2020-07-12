package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedChar {
	public static void main(String[] args) {

		String s = "Welcomegod";
		char[] ch = s.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (charmap.containsKey(c)) {
				Integer it = charmap.get(c);
				charmap.put(c, it + 1);
			} else {
				charmap.put(c, 1);

			}
		}
		Set<Entry<Character,Integer>> entrySet = charmap.entrySet();
		System.out.println("display repeated character ");
	    for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				Character key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+" = "+value);
				
			}
		}
	}
}
