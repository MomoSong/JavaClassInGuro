package lang;

public class StringBufferEx2 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("01");
		System.out.println(sb);
		for (int i = 1; i <= 10; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		// System.out.println(sb.delete(3, 6));

		String s = sb.toString();
		System.out.println(s);
		s = s.substring(0, 3) + s.substring(6);
		System.out.println(s);

	}

}
