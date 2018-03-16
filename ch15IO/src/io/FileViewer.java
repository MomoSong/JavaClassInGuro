package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) throws IOException {
		
		//파일을 읽어올 객체를 생성
		FileInputStream fis = new FileInputStream("in.txt");
		FileOutputStream fos = new FileOutputStream("out.txt");
		int data = 0;
		
		while((data=fis.read()) != -1) {
			char c = (char)data;
//			System.out.print(c);
			fos.write(c);
		}
		System.out.println("파일쓰기 성공");
		fis.close();
		fos.close();

	}

}
