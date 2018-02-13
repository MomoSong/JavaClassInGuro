
public class FacFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int fac = 1;
		
		for(int i = a; i >= 1; i--) {
			fac *= i;
		}
		
		System.out.println(fac);
		
		System.out.println(a+"!="+factorial(a));
	}
	
	static int factorial(int n) {
		if(n==1) return 1;
		return n * factorial(n-1);
	}
}
