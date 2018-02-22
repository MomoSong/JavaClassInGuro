package exception;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class AutoCloseEx1 {

	public static void main(String[] args) {
		//파일을 읽기 위한 객체
		//선언만 했으므로 주소 저장하는 공간에 주소 없음
//		FileInputStream fis = null; //파일만 입력
//		DataInputStream dis = null; //데이터를 입력
		try(FileInputStream fis = new FileInputStream("score.dat");
			DataInputStream dis = new DataInputStream(fis);) {
			System.out.println("파일을 찾았습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
