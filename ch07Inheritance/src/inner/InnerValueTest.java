package inner;

import inner.InnerEx1.InstanceInner;

public class InnerValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InnerEx1.InstanceInner.COUNT);
		System.out.println(InnerEx1.StaticInner.cv);
		InnerEx1.StaticInner.cv = 1000;
		System.out.println(InnerEx1.StaticInner.cv);
		
		//1.Inner class를 포함하고 있는 클래스를 먼저 생성한다.
		InnerEx1 ex1 = new InnerEx1();
		//2.Inner class를 생성한다.
		InstanceInner inner = ex1.new InstanceInner();
		System.out.println(inner.iv);
		//3.InnerEx1에 InstanceInner를 생성해 놓은 경우
		System.out.println(ex1.inner.iv);
		
//		InnerEx1.InstanceInner myTest = new InnerEx1().new InstanceInner();
//		System.out.println(test.iv);
	}

}
