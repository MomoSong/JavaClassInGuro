package serialize;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 객체를 저장하거나 통신을 통해서 전달하고자 할때 직렬화를 해서 사용한다.
 * 직렬화된 저장 객체를 선언해서 사용한다.
 * @author hong
 *
 */
public class SerialEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "UserInfo.ser"; // 직렬화 시킨 객체를 저장할 파일 선언
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ObjectOutputStream out = new ObjectOutputStream(bos);
		
		// 객체를 생성해서 컬렉션 객체에 저장한다.
		UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
		UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
		
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(u1); list.add(u2);
		
		// 객체를 직렬화해서 파일로 저장한다.
		out.writeObject(u1);
		out.writeObject(u2);
		out.close();
		System.out.println("직렬화가 잘 끝났습니다.");
	}

}
