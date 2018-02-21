package interface3;
/*
 * interface 안에 선언되어 있는 메서드는 추상 메서드 이기 때문에 모두 재정의
 * 해서 사용해야 한다. 
 * 자바 8부터 클래스에서 필요없는 메서드인 경우 기본 메서드를 사용하도록
 * 정의할 수 있다. default키워드
 */

public class DefaultMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface m = new MyImpl();
		m.method1();
		m.method2();
		MyInterface.method3();
		System.out.println(MyInterface.name);
	}
}

interface MyInterface{
	//꼭 재정의 사용해야 하는 추상 메서드 선언
	void method1();
	//default method를 만들어서 필요없으면 재정의 하지 않는다.
	default void method2() {
		System.out.println("인터페이스 Default method2");
	}
	//static을 붙이면 생성과는 상관이 없어서 interface에 선언해 사용가능
	static void method3() {
		System.out.println("인터페이스의 static method3");
	}
	//interface의 변수는 기본적으로 static final이다.
	String name = "이영환";
}

class MyImpl implements MyInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("클래스의 method1");
	}
}






