package lang;

public class StringEx1 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		if (str1 == str2) {
			System.out.println("str1과 str2는 같다.");
		}
		System.out.println(str1.hashCode() + ", " + str2.hashCode());
		str2 = "def";
		System.out.println(str1.hashCode() + ", " + str2.hashCode());

		System.out.println("------------------------------------------");
		String str3 = new String("abc");
		if (str1 == str3) {
			System.out.println("==비교 str1과 str3은 같다.");
		} else {
			System.out.println("==비교 str1과 str3은 다르다.");
		}
		System.out.println(str1.hashCode() + ", " + str3.hashCode());
		System.out.println(str1.toString() + ", " + str3);
		if (str1.equals(str3)) {
			System.out.println("equals str1과 str3은 같다.");
		} else {
			System.out.println("equals str1과 str3은 다르다.");
		}
		System.out.println("------------------------------------------");
		String str4 = new String("abc");		
		if (str3 == str4) {
			System.out.println("==비교 str3과 str4은 같다.");
		} else {
			System.out.println("==비교 str3과 str4은 다르다.");
		}
		System.out.println(str3.hashCode() + ", " + str4.hashCode());
		System.out.println(str3.toString() + ", " + str4);
		if (str3.equals(str4)) {
			System.out.println("equals str1과 str3은 같다.");
		} else {
			System.out.println("equals str1과 str3은 다르다.");
		}
		

	}

}
