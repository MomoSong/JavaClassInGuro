package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//TestInfo annotation 객체로 사용하기 위해서 @TestInfo 어노테이션 선언한다.
@TestInfo(testedBy="aaa", testDate = @DateTime(hhmmss = "180101", yymmdd = "235959"))
public class AnnotationEx5 {

	public static void main(String[] args) {
		Class<AnnotationEx5> cls = AnnotationEx5.class;
		
		//cls에 있는 TestInfo.class관련된 annotation정보를 가져오는 처리 
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println(anno);
		System.out.println(anno.testedBy());
	}

}

//annotation 정의 -> @interface
//@Retention을 이용해서 실행할때 사용이 가능하도록 해줘야 정보를 가져올 수 있다. 아니면 null
@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
	//default 값이 있으면 추상 메서드를 호출할 때 나오는 값을 지정하지 않고 사용 가능
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

//annotation 정의 -> @interface

//default 값을 지정하지 않으면 추상 메서드를 호출할 때 나오는 값을 반드시 지정해야 한다
@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
	String yymmdd();
	String hhmmss();
}

enum TestType{ FIRST, FINAL }