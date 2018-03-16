package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//파일을 읽어올 객체를 생성
		FileInputStream fis = new FileInputStream("in.txt");
		FileOutputStream fos = new FileOutputStream("out.txt");
		int data = 0;// 데이터를 읽어서 넣어주는 임시 변수.
		
		while ((data = fis.read()) != -1) {
			char c =(char)data;
//			System.out.print(c);
			fos.write(c);
		}
		System.out.println("파일쓰기 성공");
		fis.close();fos.close();
	}

}
