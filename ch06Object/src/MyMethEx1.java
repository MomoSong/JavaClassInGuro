

import java.util.Scanner;

public class MyMethEx1 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = getIntWithMsg("첫번째 숫자");
		int num2 = getIntWithMsg("두번째 숫자");
		
		int sum = add(num1, num2);
		
		print(num1, "+", num2, sum);

	}
	
	static void print(int x,String code, int y, int z) {
		System.out.println(x + code + y + " = " + z);
	}

	// static method sum()
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	//문자열 받아 내는 프로그램 작성
	static String getString() {
		return scanner.nextLine();
	}
	
	//메시지와 함게 문자열을 받아내는 프로그램 작성
	static String getStringWithMsg(String msg) {
		System.out.print(msg + " -> ");
		return getString();
	}
	
//숫자를 받아내는 프로그램 작성 -> 문자열을 받아서 Integer.parseInt()
	static int getInt() {
		String str = getString();
		return Integer.parseInt(str);
	}
//	문자를 받아서 표시하고 숫자를 받아내는 프로그램 작성
	static int getIntWithMsg(String msg) {
		String str = getStringWithMsg(msg);
		return Integer.parseInt(str);
	}
	
}
