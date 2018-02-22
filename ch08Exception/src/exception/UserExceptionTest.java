package exception;

public class UserExceptionTest {

	public static void main(String[] args) {

		try {
			int score = -100;	
			if (score < 0 || score > 100)
				throw new BadNumberException();
			System.out.println("score="+score);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
