package com.webjjang.util;

import java.util.Scanner;

public class KeyWordUtil {
	private static Scanner scanner = new Scanner(System.in);

	static String keywords;
	static int nums;
	
	// 키워드 받는 getter , setter
	public static String getKeyword() {
		return keywords;
	}

	public static void setKeyword(String keyword) {
		keywords = keyword;
	}

	// 뉴스보기용 번호 받는 getter, setter
	public static int getNum() {
		return nums;
	}

	public static void setNum(int num) {
		KeyWordUtil.nums = num;
	}
	
//////////////////////////////////////////////////////	
	

	
}
