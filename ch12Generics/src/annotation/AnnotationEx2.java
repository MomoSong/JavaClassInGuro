package annotation;

public class AnnotationEx2 {
	public static void main(String[] args) {
		//예전에 작성된 소스
		NewClass nc = new NewClass();
		nc.oldField = 10;
		System.out.println(nc.getOldField());
		
		
		
	}
}

//Annotation을 적용한 클래스 작성
class NewClass{
	//나중에 작성된 소스 : oldField 대신에 사용한다.
	int newField;
	int getNewField() {
		return newField;
	}
	int oldField;
	int getOldField() {
		return oldField;
	}
}