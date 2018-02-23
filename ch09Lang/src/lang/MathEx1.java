package lang;
// java.lang의 클래스들은 import를 하지 않고 사용한다.
// 중복이되지 않는 메서드에 한해서 메서드를 import해서 사용할 수 있다.
//import static java.lang.Math.*;

public class MathEx1 {
	public static void main(String[] args) {
		
		double val = -90.7552;
		//음수에서 버림을 할때는 반드시 floor를 사용해야한다.
		//양수일 때의 버림은 int캐스팅으로 버려도된다.
		System.out.println(Math.floor(val));
		System.out.println((int)val);
		System.out.println(Math.round(val));
		
		
	}

}
