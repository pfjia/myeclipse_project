package domain;

class Holder<T> {

}

class H extends Holder {

}

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// List<Character> l = new ArrayList<Character>(Arrays.asList('1', '2',
		// '3', '4'));
		// System.out.println(l);
		// List<Character> l2 = new ArrayList<Character>(l);
		// System.out.println(l2);

		// Object[] os = new Object[1];
		// os[0] = "1";
		//
		// String[] ss = new String[1];
		// ss[0] = (String) os[0];
		//
		// ss = (String[]) os;
		//
		// int i = Integer.MAX_VALUE;
		//
		// byte c = 9;
		//
		// c = (byte) i;
		// System.out.println(c);

		String s = "123";
		String s3 = "123";
		String s2 = new String("123");
		System.out.println(s == s3);

	}
}
