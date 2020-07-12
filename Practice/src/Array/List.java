package Array;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		java.util.List<Integer> ex= new ArrayList<Integer>();
		ex.add(15);
		ex.add(78);
		ex.add(32);
		ex.add(41);
		ex.add(122);
		
		for (int i = 0; i < ex.size(); i++) {
			System.out.println(ex.get(i));
		}
		for (Integer integer : ex) {
			System.out.println(integer);
		}
	}

}
