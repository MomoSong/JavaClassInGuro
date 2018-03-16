package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// InputStream : 바이트 기반 -> Reader : 문자 기반으로 처리
		String fileName = "test.txt";
//		FileInputStream fis = new FileInputStream(fileName);
		FileReader fr = new FileReader(fileName);
		
		int data = 0;
		while((data=fr.read()) != -1)
			System.out.print((char)data);
		fr.close();
		
	}

}
