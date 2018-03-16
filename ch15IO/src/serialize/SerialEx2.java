package serialize;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serialize 해서 저장해 놓은 파일로 부터 객체를 불러온다.
 * 이때 객체가 동일해야한고 저장해 놓은 순서가 같아야 한다.
 * @author hong
 *
 */
public class SerialEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "UserInfo.ser";//직렬화 시킨 객체를 저장해 놓은 파일선언
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		ObjectInputStream in = new ObjectInputStream(bis);
		
		// 저장해 놓은 직렬화 객체를 하나씩 읽어온다.
		UserInfo u1 = (UserInfo)in.readObject();
		UserInfo u2 = (UserInfo)in.readObject();
		
		System.out.println(u1);
		System.out.println(u2);
		
		in.close();

	}

}
