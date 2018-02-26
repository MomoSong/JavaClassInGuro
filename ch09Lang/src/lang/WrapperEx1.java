package lang;

public class WrapperEx1 {

	public static void main(String[] args) {

		int source = 100;
		Integer i = new Integer(source);
		Integer i2 = new Integer(source);
		System.out.println(source + ", " + i + ", " + i2);
		System.out.println(source==i);
		System.out.println(i==i2);
		System.out.println(i.equals(i2));
		System.out.println(i.equals(source));
		source = i; //언박싱
		i = source; //오토박싱
		System.out.println(i.MAX_VALUE);
		System.out.println(i.MIN_VALUE);

	}

}
