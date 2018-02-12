package ch06Object;

import java.util.Scanner;

//두수를 받아 더하는 프로그램, 함수를 이용하여 작성
public class myMethEx2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = getStringToInt("첫 번째 숫자를 입력하세요");
		int num2 = getStringToInt("첫 번째 숫자를 입력하세요");

		System.out.println(printSum(num1, "+", num2, add(num1, num2)));

	}

	// 문장을 받아 출력하는 함수.
	static void print(String str) {
		System.out.print(str + "->");
	}

	// String을 받아 리턴하는 함수
	static String getString() {
		return scanner.nextLine();
	}

	// 문장을 출력하고 Scanner로 받은 String을 Int로 형변환하여 반환하는 함수
	static int getStringToInt(String str) {
		print(str);
		return Integer.parseInt(getString());
	}

	// 두수를 더하는 함수
	static int add(int a, int b) {
		return a + b;
	}

	// 더 해질 두개의 숫자와 연산자 String기호와 해답을 String으로 반환하는 함수
	static String printSum(int a, String code, int b, int z) {
		return a + code + b + " = " + z;
	}

}
