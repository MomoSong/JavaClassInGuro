package enum1;

public class EnumEx2 {

	public static void main(String[] args) {
		Direction1 d1 = Direction1.EAST;
		System.out.println(d1.name());
		System.out.println(d1.getValue() + ", " + d1.getSymbol());
		System.out.println(Direction1.values());
		for (Direction1 d : Direction1.values()) {
			System.out.println(d);
		}
	}

}

enum Direction1 {
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

	// 초기값을 넣어서 저장하는 변수
	private final int value;
	private final String symbol;

	// 생성자 선언 -> final 변수 초기화
	private Direction1(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}

	// 값을 가져가는 메서드 선언 -> 변수가 private
	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}

	public String toString() {
		return name() + "(" + getSymbol() + ")";
	}

}