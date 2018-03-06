package com.webjjang.util;

import java.util.Scanner;

public class InUtil {
	private static Scanner scanner = new Scanner(System.in);

	public static String getString() {
		return scanner.nextLine();
	}

	public static String getMenu(String str) {
		System.out.print(str + ":");
		return getString();
	}

	public static String getMenu(String menu, String str) {
		System.out.println("\n" + menu);
		return getMenu(str);
	}

	// 단순히 숫자만 입력 받아 리턴한다
	// 숫자가 아닌 데이터가 들어오면 예외처리 해야한다.
	public static int getInt() throws Exception {
		return Integer.parseInt(getString());
	}
	//입력 데이터 항목 이름과 함께 숫자가 아닌 데이터가 들어오면 예외처리한다.
	public static int getInt(String str) throws Exception {
		return Integer.parseInt(getMenu(str));
	}

	// 숫자가 아닌 데이터가 들어오면 숫자를 입력해야 합니다.를 출력하고 다시 입력 받는다.
	public static int getIntWithCheck(String str) {
		while(true) {
			//숫자를 받아서 리턴한다.
			try {
				return getInt(str);
			} catch (Exception e) {
				e.printStackTrace();
				//숫자형식에 안 맞는 경우.
				System.out.println("숫자[0-9]를 입력하세요");
			}
			
			//리턴한다.
		}
	}
}
