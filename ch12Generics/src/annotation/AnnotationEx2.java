package annotation;

import java.util.ArrayList;

public class AnnotationEx2 {
	public static void main(String[] args) {
		//예전에 작성된 소스
		NewClass nc = new NewClass();
		nc.oldField = 10;
		System.out.println(nc.getOldField());
		
		@SuppressWarnings({"rawtypes", "unchecked"})
		ArrayList<NewClass> list = new ArrayList();
		list.add(nc);
		
		
	}
}

//Annotation을 적용한 클래스 작성
class NewClass{
	//나중에 작성된 소스 : oldField 대신에 사용한다.
	int newField;
	int getNewField() {
		return newField;
	}
	@Deprecated
	int oldField;
	@Deprecated
	int getOldField() {
		return oldField;
	}
}