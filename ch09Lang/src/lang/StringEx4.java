package lang;

public class StringEx4 {

	public static void main(String[] args) {
		
		String[] hp = {"010", "6324", "5873" };
		String hpStr = String.join("-", hp);
		System.out.println(hpStr);
		
		String[] arr = hpStr.split("-");
		for(String s : arr) {
			System.out.println(s);
		}

	}

}
