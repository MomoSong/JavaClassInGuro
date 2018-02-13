
public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		System.out.println(add(a, b));
	}
	
	public static int add(int x, int y) { 
		System.out.println("Add(int, int");
		return x+y;
	}
	public static long add(long x, long y) { 
		System.out.println("Add(long, long");
		return x+y;
	}
	
	
	
}
