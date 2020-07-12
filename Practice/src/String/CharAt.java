package String;

public class CharAt {

	public static void main(String[] args) {
		String str = "Study To Night ";
		System.out.println(str.charAt(2));
		
		System.out.println(str.equalsIgnoreCase("studytonight"));
		
		System.out.println(str.contains("To"));
		System.out.println(str.concat("mohan Raj"));
		
		
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('a',2));
	}
}
