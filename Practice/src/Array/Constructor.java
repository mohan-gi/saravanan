package Array;

import javax.swing.SpringLayout.Constraints;

public class Constructor extends Constructors {
	public Constructor() {
		this(10);
	}

	public Constructor(int i) {
		this("saravanan");
		System.out.println(i);

	}

	public Constructor(String a) {
		this(20.20f);
		System.out.println(a);
	}

	public Constructor(float b) 
    {
    	System.out.println(b);
    	
    	
    }

	public static void main(String[] args) {
		Constructors x = new Constructor();
	}
}
