package inner;

public class InnerEx1 {
	//InnerEx1을 생성해서 사용하면 InstanceInner를 생성해 놓는다.
	InstanceInner inner = new InstanceInner();

	public static void main(String[] args) {
		System.out.println(InstanceInner.COUNT);
		// InstanceInner.COUNT = 500; //오류
		System.out.println(StaticInner.cv);
		StaticInner.cv = 1000;
	}

	// 생성을 해서 사용해야 하는 클래스
	class InstanceInner {
		int iv = 100;
		// static int cv = 200;
		static final int COUNT = 300;
	}

	// static 클래스
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}

}
