package com.webjjang.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1. 문자열을 받아서 File 객체를 만든다.
 * 2. 파일이 존재하는지 물어본다.
 * 3. 존재하지 않으면 File 이름을 String으로 리턴한다.
 * 4. 존재하면 file이름과 확장자를 분리하고 파일 이름을 file이름  + 증가값 + "."
 *    + 확장자로 만들어서 File 객체를 다시 만들고 2번 부터 다시 실행한다.
 * @author hong
 *
 */
public class FileUtil {
	public static String getNonOverlapName(String pathName) {
		File f = new File(pathName); // 대상이된 원본 파일
		String dir = f.getParent();
		String fileName = f.getName();
		System.out.println();
		String firstName 
		= fileName.substring(0, fileName.lastIndexOf("."));
		String lastName  // "."을 포함한 확장명
		= fileName.substring(fileName.lastIndexOf("."));
		File testFile = f;
		int count = 1;
		while(true) { // 중복이 되지 않을 때 까지 무한 반복
			if(!testFile.exists()) 
			{ return testFile.getAbsolutePath();}
			else { // 중복이 된느 경우 경로, 파일명, 확장명을 분리한다.
				String newFileName
				= dir+File.separator 
				  +firstName+ count++ + lastName;
				testFile = new File(newFileName);
			};
		}
	}
	
	public static void copy(String source, String target) 
			throws IOException {
		// TODO Auto-generated method stub

		//파일을 읽어올 객체를 생성
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		int data = 0;// 데이터를 읽어서 넣어주는 임시 변수.
		
		while ((data = fis.read()) != -1) {
			char c =(char)data;
//			System.out.print(c);
			fos.write(c);
		}
		System.out.println("파일쓰기 성공");
		fis.close();fos.close();
	} // end of copy()

}
