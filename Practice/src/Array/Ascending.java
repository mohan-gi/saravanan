package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ascending {

	public static void map() {
		List<String> list = new ArrayList<String>();
		list.add("saravana");
		list.add("mohan");
		list.add("mainkandan");
		list.add("saravana");
		Map<String, Integer> map = new TreeMap<>();

		for (String ex : list) {
			if (map.containsKey(ex)) {
				int it = 1;
				map.put(ex, it + 1);
				System.out.println(map);

			} else {
				// System.out.println(ex);
				map.put(ex, 1);
			}
		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				String string = entry.getKey();
				System.out.println(entry.getValue());
				// System.out.println(string);
			}

		}
	}

	public static void main(String[] args) {
		map();
	}
}
