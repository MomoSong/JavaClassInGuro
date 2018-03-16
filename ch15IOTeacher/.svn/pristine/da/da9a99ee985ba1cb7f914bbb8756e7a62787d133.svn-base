package com.webjjang.util;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileNonOverlapTest {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String sPathName = "D:\\workspace\\java\\ch15IO\\in.txt";
		String path = "d:\\upload\\board";
		String fileName 
		= sPathName.substring(sPathName.lastIndexOf(File.separator)+1);
		String tPathName = path+File.separator+fileName;
		System.out.println(tPathName);
		for(int i =1; i<= 10 ; i++) {
			System.out.println("파일을 올립니다. 엔터를 치세요.");
			scanner.nextLine();
			// 중복이 안되는 파일명 찾기
			String pathName = FileUtil.getNonOverlapName(tPathName);
			System.out.println(pathName);
			FileUtil.copy(sPathName, pathName);
		}
	}

}
