package exception;

public class ExceptionEx12 {

	public static void main(String[] args) {

		int score = -100;
		try {
			// 1. 점수의 범위를 확인한다. 0 - 100 점까지
			checkArea(score);
			// 2. 평점을 계산한다.
			getGrade(score);
			// 3. 출력한다.
			print(score);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	// 1. 점수의 범위를 확인하는 메서드
	public static void checkArea(int x) throws Exception {
		System.out.println("1. checkArea()");
//		try {
			if(x < 0 || x > 100)
				throw new Exception("점수 범위 벗어남");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
	}

	// 2. 평점을 계산하는 메서드
	public static void getGrade(int x) {
		System.out.println("2. getGrade()");
	}

	// 3. 출력을 하는 메서드
	public static void print(int x) {
		System.out.println("3. print()");
	}

}
