import java.io.File;

public class FileIOEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\workspace\\java\\ch15IO";
		File f = new File(path);
		System.out.println(f.exists());
		
		if(f.isFile()) System.out.println("파일입니다.");
		else System.out.println("폴더입니다.");
		
		
		
	}

}
