package lang;

public class StringEx7 {

	public static void main(String[] args) {

		//파일명 폴더와 함께 지정
		String fullName = "Hello.java";
		//.의 위치를 찾아보자.
		int index = fullName.indexOf(".");
		System.out.println(index);
		//파일명.확장자 -> 파일명만 찾아보자.
	    System.out.println(fullName.substring(0, index));
	    System.out.println(fullName.substring(index+1));
	    

	}

}
