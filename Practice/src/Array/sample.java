package Array;

public class sample {
	public sample() {
		this(10);
		System.out.println("i am in constructor");
	}

	public sample(int i) {
		this(23.23f);
		System.out.println("am integer constructor");
	}

	public sample(float f) {
		System.out.println("am float constructor");
	}

	public static void main(String[] args) {
		sample s = new sample();
	}
}