

public class OperatorEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 10;
		int n = -10;
		int r = p&n;

		System.out.println(p + "(" 
		+ Integer.toBinaryString(p) + ")");
		
		System.out.println(n + "(" 
				+ Integer.toBinaryString(n) + ")");
		
		System.out.println(r + "(" 
				+ Integer.toBinaryString(r) + ")");
		
		System.out.println((r<<2) + "(" 
				+ Integer.toBinaryString(r<<2) + ")");
		
	}

}
