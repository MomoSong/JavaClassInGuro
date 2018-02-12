/**
 * 변수를 이용한 데이터 처리와 printf()로 데이터 출력하기
 */

public class PrintfEx1 {
	static byte bb; //전역변수(=멤버변수) - 초기값이 없으면 기본값
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1; //지역변수 - 반드시 초기값 셋팅
		System.out.println(b);
		System.out.println(bb);
		System.out.printf("b = %d%n", b);
		short s = 2; //2byte
		System.out.printf("s = %d%n", s);
		s = (short)(b + s);
		System.out.printf("s =  %d%n", s);
		char c = 'A';
		System.out.printf("c = %c, %d %n", c, (int)c);
		int finger = 10;
		System.out.printf("finger = [%5d] %n", finger);
		long big = 100_000_000_000L;
		System.out.printf("big =  %d%n", big);
		long hex = 0xFFF_FFF_FFF_FFFL;
		System.out.printf("hex =  %d%n", hex);
		System.out.printf("hex =  %x%n", hex);
		System.out.printf("hex =  %#x%n", hex);
		
	}

}
