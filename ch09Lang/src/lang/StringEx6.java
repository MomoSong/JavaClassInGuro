package lang;

public class StringEx6 {

	public static void main(String[] args) {

		int iVal = 100;
		// 문자열로 변환하자
		String strVal = String.valueOf(iVal);
		System.out.println(strVal + 200);
		strVal = "" + 100;
		System.out.println(strVal);
		// strVal -> int, long
		System.out.println(Integer.valueOf(strVal) + 200);
		System.out.println(Long.valueOf(strVal) + 200);
		System.out.println(Integer.parseInt(strVal) + 200);
		System.out.println(Long.parseLong(strVal) + 200);
		System.out.println(Double.valueOf(strVal) + 200);
		

	}

}
