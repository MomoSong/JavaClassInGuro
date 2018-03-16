package file;

import java.io.File;
import java.util.Scanner;

public class FileEx4 {

	public static void main(String[] args) {
		System.out.println("삭제할 파일을 폴더와 함께 입력하시오.");
		String pathname = new Scanner(System.in).nextLine();
		
		//입력 받은 문자열을 이용해서 파일 객체를 만든다.
		File f = new File(pathname);
		if(f.exists()) {
			System.out.println(f.delete() ? "삭제 성공" : "삭제 실패");			
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
