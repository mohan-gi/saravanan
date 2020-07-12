package String;

public class Length {
public static void main(String[] args) {
	String s= "Mohan Raj is a good person";
	System.out.println(s);
	System.out.println(s.length());
	
	String [] x= s.split(" ");
	System.out.println(x.length);
	
	System.out.print(s.lastIndexOf("n"));
	
	for (String k : x) {
		System.out.println(k);
	}
	
}
}
