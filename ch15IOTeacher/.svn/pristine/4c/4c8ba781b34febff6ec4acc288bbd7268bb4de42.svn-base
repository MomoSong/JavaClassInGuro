package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * 배열을 전송하는 프로그램
 * @author 이영환
 *
 */
public class IOEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte 배열을 전송
		byte[] inSrc = {0,1,2,3,4,5};
		byte[] outSrc = null;
		
		ByteArrayInputStream input 
		= new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output
		= new ByteArrayOutputStream();
		
		int data = 0; // 데이터를 읽어서 넣어주는 임시 변수.
		// 데이터가 있는 만큼 읽어서 저장하는 반복문
		while ((data=input.read()) != -1) { // 데이터가 있으면, 없으면 -1
			output.write(data);
		}
		
		outSrc = output.toByteArray();
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
	}

}
