package exception;

public class ExceptionEx9 {

	public static void main(String[] args) {
		Exception e = new Exception("예외 생성");
		// 예외 내용 확인을 위해 작성 --> 개발자를 위해서
		// e.printStackTrace();
		// 생성된 예외 객체를 던진다.
		try {
			throw e;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			int score = 100; // 점수를 잘 못 입력
			// 0 - 100 사이의 점수가 아니면 오류
			if (score < 0 || score > 100)
				throw new Exception("점수의 범위를 벗어남");
			// 평점 계산
			// 출력
			System.out.println("점수 출력" + score);
		} catch (Exception e1) {
			// 0 - 100 점 일때 오류 처리
			System.out.println("잘못된 점수 입니다.");
			e1.printStackTrace();
		}
	}

}
