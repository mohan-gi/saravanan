package String;

public class UpperorLower {

	public static void main(String[] args) {
		String s = "moHAN raJ is the goOD BOy";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String m = "Mohan resigned the job";
		System.out.println(m.substring(3));
		System.out.println(m.substring(2, 9));
		System.out.println(m.startsWith("Mohan"));
		System.out.println(m.subSequence(2, 9));

		System.out.println(s.indexOf("m"));
		System.out.println(s.lastIndexOf("o"));

		System.out.println(m.replace("the", "a"));

		String a = "";
		System.out.println(a.isEmpty());
		System.out.println(s.isEmpty());

		System.out.println(m.startsWith("Mohan"));
		System.out.println(m.endsWith("job"));

		System.out.println(System.identityHashCode(m));
		System.out.println(System.identityHashCode(m));

		String x = new String("Mohan is a very bad boy");
		String X1 = new String("Mohan is a very bad boy");

		System.out.println(System.identityHashCode(X1));
		System.out.println(System.identityHashCode(x));

		System.out.println(m.length());

		String[] abc = m.split(" ");
		System.out.println(abc.length);

		String ab = "Mohan";
		for (String zyx : abc) {
			if (zyx.equals(ab)) {
				continue;
			} else {
				System.out.println(zyx);
			}
		}

	}
}
