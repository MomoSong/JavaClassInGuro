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
	    
	    System.out.println("-----------------------------------");
	    fullName = "d:\\a.b.c\\d.e.f.txt";
	    int lastIndex = fullName.lastIndexOf(".");
	    System.out.println(fullName.substring(lastIndex+1));
	    System.out.println(fullName.indexOf("."));
	    
	    System.out.println("-----------------------------------");
	    fullName = "c:\\a...cb.d..d.\\.d.fd..vc..java";
	    System.out.println(findFileType(fullName));
	    
	    System.out.println(fullName.indexOf("\\",  7));
	    System.out.println("-----------------------------------");
	    int[] score = {100, 90, 85};
	    for(int i = 0; i < score.length; i++) {
	    	System.out.println(score[i]);
	    }
	    
	    System.out.println("-----------------------------------");
	    String name = "Lee Young Hwan";
	    System.out.println(name.length());
	    System.out.println(name);
	    
	    System.out.println("-----------------------------------");
	    //한글자씩 출력
//	    for(int i = 0; i < name.length(); i++) {
//	    	System.out.println(name.charAt(i));
//	    }
	    
	    
	    
	}
	
	public static String findFileType(String s) {
		int beginIndex = s.lastIndexOf("\\")+1;
		int endIndex = s.lastIndexOf(".");
		return s.substring(beginIndex, endIndex);
	}

}
