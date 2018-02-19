package finaltest;

class Card{
	final int NUMBER;
	final String KIND;
	static int width= 100;
	static int height= 250;
	
	Card(int number, String kind){
		this.NUMBER = number;
		this.KIND = kind;
		
	}
	
	Card(){
		this(1, "HEART");
	}
	
	final public String toString() {
		return KIND + " " + NUMBER;
	}
	
}

public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card(10, "HEART");
//		c.NUMBER = 5; //에러. final 변수 변경 불가
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}

//카드를 상속 받아서 특별한 카드 선언
class Scard extends Card{
	
}
