package abstract1;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisClassA a = new ThisClassA();
		SuperClass s = a; // 자동형변환
		a = (ThisClassA) s; // 강제 형변환
		a.add(10, 20);
		a.print();
		ThisClassB b = new ThisClassB();
		b.add(30, 40);
		b.print();

		execute(10, 20, new ThisClassA());
		execute(30, 40, new ThisClassB());
		execute(100, 200, new ThisClassC());
		// b = (ThisClassB)s; 실행할때 오류남
	}

	// 개별적인 클래스를 공통으로 실행하는 메서드
	public static void execute(int a, int b, SuperClass s) {
		if (s instanceof ThisClassA)
			System.out.println("A");
		if (s instanceof ThisClassB)
			System.out.println("B");
		if (s instanceof ThisClassC)
			System.out.println("C");
		if (s instanceof SuperClass)
			System.out.println("S");

		s.add(a, b);
		s.print();
	}
}

// 부모 클래스
abstract class SuperClass {
	// 공통
	int a, b, sum;

	// 공통으로 사용하는 메서드
	public void add(int a, int b) {
		this.a = a;
		this.b = b;
		sum = this.a + this.b;
	}

	// 개별적으로 사용되는 출력 메서드 --> 자식 클래스가 선언해서 사용하자.
	public abstract void print(); 
}

class ThisClassA extends SuperClass {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(sum);
	}

}

class ThisClassB extends SuperClass {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("sum=" + sum);
	}

}

class ThisClassC extends SuperClass {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(a + "+" + b + "=" + sum);
	}

}
