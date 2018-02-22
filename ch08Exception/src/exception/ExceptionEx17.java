package exception;

public class ExceptionEx17 {

	public static void main(String[] args) {
		try {
			method1();
			method2(); //method1이 반드시 실행 된 후에 실행됨	
		}catch(Exception e) {
			System.out.println("main catch");
			System.out.println(e.getMessage());
		}
	}
	
	static void method1() throws Exception{
		try {
			System.out.println("method1()");
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
//			throw e;
			throw new Exception("처리하다 오류가 남.");
		}
	}
	
	static void method2() {
		System.out.println("method2()");
	}

}
