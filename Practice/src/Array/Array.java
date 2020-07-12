package Array;

public class Array {
	public static void main(String[] args) {
		int []num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		System.out.println(num[2]);

		int len = num.length;
		System.out.println(len);

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		for (int i : num) {
			System.out.println(i);
		}

	}

}
