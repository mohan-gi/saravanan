package String;

public class CompareTo {

	public static void main(String[] args) {
		String s1= "Abhi";
		String s2= new String("viraaj");
		String s3 = "Abhi";
		int s = s1.compareTo(s3);
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s2.compareTo(s1));
		
		int a = s1.compareTo(s2);     
    	System.out.println(a);
    	
    	
    	
    	
	}
}
