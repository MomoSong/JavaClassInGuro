package serialize;

import java.io.Serializable;

/**
 * 객체를 String으로 저장했다가 다시 객체로 받아 낼때 사용하는 프로그램 
 * Seralizable 인터페이스를 상속 받아서 작성한다.
 * @author hong
 *
 */
public class UserInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// 저장하는 변수 선언
	String name, password; int age;


	// 기본 값을 셋팅하는 기본 생성자 - 사용자 알수 없음.
	public UserInfo() {
		this("Unknown", "1111", 0);
	}


	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}


	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	

}
