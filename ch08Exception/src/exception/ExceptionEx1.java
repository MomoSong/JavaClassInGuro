package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// System.out.println(10/0); //try 밖 - 예외처리 안함
		try {
			// 정상처리
			String n = "W10";
			int x = Integer.parseInt(n);
			// int[] a = new int[3];
			// a[3] = 10;
			// System.out.println(10/0);
			System.out.println("첫번째 try");
		} catch (ArithmeticException e) {
			// 예외처리
			System.out.println("첫번째 try에 대한 ArithmeticException catch");
			// 예외가 발생된 경로와 내용을 보여준다. -> 개발자에게 꼭 필요.
			e.printStackTrace();
			// 예외 내용만 보고 싶다.
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첫번째 try에 대한 ArrayIndexOutOfBoundsException catch");
			// 예외가 발생된 경로와 내용을 보여준다. -> 개발자에게 꼭 필요.
			e.printStackTrace();
			// 예외 내용만 보고 싶다.
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// 예외처리
			System.out.println("첫번째 try에 대한 Exception catch");
			// 예외가 발생된 경로와 내용을 보여준다. -> 개발자에게 꼭 필요.
			e.printStackTrace();
			// 예외 내용만 보고 싶다.
			System.out.println(e.getMessage());
		} finally { // 항상 실행된다.
			System.out.println("첫번째 try에 있는 finally");
			System.out.println("여기는 항상 실행이 된다.");
		}
		System.out.println("첫번째 try의 밖 - 아래 쪽");

	}

}
