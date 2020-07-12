package MethodOverriding;

public class boy extends girl {
	@Override
	public void girl1() {
		System.out.println(12);
		super.girl1();
	}

	@Override
	public void girl2() {
		System.out.println(111);
		super.girl2();
	}

	public static void main(String[] args) {
		girl abcd = new girl();
		abcd.girl1();
		abcd.girl2();
		
	}
}
