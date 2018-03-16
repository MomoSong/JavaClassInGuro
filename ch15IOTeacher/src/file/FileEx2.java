package file;

import java.io.File;

/**
 * 폴더에 있는 내용을 출력해 보자.
 * @author hong
 *
 */
public class FileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 경로 지정
		String path = "D:\\workspace\\java\\ch15IO";
		// File 객체로 만든다.
		File f = new File(path);
		System.out.println(f.exists());
		// 폴더인지 파일인지 출력
		if(f.isFile()) System.out.println("파일입니다.");
		else System.out.println("폴더입니다."); 
		// 폴더 안에 있는 모든 내용을 출력해보자. 폴더이면 [폴더] 형식으로 쓰자.
		File[] files = f.listFiles();
		for(int i=0;i<files.length;i++) {
			// 파일 객체의 이름을 가져오자.
			String fileName = files[i].getName();
			// 만약에 폴더이면 []를 붙여 출력.
			System.out.println(
				(files[i].isDirectory()?"["+fileName+"]":fileName));
		}
		for(File fn : files )
			System.out.println
			(fn.isDirectory()?"["+fn.getName()+"]":fn.getName());
	}

}
