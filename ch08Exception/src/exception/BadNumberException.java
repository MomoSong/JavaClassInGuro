package exception;

public class BadNumberException extends Exception {

	/**
	 * 숫자의 범위가 벗어나는 경우 발생시키는 예외객체
	 */
	private static final long serialVersionUID = 1L;
	
	//사용예 : new BadNumberException();
	public BadNumberException() {
		super("숫자의 범위를 벗어났습니다.");
	}
	
	//사용예 : new BadNumberException("숫자의 범위를 벗어났습니다.");
	public BadNumberException(String message) {
		super(message);
	}
}
