package file;

import java.io.File;
import java.io.IOException;

/**
 * 파일의 특정 정보를 알아내는 프로그램
 * @author 이영환
 *
 */
public class FileEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String pathName 
		="D:\\workspace\\java\\ch15IO\\src\\file\\FileEx1.java";
		File f = new File(pathName);
		System.out.println(f.exists());
		System.out.println("파일명:"+f.getName());
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		System.out.println("파일명만:"+fileName.substring(0, pos));
		System.out.println("확장자만:"+fileName.substring(pos+1));
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.getCanonicalPath());
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}

}
