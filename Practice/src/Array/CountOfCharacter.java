package Array;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacter {

	public static void main(String[] args) {
		String s="java is a java ";
		Map <Character,Integer>map =new HashMap<Character, Integer>();
	    for (int i = 0; i < s.length(); i++) {
          char c=s.charAt(i);
          if (map.containsKey(c)) {
			Integer count = map.get(c);
			count++;
			map.put(c, count);
		}else {
			map.put(c, 1);
		}
	    }
	System.out.println(map);
	}

}
