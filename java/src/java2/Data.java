package java2;

public class Data {
	
	//개인정보 저장
	public String name = "송근모";
	String hp = "010-5579-9262";
	//다른 프로그램은 못 건드린다.
	private String job = "학생";
	//job을 데이터 가져가는 용도로만 사용할 수 있다. getter를 만든다.
	public String getjob() {
		return job;
	}
	
	public String getHp() {
		return hp;
	}
	
	
	
	
}
